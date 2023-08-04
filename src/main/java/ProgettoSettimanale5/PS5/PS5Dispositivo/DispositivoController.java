package ProgettoSettimanale5.PS5.PS5Dispositivo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dispositivi")
public class DispositivoController {

    public final DispositivoService dispSrv;

    @Autowired
    public DispositivoController(DispositivoService dispSrv) {
        this.dispSrv = dispSrv;
    }

    @GetMapping
    public List<Dispositivo> getDispositivi() {
        return dispSrv.getDispositivi();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Dispositivo> getDispositivoById(@PathVariable Long id) {
        Dispositivo dispositivo = dispSrv.getDispositivoById(id);

        if (dispositivo != null) {
            return new ResponseEntity<>(dispositivo, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Dispositivo> updateDispositivo(@PathVariable Long id, @RequestBody Dispositivo dispositivo) {
        Dispositivo existingDispositivo = dispSrv.getDispositivoById(id);
        if (existingDispositivo != null) {
            dispositivo.setId_dispositivo(id);
            Dispositivo updatedDispositivo = dispSrv.saveDispositivo(dispositivo);
            return new ResponseEntity<>(updatedDispositivo, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDispositivo(@PathVariable Long id) {
        dispSrv.deleteDispositivo(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PostMapping
    public ResponseEntity<Dispositivo> saveDispositivo(@RequestBody Dispositivo dispositivo) {
        Dispositivo savedDispositivo = dispSrv.saveDispositivo(dispositivo);
        return new ResponseEntity<>(savedDispositivo, HttpStatus.CREATED);
    }

}
