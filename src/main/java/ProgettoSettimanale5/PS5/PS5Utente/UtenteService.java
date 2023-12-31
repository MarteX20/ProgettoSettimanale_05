package ProgettoSettimanale5.PS5.PS5Utente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class UtenteService {

    private final UtenteRepository utenteRepository;

    @Autowired
    public UtenteService(UtenteRepository utRep) {this.utenteRepository = utRep;}

    public List<Utente> getUtenti(){
        return utenteRepository.findAll();
    }

    public void addUtente(Utente ut) {
        Optional<Utente> utenteOptional = utenteRepository.findUtenteByEmail(ut.getEmail());
        if(utenteOptional.isPresent()){
            throw new IllegalStateException("email exist");
        }
        utenteRepository.save(ut);


//        utenteRepository.findUtenteByEmail(body.getEmail()).ifPresent(utente -> {
//            throw new IllegalStateException("email exist");
//        });
//        utenteRepository.save(body);
    }

    public void deleteUtente(Long id) {
        utenteRepository.deleteById(id);
    }

    public Utente getUtenteById(Long id) {
        return utenteRepository.findById(id).orElse(null);
    }

    public Utente saveUtente(Utente utente) {
        return utenteRepository.save(utente);
    }
}
