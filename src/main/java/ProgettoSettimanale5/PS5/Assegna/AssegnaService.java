package ProgettoSettimanale5.PS5.Assegna;


import ProgettoSettimanale5.PS5.PS5Dispositivo.Dispositivo;
import ProgettoSettimanale5.PS5.PS5Dispositivo.DispositivoService;
import ProgettoSettimanale5.PS5.PS5Dispositivo.StatoDispositivo;
import ProgettoSettimanale5.PS5.PS5Utente.Utente;
import ProgettoSettimanale5.PS5.PS5Utente.UtenteRepository;
import ProgettoSettimanale5.PS5.PS5Utente.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssegnaService {

    private final DispositivoService dispositivoService;
    private final UtenteService utenteService;

    @Autowired
    public AssegnaService(DispositivoService dispositivoService, UtenteService utenteService) {
        this.dispositivoService = dispositivoService;
        this.utenteService = utenteService;
    }

    public String assegnaDispositivo(Long utenteId, Long dispositivoId) {

        //----------------------------------------------------------------

//        //Controlla se il dispositivo esiste nel database
//        Dispositivo dispositivo = dispositivoService.getDispositivoById(dispositivoId);
//        if (dispositivo == null) {
//            return "Dispositivo non trovato.";
//        }
//
//        //----------------------------------------------------------------
//
//        //Controlla se il dispositivo è in manutenzione
//        if (dispositivo.getStato() == StatoDispositivo.IN_MANUTENZIONE) {
//            return "Il dispositivo è in manutenzione e non può essere assegnato.";
//        }
//
//        //----------------------------------------------------------------
//
//        // Controlla se il dispositivo è già assegnato all'utente corrente
//        if (dispositivo.getStato() == StatoDispositivo.ASSEGNATO && dispositivo.getUtente() != null && dispositivo.getUtente().getId().equals(utenteId)) {
//            return "Il dispositivo è già assegnato all'utente.";
//        }
//
//        //----------------------------------------------------------------
//
//        // Controlla se l'utente esiste nel database
//        Utente utente = utenteService.getUtenteById(utenteId);
//        if (utente == null) {
//            return "Utente non trovato.";
//        }
//
//        //----------------------------------------------------------------
//
//        // Assegna il dispositivo all'utente e cambia il suo stato a "ASSEGNATO"
//        dispositivo.setUtente(utente);
//        dispositivo.setStato(StatoDispositivo.ASSEGNATO);
//        dispositivoService.saveDispositivo(dispositivo);

        return "Dispositivo assegnato con successo all'utente.";

    }
}
