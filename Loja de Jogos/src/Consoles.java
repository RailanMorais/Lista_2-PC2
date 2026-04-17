public class Consoles extends Item {
    private String marca;
    private String cor;
    private int armazenamento;

    public Consoles(String nome, double preco, int ID, String marca, String cor, int armazenamento) {
        super(nome, preco, ID);
        this.marca = marca;
        this.cor = cor;
        this.armazenamento = armazenamento;
    }
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Marca: " + marca);
        System.out.println("Cor: " + cor);
        System.out.println("Armazenamento: " + armazenamento + "GB");
    }
}
