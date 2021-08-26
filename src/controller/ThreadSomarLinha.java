package controller;

public class ThreadSomarLinha extends Thread{
	int vetor[];
	int numeroLinha;
	public ThreadSomarLinha(int vetor[],int numeroLinha) {
		super();
		this.vetor = vetor;
		this.numeroLinha = numeroLinha;
	}
	
	@Override
	public void run() {
		int soma = 0;
		for (int valor : vetor) {
			soma += valor;
		}
		System.out.println("Resultado da soma da linha " + (this.numeroLinha+1) + ": " + soma);
	}
}
