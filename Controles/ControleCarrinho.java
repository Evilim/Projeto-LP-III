package Controles;

import java.util.Map;
import java.util.HashMap;

import Controles.ControleProduto;

import Modelos.ModeloCliente;
import Modelos.ModeloProduto;
import Modelos.ModeloCarrinho;

public class ControleCarrinho {
    private Map<ModeloCliente,ModeloCarrinho> carrinhos;

    public ControleCarrinho(){
        carrinhos=new HashMap<>();
    }

    public void addCarrinho(Map<ModeloCliente,ModeloCarrinho> carrinhos){
        this.carrinhos=carrinhos;
    }

    public void addCarrinho(ModeloCliente cliente,ModeloCarrinho carrinho){
        carrinhos.put(cliente,carrinho);
    }

    public ModeloCarrinho buscarCarrinho(ModeloCliente cliente) {
        for(ModeloCliente c: carrinhos.keySet()) {
            if(c==cliente) {
                return carrinhos.get(cliente);
            }
        }
        return null;
    }
}
