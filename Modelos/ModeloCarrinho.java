package Modelos;
import java.util.List;
import java.util.ArrayList;
public class ModeloCarrinho{
    private List<ModeloProduto> produtos;
    private ModeloProduto produto;
    private double valortotal;

    public ModeloCarrinho(List<ModeloProduto> produtos,double valortotal){
        this.produtos=new ArrayList<>();
        this.valortotal=valortotal;
    }

    public void addProduto(List<ModeloProduto> produtos){
        produtos.add(produto);
    }
}