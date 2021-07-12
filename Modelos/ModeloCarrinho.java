package Modelos;
import java.util.List;
import java.util.ArrayList;
import Controles.ControleProduto;

public class ModeloCarrinho{
    private ControleProduto produtos;
    private double valortotal;

    public ModeloCarrinho(ControleProduto produtos){
        this.produtos=produtos;
    }

    public void addProduto(ModeloProduto produto){
        valortotal+=produto.getValor()+produto.getFrete();
    }
}