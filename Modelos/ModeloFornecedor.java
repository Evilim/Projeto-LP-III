package Modelos;
public class ModeloFornecedor{
    private String nome;
    private ModeloCategoria categoria;

    public ModeloFornecedor(String nome,ModeloCategoria categoria){
        this.nome=nome;
        this.categoria=categoria;
    }

    public String getNome(){
        return this.nome;
    }

    public ModeloCategoria getCategoria(){
        return this.categoria;
    }
}