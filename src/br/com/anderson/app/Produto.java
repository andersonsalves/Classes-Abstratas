package br.com.anderson.app;

/**
 *
 * @author Anderson Silva
 */
public abstract class Produto {

    private String descricao;

    public abstract void descricao();
    

    // Getters e Setters 

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }   
}
