public class Fornecedor{
    private String nome;
    private Categoria categoria;

    public Fornecedor(String nome,Categoria categoria){
        this.nome=nome;
        this.categoria=categoria;
    }

    public String getNome(){
        return this.nome;
    }

    public Categoria getCategoria(){
        return this.categoria;
    }
}