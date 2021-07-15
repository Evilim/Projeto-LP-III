import java.util.Scanner;

import Visoes.VisaoCliente;
import Visoes.VisaoCarrinho;
import Visoes.VisaoLoja;
import Visoes.VisaoProduto;

import Controles.ControleFornecedores;
import Controles.ControleCarrinho;
import Controles.ControleCliente;
import Controles.ControleProduto;

import Modelos.ModeloCarrinho;
import Modelos.ModeloCliente;
import Modelos.ModeloFornecedor;
import Modelos.ModeloProduto;

public class App{
    static int opcao;
    static String nome; 

    static VisaoLoja vLoja=new VisaoLoja();
    static VisaoCliente vCliente=new VisaoCliente();
    static VisaoProduto vProduto=new VisaoProduto();
    static VisaoCarrinho vCarrinho=new VisaoCarrinho();
    
    static ControleFornecedores cFornecedores=new ControleFornecedores();
    static ControleCarrinho cCarrinho=new ControleCarrinho();
    static ControleCliente cCliente=new ControleCliente();
    static ControleProduto cProduto=new ControleProduto();
    
    static ModeloCarrinho mCarrinho;

    static Scanner leitor=new Scanner(System.in);

    public static void main(String args[]){
        vLoja.menuInicial();
        opcao=leitor.nextInt();
        leitor.nextLine();
        switch(opcao){
            case 1:
                ModeloCliente auxCliente=cCliente.buscaCliente(vCliente.loginCliente());
                while(auxCliente==null){
                    System.out.println("Cliente nao encontrado nos registros, digite novamente");
                    auxCliente=cCliente.buscaCliente(vCliente.loginCliente());
                }
                vLoja.menuLoja();
                opcao=leitor.nextInt();
                leitor.nextLine();
                switch(opcao){
                    case 1:
                        for(ModeloFornecedor f:cFornecedores.getFornecedores()){
                            vProduto.printLista(f.getLista());
                        }
                        System.out.printf("(1) Adicionar produto ao carrinho\n(2) Finalizar a compra\n");
                        opcao=leitor.nextInt();
                        leitor.nextLine();
                        switch(opcao){
                            case 1:
                                int id=leitor.nextInt();
                                leitor.nextLine();
                                for(ModeloFornecedor fornecedor:cFornecedores.getFornecedores()){
                                    for(ModeloProduto produto:fornecedor.getLista().listarProdutos()){
                                        if(produto.getID()==id){
                                            mCarrinho.addProduto(produto);
                                        }
                                    }
                                }
                                break;
                            case 2:
                                vCarrinho.finalCompra(mCarrinho);
                                break;
                        }
                        break;
                    case 2:
                        mCarrinho=cCarrinho.buscarCarrinho(auxCliente);
                        vCarrinho.listarProdutos(mCarrinho);
                        vCarrinho.menuCarrinho();
                        opcao=leitor.nextInt();
                        leitor.nextLine();
                        switch(opcao){
                            case 1:
                                int id=leitor.nextInt();
                                leitor.nextLine();
                                mCarrinho.getLista().removeProduto(id);
                                break;
                            case 2:
                                vCarrinho.finalCompra(mCarrinho);
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("Encerrando programa...");
                        return;
                }
                break;
            case 2:
                auxCliente=vCliente.cadastroCliente();
                cCliente.addCliente(auxCliente);
                vLoja.menuLoja();
                opcao=leitor.nextInt();
                leitor.nextLine();
                switch(opcao){
                    case 1:
                        for(ModeloFornecedor fornecedor:cFornecedores.getFornecedores()){
                            vProduto.printLista(fornecedor.getLista());
                        }
                        System.out.printf("(1) Adicionar produto ao carrinho\n(2) Finalizar a compra\n");
                        opcao=leitor.nextInt();
                        leitor.nextLine();
                        switch(opcao){
                            case 1:
                                int id=leitor.nextInt();
                                leitor.nextLine();
                                for(ModeloFornecedor fornecedor:cFornecedores.getFornecedores()){
                                    for(ModeloProduto produto:fornecedor.getLista().listarProdutos()){
                                        if(produto.getID()==id){
                                            mCarrinho.addProduto(produto);
                                        }
                                    }
                                }
                                break;
                            case 2:
                                vCarrinho.finalCompra(mCarrinho);
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("Encerrando programa...");
                        return;
                }
                break;
            case 3:
                System.out.println("Encerrando programa...");
                return;
        }
    }
}
