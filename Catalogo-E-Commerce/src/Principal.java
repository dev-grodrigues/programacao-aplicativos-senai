import java.util.Scanner;

public class Principal {
 static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		menu();
	}
	public static void menu() {
		CatalogoProdutos iPlace = new CatalogoProdutos();
		int op;
		do {
			System.out.println("=====CATALOGO E-COMMERCE=====");
			System.out.println("1-Cadastrar Produto\n2-Buscar Produto(Via Codigo)\n3-Remover Produto(Via Codigo)\n4-Listar Produto\n5-Sair.");
			op = sc.nextInt();
			switch(op) {
			case 1: {
				sc.nextLine();
				System.out.println("Digite o nome do Produto:");
				String nomeProduto = sc.nextLine();
				System.out.println("Digite o codigo:");
				String codigo = sc.nextLine();
				System.out.println("Digite o preco custo:");
				double precoCusto = sc.nextDouble();
				System.out.println("Digite a quantidade no estoque:");
				int quantidadeEstoque = sc.nextInt();	
				System.out.println("Digite a Categoria do Produto:\n[1].Smartphone\n[2].Notebook");
				int opcao = sc.nextInt();
				
				if(opcao == 1) {
					Smartphone novoSmartphone = new Smartphone(nomeProduto, codigo, precoCusto, quantidadeEstoque);
					iPlace.adicionarProduto(novoSmartphone);
				}
				if(opcao == 2) {
					Notebook novoNotebook = new Notebook(nomeProduto, codigo, precoCusto, quantidadeEstoque);
					iPlace.adicionarProduto(novoNotebook);
				}
				break;
			}
			case 2: {
				sc.nextLine();
				System.out.println("Digite o codigo do Produto: ");
				String codigo = sc.nextLine();
				try {   
				    Produto buscaProduto = iPlace.buscarProduto(codigo);
				    System.out.println("Produto: " + buscaProduto.getNome());
				    buscaProduto.exibirCategoria();
				    System.out.println("Codigo: " + buscaProduto.getCodigo() + 
				                       "\nPreco Custo: " + buscaProduto.getPrecoCusto() + 
				                       " Quantidade Estoque: " + buscaProduto.getQuantidadeEstoque());
				    break;

				} catch (Exception e) {
					e.printStackTrace();
				    System.out.println("Nenhum produto cadastrado com este Codigo!");
				}
				break;
			}
			case 3: {
				sc.nextLine();
				System.out.println("Digite o codigo do produto:");
				String codigo = sc.nextLine();
				Produto removerProduto = iPlace.removerProduto(codigo);
				if(removerProduto != null) {
						System.out.println("Produto Removido!");
					}else{
					System.out.println("Nenhum produto cadastrado com este Codigo!");
				}
				break;
			}
			case 4: {
				iPlace.listarProduto();
				break;
			}
			case 5: {
				System.out.println("Saindo...");
				break;
				}
			default:{
				System.out.println("Erro: Somente numeros de 1 a 5!");
			}
			}
			}while(op != 5);
	}
}