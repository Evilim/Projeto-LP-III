package Modelos;
public class ModeloProduto{
    private int id;
    private int qtd;

    private String nome;
    
    private double peso;
    private double altura;
    private double largura;
    private double valorunitario;

    private ModeloCategoria categoria;

    public ModeloProduto(int id,int qtd,String nome,ModeloCategoria perecivel,double peso,double altura,double largura,double valorunitario){
        this.id=id;
        this.qtd=qtd;
        this.nome=nome;
        this.categoria=perecivel;
        this.peso=peso;
        this.altura=altura;
        this.largura=largura;
        this.valorunitario=valorunitario;
    }

    public int getID(){
        return this.id;
    }

    public int getQtd(){
        return this.qtd;
    }

    public void setQtd(int qtd){
        this.qtd=qtd;
    }

    public String getNome(){
        return this.nome;
    }

    public double getPeso(){
        return this.peso;
    }

    public double getAltura(){
        return this.altura;
    }

    public double getLargura(){
        return this.largura;
    }

    public double getValor(){
        return this.valorunitario;
    }

    public double getFrete(){
        return this.categoria.getValor()+peso+largura+altura;
    }

    public ModeloCategoria getCategoria(){
        return this.categoria;
    }
}