package br.com.tarefa.trabalho.persistencia;
import br.com.tarefa.trabalho.entidade.Cosmetico;
import org.springframework.data.repository.CrudRepository;

public interface CosmeticoRepository extends CrudRepository<Cosmetico, Integer> {
}
