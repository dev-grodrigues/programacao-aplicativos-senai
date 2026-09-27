

public class Main {

	public static void main(String[] args) {
		Inventario i = new Inventario();
		Laptop l = new Laptop("Thinkpad","Lenovo", 2500, EstadoProduto.MOSTRUARIO,CategoriaProduto.LAPTOP, 14, "I5-10400F");
		Smartphone s = new Smartphone("ZFold 8","Samsung", 5000, EstadoProduto.NOVO,CategoriaProduto.SMARTPHONE, 5000,256);
		Smartphone ip = new Smartphone("Iphone 15","Apple", 5000, EstadoProduto.NOVO,CategoriaProduto.SMARTPHONE, 5000,256);
		System.out.println("Total Produtos criados: "+Produto.getTotalProdutos());
		i.adicionarProduto(s);
		i.adicionarProduto(l);
		i.adicionarProduto(ip);
		System.out.println(i.listarProdutos());
		System.out.println(i.buscaProduto(3));
		System.out.println(i.buscaProdutoPorCategoria(CategoriaProduto.SMARTPHONE));
		i.atualizarPreço(3, 4500.99);
		System.out.println(i.buscaProduto(3));
		i.removerProduto(4);
		System.out.println(i.listarProdutos());
	}
}
