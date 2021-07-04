package Modelos;

public class ModeloCliente{
    private String nome;
    private String senha;
    private ModeloFormaDePagamento pagamento;
    private ModeloCarrinho carrinho;

    public ModeloCliente(String nome,String senha,ModeloCarrinho carrinho){
        this.nome=nome;
        this.senha=senha;
        this.carrinho=carrinho;
    }

    public String getNome(){
        return this.nome;
    }

    public String getSenha(){
        return this.senha;
    }

    public ModeloFormaDePagamento getPagamento(){
        return this.pagamento;
    }
}