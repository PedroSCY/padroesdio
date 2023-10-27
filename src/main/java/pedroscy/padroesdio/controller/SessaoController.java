package pedroscy.padroesdio.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pedroscy.padroesdio.facade.SessaoFacade;
import pedroscy.padroesdio.model.Sessao;
import pedroscy.padroesdio.model.dto.SessaoDTO;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/sessoes")
public class SessaoController {

    @Autowired
    private SessaoFacade sessaoFacade;

    public ResponseEntity<Sessao> criarSessao(@RequestBody SessaoDTO sessaoDTO){
        Sessao sessao = sessaoFacade.criarNovaSessao(sessaoDTO);
        return  ResponseEntity.ok(sessao);
    }

    @GetMapping
    public ResponseEntity<List<Sessao>> obterTodasAsSessoes(){
        List<Sessao> sessoes = sessaoFacade.obterTodasAsSessoes();
        return ResponseEntity.ok(sessoes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Sessao> obterSessaoPorId(@PathVariable Long id){
        Sessao sessao = sessaoFacade.obterSessaoPorId(id);
        return ResponseEntity.ok(sessao);
    }

}
