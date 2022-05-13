package br.com.tarefa.trabalho.entidade;

import javax.persistence.*;

@Entity
@Table(name= "cosmetico")
public class Cosmetico {


    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public String getLinha() {
        return linha;
    }

    public void setLinha(String linha) {
        this.linha = linha;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    @Column(name = "nome")
    private String nome;

    @Column(name = "linha")
    private String linha;

    @Column(name = "validade")
    private String validade;
    @Column(name = "valor")
    private Integer valor;

    public Integer getId(){
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }
}

