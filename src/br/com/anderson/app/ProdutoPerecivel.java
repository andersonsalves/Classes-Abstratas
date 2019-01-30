package br.com.anderson.app;

/**
 *
 * @author Anderson Silva
 */
public class ProdutoPerecivel extends Produto {

    private String dataValidade;

    /**
     * 
     */
    @Override
    public void descricao() {        
        
        System.out.println("Descrição: " + super.getDescricao() + ". Vencendo em: " + dataValidade);
    }
    
    
    // Getters e Setters 

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }   
}
