package Visoes;

import java.util.Scanner;

import Modelos.ModeloCliente;
import Modelos.ModeloFormaDePagamento;

import Visoes.VisaoFormaDePagamento;

public class VisaoCliente {
    private VisaoFormaDePagamento vPagamento=new VisaoFormaDePagamento();

    Scanner leitor=new Scanner(System.in);

    public ModeloCliente loginCliente(){
        System.out.println("\nNome de Usuario: ");
        String nome=leitor.nextLine();
        System.out.println("Senha: ");
        String senha=leitor.nextLine();
        ModeloCliente cliente=new ModeloCliente(nome, senha);
        return cliente;
    }

    public ModeloCliente cadastroCliente(){
        System.out.println("\nNome de Usuario: ");
        String nome=leitor.nextLine();
        System.out.println("Senha: ");
        String senha=leitor.nextLine();
        ModeloCliente cliente=new ModeloCliente(nome, senha);
        System.out.println("\nForma de Pagamento:\n");
        vPagamento.printFormas();
        int opcao=leitor.nextInt();
        switch(opcao){
            case 1:
                cliente.setPagamento(ModeloFormaDePagamento.BOLETO);
                break;
            case 2:
                cliente.setPagamento(ModeloFormaDePagamento.CARTAO);
                break;
            case 3:
                cliente.setPagamento(ModeloFormaDePagamento.PIX);
                break;
        }
        return cliente;
    }
}
