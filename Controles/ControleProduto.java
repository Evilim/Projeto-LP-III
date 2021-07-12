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
        produtos.add(produto);
    }
}
