package Controles;
import java.util.List;
import java.util.ArrayList;
import Modelos.ModeloFornecedor;

public class ControleFornecedores {
    private List<ModeloFornecedor> fornecedores;

    public ControleFornecedores(){
        fornecedores=new ArrayList<>();
    }

    public void addFornecedor(ModeloFornecedor fornecedor){
        fornecedores.add(fornecedor);
    }
}
