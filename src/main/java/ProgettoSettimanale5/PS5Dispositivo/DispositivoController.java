package ProgettoSettimanale5.PS5Dispositivo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dispositivi")
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
}
