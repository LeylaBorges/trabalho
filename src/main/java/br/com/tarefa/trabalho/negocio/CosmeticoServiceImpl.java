package br.com.tarefa.trabalho.negocio;

import br.com.tarefa.trabalho.entidade.Cosmetico;
import br.com.tarefa.trabalho.persistencia.CosmeticoRepository;
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
    public Cosmetico incluir(Cosmetico cosmetico){
        try {
            repository.save(cosmetico);
            return cosmetico;
        }
        // catch (Exception e){
            throw new TrabalhoException(Não foi possivel incluir o cosmetico)
        }
    }
    @Override
    public List<Cosmetico>listar(){
    try {
        return (List<Cosmetico>) this.repository.findAll();
    }
    catch (Exception e){
        throw new TarefaException ("Não foi possivel listar os cosmeticos");
    }
}
    @Override
    public Cosmetico consultar(Integer id);

    @Override
    public void alterar(Cosmetico cosmetico) {

    }

    @Override
    public void exluir(Integer id) {

    }{
        try{
        return this.repository.findById(id).get();
        }
        catch(Exception e){
        throw new Trabalho3Exception("Não foi possivel consultar o cosmetico:"+id+"!");
        }
        }

        @Override
        public void alterar(Cosmetico cosmetico) {
        try{
            repository.save(cosmetico);
        }
        catch (Exception e){
            throw new TrabalhoException("Não foi possivel alterar o cosmetico: "+cosmetico.gerId()+"!");
        }
        }

        @Override
        public void excluir(Integer id){
        try{
            repository.deleteById(id);
        }
        catch (Exception e){
            throw new TrabalhoException("Não foi possivel excluir o cosmetico: "+id+"!");
        }
        }

