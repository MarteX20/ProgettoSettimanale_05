package ProgettoSettimanale5.PS5.PS5Utente;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UtenteRequestPayload {
    private String userName;
    private String nome;
    private String cognome;
    private String password;
    private String email;
}
