public class Loja{
    private String nome;
    private List Cliente cliente;
    private List Produto produto;
    private List Fornecedor fornecedor;

    public Loja(String nome,List Cliente cliente,List Produto produto,List Fornecedor fornecedor){
        this.nome=nome;
        this.cliente=cliente;
        this.produto=produto;
        this.fornecedor=fornecedor;
    }
}