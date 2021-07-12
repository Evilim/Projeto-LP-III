package Modelos;
import java.util.List;
import java.util.ArrayList;
import Controles.ControleCarrinho;
import Controles.ControleCliente;
import Controles.ControleFornecedores;

public class ModeloLoja{
    private String nome;
    private ControleCliente clientes;
    private ControleFornecedores fornecedores;
    private ControleCarrinho carrinhos;

    public ModeloLoja(String nome,List<ModeloCliente> cliente,List<ModeloFornecedor> fornecedor){
        this.nome=nome;
    }
}