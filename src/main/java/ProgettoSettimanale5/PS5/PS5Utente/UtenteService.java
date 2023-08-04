package ProgettoSettimanale5.PS5.PS5Utente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class UtenteService {

    private final UtenteRepository utenteRepositoryRep;

    @Autowired
    public UtenteService(UtenteRepository utRep) {this.utenteRepositoryRep = utRep;}

    @GetMapping()
    public List<Utente> getUtenti(){
        return utenteRepositoryRep.findAll();
    }

    public void addUtente(UtenteRequestPayload body) {
        utenteRepositoryRep.findByEmail(body.getEmail()).ifPresent(utente -> {
            throw new IllegalStateException("email exist");
        });
        Utente newUtente = new Utente(body.getUserName(), body.getNome(), body.getCognome(), body.getPassword(), body.getEmail());

//        if(utenteOptional.isPresent()){
//            throw new IllegalStateException("email exist");
//        }else{
//            utenteRepositoryRep.save(utentePayload);
//        }
    }
}
