public class Produto{
    private String nome;
    private Categoria categoria;
    private double peso;
    private double altura;
    private double largura;
    private double valorunitario;
    private double frete;

    public Produto(String nome,Categoria categoria,double peso,double altura,double largura,double valorunitario){
        this.nome=nome;
        this.categoria=categoria;
        this.peso=peso;
        this.altura=altura;
        this.largura=largura;
        this.valorunitario=valorunitario;
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

    public double setFrete(Categoria categoria){
        switch(categoria){
            case PERECIVEL:
                return this.frete=10.0;
            case MOBILIA:
                return this.frete=15.0;
            case ELETRODOMESTICO:
                return this.frete=20.0;
            default:
                break;
        }
    }
}