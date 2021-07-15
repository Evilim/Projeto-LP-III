package Controles;

import java.util.List;
import java.util.ArrayList;

import Modelos.ModeloCategoria;
import Modelos.ModeloFornecedor;

public class ControleFornecedores {
    private List<ModeloFornecedor> fornecedores;

    public ControleFornecedores(){
        fornecedores=new ArrayList<>();
    }

    public void addFornecedor(ModeloFornecedor fornecedor){
        fornecedores.add(fornecedor);
    }

    public void testeFornecedor(){
        ((ControleFornecedores) fornecedores).addFornecedor(new ModeloFornecedor("Ciclano", ModeloCategoria.PERECIVEL));
        ((ControleFornecedores) fornecedores).addFornecedor(new ModeloFornecedor("Beltrano", ModeloCategoria.ELETRODOMESTICO));
        ((ControleFornecedores) fornecedores).addFornecedor(new ModeloFornecedor("Fulano", ModeloCategoria.MOBILIA));
    }

    public List<ModeloFornecedor> getFornecedores(){
        return this.fornecedores;
    }
}
