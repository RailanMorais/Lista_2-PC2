public class Jogos extends Item {
    private String plataforma;
    private String genero;

    public Jogos(String nome, double preco, int ID, String plataforma, String genero) {
        super(nome, preco, ID);
        this.plataforma = plataforma;
        this.genero = genero;
    }

    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Gênero: " + genero);
    }
}
