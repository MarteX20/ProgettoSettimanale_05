package ProgettoSettimanale5.PS5.PS5Dispositivo;

import ProgettoSettimanale5.PS5.PS5Utente.Utente;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="dispositivi")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Dispositivo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_dispositivo;
	
	@Column(nullable = false, name = "type")
	@Enumerated(EnumType.STRING)
	private TipoDispositivo tipo;

	@Column(nullable = false, name = "stato")
	@Enumerated(EnumType.STRING)
	private StatoDispositivo stato;

	@ManyToOne
	@JoinColumn(name = "utente_id")
	private Utente utente;

}
