package br.com.tarefa.trabalho.controle;

import br.com.tarefa.trabalho.entidade.Cosmetico;
import br.com.tarefa.trabalho.negocio.CosmeticoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*",maxAge = 3600)
public class CosmeticoController {
    private CosmeticoService cosmeticoService;

    @Autowired
    public void setCosmeticoService(CosmeticoService cosmeticoService) {
        this.cosmeticoService = cosmeticoService;
    }

    @GetMapping(value = "/listar-cosmetico")
    public List<Cosmetico> listar() {

        List<Cosmetico>=cosmeticoService.listar();
        return lista;
    }

    @GetMapping(value = "/consultar-cosmetico/{id}")
    public Cosmetico consultar(@PathVariable Integer id) {

        return cosmeticoService.consultar(id);

    }

    @PostMapping(value = "/salvar-cosmetico")
    public Cosmetico salvar(@RequestBody Cosmetico cosmetico) {

        try {
            if (cosmetico.getId() == null) {

                cosmetico = cosmeticoService.incluir(cosmetico);
            } else {
                cosmeticoService.alterar(cosmetico);
            }

            return cosmetico;
        } catch (TrabalhoException ex) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, ex.getReason());
        }
    }

    @DeleteMapping(value = "/exluir-cosmetico/{id}")
    public void excluir(@PathVariable Integer id) {

        cosmeticoService.exluir(id);
    }
}

        List<Cosmetico>lista= new ArrayList<>();

        Cosmetico cosmetico = new Cosmetico();

        cosmetico.setId(1);
        cosmetico.setProduto("batom");
        cosmetico.setValor(50);


        lista.add(cosmetico);

        cosmetico = new Cosmetico();

        cosmetico.setId(2);
        cosmetico.setProduto("Perfume");
        cosmetico.setValor(200);

        lista.add(cosmetico);
        return lista;
        }

    @GetMapping(value = "/consultar-cosmetico/{id}")
    public Cosmetico consultar(@PathVariable Integer id){

        Cosmetico cosmetico = new Cosmetico();

        cosmetico.setId(id);
        cosmetico.setProduto("batom");
        cosmetico.setValor(50);

        return cosmetico;
    }

    @PostMapping(value = "/salvar-cosmetico")
    public Cosmetico salvar(@RequestBody Cosmetico cosmetico){

            return cosmetico;
        }

     @DeleteMapping(value="/excluir-cosmetico/{id}")
    public void excluir(@PathVariable Long id){
        //Todo
         //EXLUIR O REGISTRO AQUI
     }

}