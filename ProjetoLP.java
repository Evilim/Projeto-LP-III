import java.util.ArrayList;
import java.util.List;

public class Cliente{
    private String nome;
    private String senha;
}

public class Fornecedor{
    private String nome;
    private Categoria categoria;

}

public enum Categoria{
    PERECÍVEL,MOBÍLIA,ELETRODOMÉSTICO;
}

public class Produto{
    private String nome;
    private Categoria categoria;
    private double peso;
    private double altura;
    private double largura;
    private double valorunitario;
}

public class Carrinho{
    private List Produto produto=new ArrayList();
    private double valortotal;
}

public class Loja{
    private Carrinho carrinho;
    private List Cliente cliente=new ArrayList();
    private List Produto produto=new ArrayList();
    private List Fornecedor fornecedor=new ArrayList();
}