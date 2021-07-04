package Modelos;
public class ModeloProduto{
    private int id;
    private String nome;
    private ModeloCategoria categoria;
    private double peso;
    private double altura;
    private double largura;
    private double valorunitario;
    private double frete;

    public ModeloProduto(int id,String nome,ModeloCategoria categoria,double peso,double altura,double largura,double valorunitario){
        this.id=id;
        this.nome=nome;
        this.categoria=categoria;
        this.peso=peso;
        this.altura=altura;
        this.largura=largura;
        this.valorunitario=valorunitario;
    }

    public int getID(){
        return this.id;
    }

    public String getNome(){
        return this.nome;
    }

    public ModeloCategoria getCategoria(){
        return this.categoria;
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
        return this.frete;
    }

    public void setFrete(ModeloCategoria categoria,double frete){
        switch(categoria){
            case PERECIVEL:
                this.frete=10;
            case MOBILIA:
                this.frete=15;
            case ELETRODOMESTICO:
                this.frete=20;
            default:
                break;
        }
    }
}