public class Teste_tree {
	public static void main(String[] args) {

		Tree<Integer> tree = new Tree<Integer>();
		tree.adicionar(10);
		tree.adicionar(8);
		tree.adicionar(5);
		tree.adicionar(9);
		tree.adicionar(7);
		tree.adicionar(18);
		tree.adicionar(13);
		tree.adicionar(20);
		System.out.println("Em ordem: ");
		tree.emOrdem(tree.getRaiz());
		
		System.out.println("\nPré Ordem: ");
		tree.preOrdem(tree.getRaiz());
		
		System.out.println("\nPós Ordem: ");
		tree.posOrdem(tree.getRaiz());
	}
}

