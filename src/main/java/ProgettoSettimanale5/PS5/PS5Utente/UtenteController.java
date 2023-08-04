package ProgettoSettimanale5.PS5.PS5Utente;


import org.springframework.beans.factory.annotation.Autowired;
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
    public List<Utente> getUtenti() {return utSrv.getUtenti();}

    @PostMapping
    public void addUtente(@RequestBody Utente utente){ utSrv.addUtente(utente);}
}
