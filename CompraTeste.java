package Arrays;

public class CompraTeste {
	public static void main(String[] args) {
		Compra compra = new Compra();
		
		compra.cliente = "Felipe Celestino";
		
		compra.itens.add(new Item("RTX 3070", 3.400, 7));
		compra.itens.add(new Item("Monitor 144hz", 1.200, 7));
		compra.itens.add(new Item("Fonte 650W", 677.89, 7));
		compra.itens.add(new Item("Ryzen 9", 2.000, 7));
		compra.itens.add(new Item("Memoria Corsair 32 gb", 677.89, 7));
		
		for(Item item: compra.itens) {
			System.out.print("|" + item.nome + "|");
			System.out.print("|" + item.preco + "|");
			System.out.println("|" + item.quantidade + "|");
		}
		
		System.out.println("Total: " + compra.valorTotal());
	}
}
