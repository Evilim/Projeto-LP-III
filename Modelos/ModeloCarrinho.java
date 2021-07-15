package Modelos;

import Controles.ControleProduto;

public class ModeloCarrinho{
    private double valortotal;

    private ControleProduto produtos;

    public ModeloCarrinho(ControleProduto produtos){
        this.produtos=produtos;
    }

    public void addProduto(ModeloProduto produto){
        produtos.addProduto(produto);
        valortotal+=produto.getValor()+produto.getFrete();
    }

    public double getValor(){
        return this.valortotal;
    }

    public ControleProduto getLista(){
        return this.produtos;
    }
}