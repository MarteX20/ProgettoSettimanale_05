package ProgettoSettimanale5.PS5.PS5Dispositivo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Service
public class DispositivoService {

    @Autowired
    DispositivoRepository repository;

    @GetMapping
    public List<Dispositivo> getDispositivi() {
        return repository.findAll();
    }
}
