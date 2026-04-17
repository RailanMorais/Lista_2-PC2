public class Colecionaveis extends Item {
    private String franquia;
    private String material;

    public Colecionaveis(String nome, double preco, int ID, String franquia, String material) {
        super(nome, preco, ID);
        this.franquia = franquia;
        this.material = material;
    }

    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Franquia: " + franquia);
        System.out.println("Material: " + material);
    }
}