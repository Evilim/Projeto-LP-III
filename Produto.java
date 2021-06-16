public class Produto{
    private int id;
    private String nome;
    private Categoria categoria;
    private double peso;
    private double altura;
    private double largura;
    private double valorunitario;
    private double frete;

    public Produto(int id,String nome,Categoria categoria,double peso,double altura,double largura,double valorunitario){
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

    public Categoria getCategoria(){
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

    public void setFrete(Categoria categoria,double frete){
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