# Projeto de Linguagem de Programação III (CET-078)

O Projeto proposto consiste em um sistema de Loja Online, onde contamos com funcionalidades básicas para o funciomanento do mesmo, todo seu código é inteiramente implementado na linguagem Java e sua execução é realizada por meio de ações pelo Terminal da IDE, este sistema busca promover uma melhor organização em ações básicas para o gerenciamento de um negócio online, infelizmente o projeto não está totalmente completo, pois ao decorrer da programação, foi encontrado um bug, do qual ainda não foi possível ser solucionado.

A sua execução é muito simples e conta apenas com interações básicas com a máquina, parte do código está implementado para teste, que é o caso da lista de produtos pertencentes aos Fornecedores, o bug encontrado está localizado na função onde se verifica a lista de Fornecedores e os seus respectivos Produtos.

## Decisões de Design:

Cliente:

- Nome de usuário;
- Senha;
- Forma de Pagamento;

Fornecedor:

- Nome da empresa;
- Categoria do produto fornecido;
- Lista de Produtos;

Categoria:

Classe de enumeração onde estão dispostas as categorias dos produtos.

Forma de Pagamento:

Classe de enumeração onde estão dispostas as formas de pagamento.

Produto:

- Número de identificação;
- Quantidade;
- Nome do produto;
- Categoria;
- Peso;
- Altura;
- Largura;
- Valor unitário;

Carrinho:

- Lista de produtos;
- Valor total da compra;

Loja:

- Nome;
- Lista de carrinhos;
- Lista de clientes;
- Lista de fornecedores;
