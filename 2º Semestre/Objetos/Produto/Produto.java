public class Produto {
    private int codigo;
    private String descricao;
    private int quantidade;
    private static int totalProdutos = 0;
    private static int limiteEstoque = 10;
    
    // Construtor default
    public Produto() {
        totalProdutos++;
    }
    
    public Produto (int codigo, String descricao, int quantidade) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.quantidade = quantidade;
        totalProdutos++;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public int getCodigo() {
        return codigo;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    
    public void RetiraEstoque(int qtd) {
        quantidade -= qtd;
        System.out.println(qtd+"unidade(s) retirada(s) do estoque.");
    }
    
    public void AdicionaEstoque() {
        quantidade += qtd;
        System.out.println(qtd+"unidade(s) adicionada(s) ao estoque.")
    }
    
    public void StatusEstoque () {
        if (quantidade == 0) {
            System.out.println("Estoque Nulo");
        } else if (quantidade <= limiteEstoque) {
            System.out.println("Estoque Restrito");
        } else {
            System.out.println("Estoque Regular");
        }
    }
    
    public void AlteraLimite(int novoLimite) {
        if (novoLimite > 0) {
            limiteEstoque = novoLimite;
            System.out.println("Novo limite de estoque definido: " + limiteEstoque);
        } else {
            System.out.println("O limite de estoque deve ser maior que zero!");
        }
    
    public void ImprimeProduto() {
        System.out.println("Código do Produto: "+codigo);
        System.out.println("Descrição: "+descricao);
        System.out.println("Quantidade: "+quantidade);
        StatusEstoque();
    }
    
    public void ImprimeTotaldeProdutos() {
        System.out.println("Total de Produtos: "+totalProdutos);
    }
} 
