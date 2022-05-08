package br.com.tarefa.trabalho.negocio;

import br.com.tarefa.trabalho.entidade.Cosmetico;

import java.util.List;

public interface CosmeticoService {

    public Cosmetico incluir(Cosmetico cosmetico);
    public List<Cosmetico> listar();
    public Cosmetico consultar(Integer id);
    public void alterar(Cosmetico cosmetico);
    public void exluir(Integer id);
}
