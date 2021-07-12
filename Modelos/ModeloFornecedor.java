package Modelos;
import java.util.List;
import java.util.ArrayList;

public class ModeloFornecedor{
    private String nome;
    private ModeloCategoria categoria;
    private List<ModeloProduto> produtos; 

    public ModeloFornecedor(String nome,ModeloCategoria categoria){
        this.nome=nome;
        this.categoria=categoria;
        this.produtos=new ArrayList<>();
    }

    public String getNome(){
        return this.nome;
    }

    public ModeloCategoria getCategoria(){
        return this.categoria;
    }
}