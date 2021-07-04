package Modelos;
import java.util.List;
import java.util.ArrayList;

public class ModeloLoja{
    private String nome;
    private List<ModeloCliente> cliente;
    private List<ModeloProduto> produto;
    private List<ModeloFornecedor> fornecedor;

    public ModeloLoja(String nome,List<ModeloCliente> cliente,List<ModeloProduto> produto,List<ModeloFornecedor> fornecedor){
        this.nome=nome;
        this.cliente=new ArrayList<>();
        this.produto=new ArrayList<>();
        this.fornecedor=new ArrayList<>();
    }
}