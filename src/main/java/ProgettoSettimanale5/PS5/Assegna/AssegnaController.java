package ProgettoSettimanale5.PS5.Assegna;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/assegna")
public class AssegnaController {
    private final AssegnaService assegnaService;

    @Autowired
    public AssegnaController(AssegnaService assegnaService) {
        this.assegnaService = assegnaService;
    }

    @PutMapping("/{dId}/ad/{uId}")
    public ResponseEntity<String> assegnaDispositivo(@PathVariable Long dId, @PathVariable Long uId) {
        String result = assegnaService.assegnaDispositivo(uId, dId);
        return ResponseEntity.ok(result);
    }
}
