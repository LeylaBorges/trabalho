package br.com.tarefa.trabalho.entidade;

import javax.persistence.*;

@Entity
@Table(name= "cosmetico")
public class Cosmetico {


    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(name = "produto")
    private String produto;

    @Column(name = "valor")
    private Integer valor;

    public Integer getId(){
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }
}

