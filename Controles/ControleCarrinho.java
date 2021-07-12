package Controles;
import java.util.List;
import java.util.ArrayList;
import Controles.ControleProduto;
import Modelos.ModeloProduto;
import Modelos.ModeloCarrinho;

public class ControleCarrinho {
    private ControleProduto produtos;

    public ModeloProduto buscarProduto(int id) {
        for(ModeloProduto produto: this.produtos) {
            if(produto.getID()==id) {
                return produto;
            }
        }
        return null;
    }
}
