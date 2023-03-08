package examples.polimorfism;

public class Example2 {
	public static void main(String[] args) {
		Pilha<Integer> pilha = new Pilha<Integer>();
		pilha.push(5);
		System.out.println(pilha.top());
	}
}

