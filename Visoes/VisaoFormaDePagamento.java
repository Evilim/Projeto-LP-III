package Visoes;

import Modelos.ModeloFormaDePagamento;

public class VisaoFormaDePagamento {
    public void printFormas(){
        System.out.printf("(1): %s\n(2): %s\n(3): %s\n",ModeloFormaDePagamento.BOLETO,ModeloFormaDePagamento.CARTAO,ModeloFormaDePagamento.PIX);
    }
}
