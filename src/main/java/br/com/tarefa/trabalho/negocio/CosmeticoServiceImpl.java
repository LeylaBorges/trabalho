package br.com.tarefa.trabalho.negocio;

import br.com.tarefa.trabalho.entidade.Cosmetico;
import br.com.tarefa.trabalho.persistencia.CosmeticoRepository;
import br.com.tarefa.trabalho.util.TrabalhoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional
public class CosmeticoServiceImpl implements CosmeticoService{

    private final CosmeticoRepository repository;


    @Autowired
    public CosmeticoServiceImpl(CosmeticoRepository repository){
        this.repository = repository;
    }


    @Override
    public Cosmetico incluir(Cosmetico cosmetico) {
        try {
            repository.save(cosmetico);
            return cosmetico;
        }
        catch (Exception e){
            throw new TrabalhoException("Não foi possivel incluir o cosmetico");
        }
    }

    @Override
    public List<Cosmetico> listar() {
        try {
            return (List<Cosmetico>) this.repository.findAll();
        }
        catch (Exception e){
            throw new TrabalhoException ("Não foi possivel listar o cosmetico");
        }
    }

    @Override
    public Cosmetico consultar(Integer id) {
        try {
            return this.repository.findById(id).get();

        }
        catch (Exception e){
            throw new TrabalhoException("Não foi possivel consulta o cosmetico");
        }
    }

    @Override
    public void alterar(Cosmetico cosmetico) {
        try{
            this.repository.save(cosmetico);
        }
        catch (Exception e){
            throw new TrabalhoException("Não foi possivel alterar o cosmetico");
        }

    }

    @Override
    public void exluir(Integer id) {
        try{
            this.repository.deleteById(id);
        }
        catch (Exception e){
            throw new TrabalhoException("Não foi possivel alterar o cosmetico");
        }

    }
}


