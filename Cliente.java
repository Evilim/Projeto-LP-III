public class Cliente{
    private String nome;
    private String senha;
    private FormaDePagamento pagamento;
    private Carrinho carrinho;

    public Cliente(String nome,String senha,Carrinho carrinho){
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

    public FormaDePagamento getPagamento(){
        return this.pagamento;
    }
}