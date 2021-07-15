package Visoes;

import Controles.ControleProduto;

import Modelos.ModeloProduto;

public class VisaoProduto {
    public void printLista(ControleProduto produtos){
        for(ModeloProduto produto: produtos.listarProdutos()) {
            System.out.printf("ID: %d, Nome: %s, Categoria: %s, Peso: %.2f, Altura: %.2f cm, Largura: %.2f cm, Valor unitario: R$%.2f\n",
            produto.getID(), produto.getNome(), produto.getCategoria(), produto.getPeso(), produto.getAltura(), produto.getLargura(), produto.getValor());
        }
    }
}
