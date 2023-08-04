package ProgettoSettimanale5.PS5.PS5Utente;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name="utenti")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Utente {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String userName;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String cognome;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true)
    private String email;

    public Utente(String userName, String nome, String cognome, String password, String email) {
        this.userName = userName;
        this.nome = nome;
        this.cognome = cognome;
        this.password = password;
        this.email = email;
    }
}
