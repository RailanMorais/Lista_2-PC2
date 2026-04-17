import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Gerenciador loja = new Gerenciador();
        Scanner leitor = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("-----------------------------------");
            System.out.println("Console");
            System.out.println("1 - Cadastrar Item");
            System.out.println("2 - Listar Itens");
            System.out.println("3 - Buscar Item por Nome");
            System.out.println("4 - Atualizar Estoque");
            System.out.println("5 - Calcular Valor Total do Estoque");
            System.out.println("6 - Exibir Itens com Estoque Zerado");
            System.out.println("7 - Exibir Itens Ordenados por Preço");
            System.out.println("0 - Sair");
            System.out.println("-----------------------------------");
            opcao = leitor.nextInt();
            leitor.nextLine();
            switch (opcao) {

            case 1 -> {
                System.out.println("-----------------------------------");
                System.out.println("Qual o tipo do item:");
                System.out.println("1 - Jogo");
                System.out.println("2 - Acessório");
                System.out.println("3 - Colecionável");
                System.out.println("4 - Console");
                System.out.println("0 - Voltar");
                System.out.println("-----------------------------------");
                int tipoItem = leitor.nextInt();
                leitor.nextLine();
                if (tipoItem == 1) {
                    System.out.print("Digite o nome do jogo: ");
                    String nome = leitor.nextLine();
                    System.out.print("Digite o preço do jogo: ");
                    double preco = leitor.nextDouble();
                    System.out.print("Digite o ID do jogo: ");
                    int ID = leitor.nextInt();
                    leitor.nextLine();
                    System.out.print("Digite a plataforma do jogo: ");
                    String plataforma = leitor.nextLine();
                    System.out.print("Digite o gênero do jogo: ");
                    String genero = leitor.nextLine();
                    Jogos jogo = new Jogos(nome, preco, ID, plataforma, genero);
                    loja.cadastrarItem(jogo);
                } else if (tipoItem == 2) {
                    System.out.print("Digite o nome do acessório:");
                    String nome = leitor.nextLine();
                    System.out.print("Digite o preço do acessório:");
                    double preco = leitor.nextDouble();
                    System.out.print("Digite o ID do acessório:");
                    int ID = leitor.nextInt();
                    leitor.nextLine();
                    System.out.print("Digite o tipo do acessório:");
                    String tipo = leitor.nextLine();
                    Acessorio acessorio = new Acessorio(nome, preco, ID, tipo);
                    loja.cadastrarItem(acessorio);
                } else if (tipoItem == 3) {
                    System.out.print("Digite o nome do colecionável: ");
                    String nome = leitor.nextLine();
                    System.out.print("Digite o preço do colecionável: ");
                    double preco = leitor.nextDouble();
                    System.out.print("Digite o ID do colecionável: ");
                    int ID = leitor.nextInt();
                    leitor.nextLine();
                    System.out.print("Digite a franquia do colecionável: ");
                    String franquia = leitor.nextLine();
                    System.out.print("Digite o material do colecionável: ");
                    String material = leitor.nextLine();
                    Colecionaveis colecionavel = new Colecionaveis(nome, preco, ID, franquia, material);
                    loja.cadastrarItem(colecionavel);
                } else if (tipoItem == 4) {
                    System.out.print("Digite o nome do console: ");
                    String nome = leitor.nextLine();
                    System.out.print("Digite o preço do console: ");
                    double preco = leitor.nextDouble();
                    System.out.print("Digite o ID do console: ");
                    int ID = leitor.nextInt();
                    leitor.nextLine();
                    System.out.print("Digite a marca do console: ");
                    String marca = leitor.nextLine();
                    System.out.print("Digite a cor do console: ");
                    String cor = leitor.nextLine();
                    System.out.print("Digite a capacidade de armazenamento do console: ");
                    int armazenamento = leitor.nextInt();
                    leitor.nextLine();
                    Consoles console = new Consoles(nome, preco, ID, marca, cor, armazenamento);
                    loja.cadastrarItem(console);
                } else if (tipoItem == 0) {
                    break;
                } else {
                    System.out.println("Opção inválida.");
                    break;
                }
            }
            case 2 -> {
                if (loja.getEstoque().isEmpty()) {
                    System.out.println("Não há produtos cadastrados.");
                    break;
                }
                loja.listarItens();
            } 
            case 3 -> {
                if (loja.getEstoque().isEmpty()) {
                    System.out.println("Não há produtos cadastrados.");
                    break;
                }
                System.out.print("Digite o nome do item que deseja buscar: ");
                String nomeBusca = leitor.nextLine();
                loja.buscarItemPorNome(nomeBusca);
            } 
            case 4 -> {
                if (loja.getEstoque().isEmpty()) {
                    System.out.println("Não há produtos cadastrados.");
                    break;
                }
                System.out.print("Digite o ID do item que deseja atualizar o estoque: ");
                int idAtualizar = leitor.nextInt();
                leitor.nextLine();
                System.out.print("Digite a nova quantidade em estoque: ");
                int novaQtdEstoque = leitor.nextInt();
                leitor.nextLine();
                loja.atualizarEstoque(idAtualizar, novaQtdEstoque);
            }
            case 5 -> {
                if (loja.getEstoque().isEmpty()) {
                    System.out.println("Não há produtos cadastrados.");
                    break;
                }
                double valorTotal = loja.calcularValorTotalEstoque();
                System.out.println("Valor total do estoque: R$ " + valorTotal);
            } 
            case 6 -> {
                if (loja.getEstoque().isEmpty()) {
                    System.out.println("Não há produtos cadastrados.");
                    break;
                }
                loja.exibirItensEstoqueZerado();
            }
            case 7 -> {
                if (loja.getEstoque().isEmpty()) {
                    System.out.println("Não há produtos cadastrados.");
                    break;
                }
                loja.exibirItensOrdenadosPorPreco();
            }
             case 0 -> System.out.println("Encerrando o programa.");
            default -> {
                System.out.println("Opção inválida. Por favor, tente novamente.");
            }
        }
        } while (opcao != 0);
        leitor.close();
    }
}