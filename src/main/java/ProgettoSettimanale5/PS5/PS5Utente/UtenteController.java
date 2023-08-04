package ProgettoSettimanale5.PS5.PS5Utente;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/utenti")
public class UtenteController {

    private final UtenteService utSrv;

    @Autowired
    public UtenteController(UtenteService utSrv){
        this.utSrv = utSrv;
    }

    @GetMapping
    public ResponseEntity<List<Utente>> getAllUtenti() {
        List<Utente> utenti = utSrv.getUtenti();
        return new ResponseEntity<>(utenti, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Utente> getUtenteById(@PathVariable Long id) {
        Utente utente = utSrv.getUtenteById(id);

        if (utente != null) {
            return new ResponseEntity<>(utente, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void addUtente(@RequestBody Utente utente){ utSrv.addUtente(utente);}

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUtente(@PathVariable Long id) {
        utSrv.deleteUtente(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Utente> updateUtente(@PathVariable Long id, @RequestBody Utente utente) {
        Utente existingUtente = utSrv.getUtenteById(id);
        if (existingUtente != null) {
            utente.setId(id);
            Utente updatedUtente = utSrv.saveUtente(utente);
            return new ResponseEntity<>(updatedUtente, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
