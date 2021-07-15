package Modelos;

public class ModeloCliente{
    private String nome;
    private String senha;
    
    private ModeloFormaDePagamento pagamento;

    public ModeloCliente(String nome,String senha){
        this.nome=nome;
        this.senha=senha;
    }

    public String getNome(){
        return this.nome;
    }

    public String getSenha(){
        return this.senha;
    }

    public void setPagamento(ModeloFormaDePagamento pagamento){
        this.pagamento=pagamento;
    }

    public ModeloFormaDePagamento getPagamento(){
        return this.pagamento;
    }
}