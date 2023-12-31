package ProgettoSettimanale5.PS5.PS5Utente;

import ProgettoSettimanale5.PS5.PS5Dispositivo.Dispositivo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name="utenti")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Utente {

    @OneToMany(mappedBy = "utente")
    @JsonIgnore
    private List<Dispositivo> dispAssegnato;

    @Id
    @SequenceGenerator(name = "utente_sequence", sequenceName = "utente_sequence", allocationSize = 1)
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
