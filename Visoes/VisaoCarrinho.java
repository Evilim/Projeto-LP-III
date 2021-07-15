package Visoes;

import Controles.ControleCarrinho;

import Modelos.ModeloProduto;
import Modelos.ModeloCarrinho;

import Visoes.VisaoProduto;

public class VisaoCarrinho {
    private VisaoProduto vProduto=new VisaoProduto();

    public void listarProdutos(ModeloCarrinho carrinho){
        vProduto.printLista(carrinho.getLista());
    }

    public void finalCompra(ModeloCarrinho carrinho){
        System.out.printf("\nValor total da compra: %.2f",carrinho.getValor());
        System.out.println("\nCompra efetuada com sucesso, agradecemos a preferencia!\n");
    }

    public void menuCarrinho(){
        System.out.println("\n(1) Remover produto");
        System.out.println("(2) Finalizar compra");
    }
}
