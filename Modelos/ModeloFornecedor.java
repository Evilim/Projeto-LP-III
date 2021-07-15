package Modelos;

import Controles.ControleProduto;

public class ModeloFornecedor{
    private String nome;

    private ModeloCategoria categoria;

    private ControleProduto produtos; 

    public ModeloFornecedor(String nome,ModeloCategoria categoria){
        this.nome=nome;
        this.categoria=categoria;
    }

    public String getNome(){
        return this.nome;
    }

    public ModeloCategoria getCategoria(){
        return this.categoria;
    }

    public void addProduto(){
        produtos.addProduto(new ModeloProduto(1, 2, "Barra de Chocolate", ModeloCategoria.PERECIVEL, 0.90, 0.10, 0.10, 4.99));
        produtos.addProduto(new ModeloProduto(2, 2, "Sofa", ModeloCategoria.MOBILIA, 100.50, 1.10, 3.00, 1000.99));
        produtos.addProduto(new ModeloProduto(3, 1, "Geladeira", ModeloCategoria.ELETRODOMESTICO, 200.0, 1.55, 1.0, 1544.99));
    }

    public ControleProduto getLista(){
        return this.produtos;
    }
}