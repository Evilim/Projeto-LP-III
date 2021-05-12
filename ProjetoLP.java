import java.util.ArrayList;
import java.util.List;

public class Cliente{
    private String nome;
    private String senha;
    private Carrinho carrinho;

    public Cliente(String nome,String senha){
        this.nome=nome;
        this.senha=senha;
        this.carrinho=new Carrinho();
    }

    public String getNome(){
        return this.nome;
    }

    public String getSenha(){
        return this.senha;
    }

    public FormaDePagamento getPagamento(){
        return this.pagamento;
    }
}

public class Fornecedor{
    private String nome;
    private Categoria categoria;

    public Fornecedor(String nome,Categoria categoria){
        this.nome=nome;
        this.categoria=categoria;
    }

    public String getNome(){
        return this.nome;
    }

    public Categoria getCategoria(){
        return this.categoria;
    }
}

public enum Categoria{
    PERECIVEL,MOBILIA,ELETRODOMESTICO;
}

public enum FormaDePagamento{
    CARTAO,PIX,BOLETO;
}

public class Produto{
    private String nome;
    private Categoria categoria;
    private double peso;
    private double altura;
    private double largura;
    private double valorunitario;

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
}

public class Carrinho{
    private List Produto produto;
    private double valortotal;

    public Carrinho(){
        this.produto=new ArrayList();
    }
}

public class Loja{
    private String nome;
    private List Cliente cliente;
    private List Produto produto;
    private List Fornecedor fornecedor;

    public Loja(String nome,List Cliente cliente,List Produto produto,List Fornecedor fornecedor){
        this.nome=nome;
        this.cliente=cliente;
        this.produto=produto;
        this.fornecedor=fornecedor;
    }
}