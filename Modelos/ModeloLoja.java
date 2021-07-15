package Modelos;

import java.util.HashMap;

import Controles.ControleCarrinho;
import Controles.ControleCliente;
import Controles.ControleFornecedores;

public class ModeloLoja{
    private String nome;

    private ControleCliente clientes=new ControleCliente();
    private ControleFornecedores fornecedores=new ControleFornecedores();
    private ControleCarrinho carrinhos=new ControleCarrinho();

    public ModeloLoja(String nome,ControleCarrinho carrinhos,ControleCliente clientes,ControleFornecedores fornecedores){
        this.nome=nome;
        this.carrinhos=carrinhos;
        this.clientes=clientes;
        this.fornecedores=fornecedores;
    }
}