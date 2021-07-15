package Modelos;

public enum ModeloCategoria{
    PERECIVEL(10.0),MOBILIA(15.0),ELETRODOMESTICO(20.0);
    
    private double valor;

    ModeloCategoria(double valor){
        this.valor=valor;
    }

    public double getValor(){
        return this.valor;
    }
}