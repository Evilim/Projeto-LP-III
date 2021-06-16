import java.util.List;
import java.util.ArrayList;
public class Carrinho{
    private List<Produto> produtos;
    private Produto produto;
    private double valortotal;

    public Carrinho(List<Produto> produtos,double valortotal){
        this.produtos=new ArrayList<>();
        this.valortotal=valortotal;
    }

    public void addProduto(List<Produto> produtos){
        produtos.add(produto);
    }
}