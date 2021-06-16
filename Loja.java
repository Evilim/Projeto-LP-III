import java.util.List;
import java.util.ArrayList;

public class Loja{
    private String nome;
    private List<Cliente> cliente;
    private List<Produto> produto;
    private List<Fornecedor> fornecedor;

    public Loja(String nome,List<Cliente> cliente,List<Produto> produto,List<Fornecedor> fornecedor){
        this.nome=nome;
        this.cliente=new ArrayList<>();
        this.produto=new ArrayList<>();
        this.fornecedor=new ArrayList<>();
    }
}