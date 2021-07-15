package Controles;

import java.util.List;
import java.util.ArrayList;

import Modelos.ModeloCliente;

public class ControleCliente {
    private List<ModeloCliente> clientes;

    public ControleCliente(){
        this.clientes=new ArrayList<>();
    }

    public void addCliente(ModeloCliente cliente){
        clientes.add(cliente);
    }

    public ModeloCliente buscaCliente(ModeloCliente cliente){
        for(ModeloCliente c: this.clientes) {
            if(c.getNome()==cliente.getNome() && c.getSenha()==cliente.getSenha()) {
                return c;
            }
        }
        return null;
    }
}
