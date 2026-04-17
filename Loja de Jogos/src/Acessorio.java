public class Acessorio extends Item{
    private String tipo;

    public Acessorio(String nome, double preco, int ID, String tipo) {
        super(nome, preco, ID);
        this.tipo = tipo;
    }
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tipo: " + tipo);
    }
}