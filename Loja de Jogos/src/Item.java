public abstract class Item {
    protected String nome;
    protected double preco;
    protected int ID;
    protected int qtdEstoque;

    public Item(String nome, double preco, int ID) {
        this.nome = nome;
        this.preco = preco;
        this.ID = ID;
        this.qtdEstoque = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public void exibirDetalhes(){
        System.out.println("ID: " + ID);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade em Estoque: " + qtdEstoque);
    }
}