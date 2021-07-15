package Controles;

import java.util.List;
import java.util.ArrayList;

import Modelos.ModeloProduto;

public class ControleProduto {
    private List<ModeloProduto> produtos;

    public ControleProduto(){
        produtos=new ArrayList<>();
    }

    public void addProduto(List<ModeloProduto> produtos){
        this.produtos=produtos;
    }

    public void addProduto(ModeloProduto produto){
        if(buscarProduto(produto.getID())!=null){
            produto.setQtd(produto.getQtd()+1);
        }
        produtos.add(produto);
    }

    public ModeloProduto buscarProduto(int id) {
        for(ModeloProduto produto: this.produtos) {
            if(produto.getID()==id) {
                return produto;
            }
        }
        return null;
    }

    public void removeProduto(int id){
        ModeloProduto produto=this.buscarProduto(id);
        if(produto!=null){
            produtos.remove(produto);
        }
    }

    public List<ModeloProduto> listarProdutos(){
        return produtos;
    }
}
