package ProgettoSettimanale5.PS5.PS5Dispositivo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Service
public class DispositivoService {

    private final DispositivoRepository dispRepository;

    @Autowired
    public DispositivoService(DispositivoRepository dispRepository) {
        this.dispRepository = dispRepository;
    }

    public List<Dispositivo> getDispositivi() {
        return dispRepository.findAll();
    }

    public Dispositivo getDispositivoById(Long id) {
        return dispRepository.findById(id).orElse(null);
    }

    public Dispositivo saveDispositivo(Dispositivo dispositivo) {
        return dispRepository.save(dispositivo);
    }

    public void deleteDispositivo(Long id) {
        dispRepository.deleteById(id);
    }
}
