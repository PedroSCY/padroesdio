package pedroscy.padroesdio.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pedroscy.padroesdio.facade.SalaFacade;
import pedroscy.padroesdio.model.Sala;
import pedroscy.padroesdio.model.dto.SalaDTO;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/salas")
public class SalaController {

    @Autowired
    private SalaFacade salaFacade;

    @PostMapping
    public ResponseEntity<?> criarSala(@RequestBody SalaDTO salaDTO){
        try{
            Sala sala = salaFacade.criarNovaSala(salaDTO);
            return ResponseEntity.ok(sala);
        } catch (Exception e){
            return ResponseEntity.badRequest().body("houve um erro ao criar a sala");
        }
    }

    @GetMapping
    public ResponseEntity<List<Sala>> obterTodasAsSalas(){
        List<Sala> salas = salaFacade.obterTodasAsSalas();
        return ResponseEntity.ok(salas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Sala> obterSalaPorId(@PathVariable Long id) {
        Sala sala = salaFacade.obterSalaPorId(id);
        return ResponseEntity.ok(sala);
    }



}
