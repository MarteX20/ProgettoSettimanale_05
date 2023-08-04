package ProgettoSettimanale5.PS5.PS5Utente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, Long> {

    @Query("SELECT u FROM Utente u WHERE u.email = ?1")
    Optional<Utente> findUtenteByEmail(String email);
}
