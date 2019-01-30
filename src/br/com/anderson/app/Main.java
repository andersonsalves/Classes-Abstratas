package br.com.anderson.app;

/**
 *
 * @author Anderson Silva
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        Produto produto = new ProdutoPerecivel();
        produto.setDescricao("Bolacha Bono");

        ProdutoPerecivel perecivel = (ProdutoPerecivel) produto;
        perecivel.setDataValidade("21/07/17");

        //Imprimindo Descrição do Produto.
        produto.descricao();
    }
}
