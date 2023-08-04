package ProgettoSettimanale5.PS5.PS5Dispositivo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name="dispositivi")
@Getter
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
	
}
