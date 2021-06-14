import java.util.ArrayList;
import java.util.List;

public class Cliente{
    private String nome;
    private String senha;
    private FormaDePagamento pagamento;
    private Carrinho carrinho;

    public Cliente(String nome,String senha){
        this.nome=nome;
        this.senha=senha;
        this.carrinho=new Carrinho();
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