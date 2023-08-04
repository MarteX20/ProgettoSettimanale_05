package ProgettoSettimanale5.PS5.PS5Dispositivo;

import ProgettoSettimanale5.PS5.PS5Utente.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DispositivoRepository extends JpaRepository<Dispositivo, Long> {

}
