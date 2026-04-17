import java.util.ArrayList;

public class Gerenciador {
    private ArrayList<Item> estoque;
    
    public Gerenciador() {
        estoque = new ArrayList<>();
    }

    public void cadastrarItem(Item item) {
        estoque.add(item);
    }
    public void listarItens() {
        for (Item item : estoque) {
            item.exibirDetalhes();
            System.out.println("-------------------");
        }
    }
    public void buscarItemPorNome(String nome) {
        for (Item item : estoque) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                item.exibirDetalhes();
                return;
            }
        }
        System.out.println("Item não encontrado: " + nome);
    }
    public void atualizarEstoque(int ID, int novaQuantidade) {
        for (Item item : estoque) {
            if (item.getID() == ID) {
                item.setQtdEstoque(novaQuantidade);
                System.out.println("Estoque atualizado para o item: " + item.getNome());
                return;
            }
        }
        System.out.println("Item não encontrado");
    }
    public float calcularValorTotalEstoque() {
        float valorTotal = 0;
        for (Item item : estoque) {
            valorTotal += item.getPreco() * item.getQtdEstoque();
        }
        return valorTotal;
    }
    public void exibirItensEstoqueZerado() {
        for (Item item : estoque) {
            if (item.getQtdEstoque() == 0) {
                item.exibirDetalhes();
                System.out.println("-------------------");
            }
        }
    }
    public void exibirItensOrdenadosPorPreco() {
        estoque.sort((item1, item2) -> Double.compare(item1.getPreco(), item2.getPreco()));
        listarItens();
    }

    public ArrayList<Item> getEstoque() {
        return estoque;
    }
}