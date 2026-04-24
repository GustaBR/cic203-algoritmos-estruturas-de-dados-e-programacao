public class ArvoreBinariaBusca {
	private No raiz;

	public ArvoreBinariaBusca() {
    	this.raiz = null;
  	}

	public void inserir(int valor){
		this.raiz = inserirRecursivo(this.raiz, valor);
	}

	private No inserirRecursivo(No atual, int valor) {
		if (atual == null)
			return new No(valor);
		if (valor < atual.valor)
			atual.esquerda = inserirRecursivo(atual.esquerda, valor);
		else if (valor > atual.valor)
			atual.direita = inserirRecursivo(atual.direita, valor);
		return atual;
	}

	public boolean buscar(int valor) {
		return buscarRecursivo(this.raiz, valor);
	}

	private boolean buscarRecursivo(No atual, int valor){
		if (atual == null)
			return false;
		if (valor == atual.valor)
			return true;
		if (valor < atual.valor)
			return buscarRecursivo(atual.esquerda, valor);
		return buscarRecursivo(atual.direita, valor);  
	}

	public void preOrdem() {
		preOrdemRecursivo(raiz);
		System.out.println();
	}

	private void preOrdemRecursivo(No atual) {
		if (atual == null)
			return;
		System.out.print(atual.valor + " ");
		if (atual.esquerda != null)
			preOrdemRecursivo(atual.esquerda);
		if (atual.direita != null)
			preOrdemRecursivo(atual.direita);
	}

	public void emOrdem() {
		emOrdemRecursivo(raiz);
		System.out.println();
	}

	private void emOrdemRecursivo(No atual) {
		if (atual == null)
			return;
		if (atual.esquerda != null)
			emOrdemRecursivo(atual.esquerda);
		System.out.print(atual.valor + " ");
		if (atual.direita != null)
			emOrdemRecursivo(atual.direita);
	}

	public void posOrdem() {
		posOrdemRecursivo(raiz);
		System.out.println();
	}

	private void posOrdemRecursivo(No atual) {
		if (atual == null) {
			return;
		}
		posOrdemRecursivo(atual.esquerda);
		posOrdemRecursivo(atual.direita);
		System.out.print(atual.valor + " ");
	}

	public int somar() {
		return somarRecursivo(raiz);
	}

	private int somarRecursivo(No atual) {
		int soma = 0;
		if (atual == null)
			return 0;
		if (atual.esquerda != null)
			soma += somarRecursivo(atual.esquerda);
		if (atual.direita != null)
			soma += somarRecursivo(atual.direita);
		soma += atual.valor;
		return soma;
	}
}