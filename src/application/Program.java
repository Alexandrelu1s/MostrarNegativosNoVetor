package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de numeros: ");
		int quantidade = sc.nextInt();
		
		int[] vetor = new int[quantidade];
		
		System.out.println("Digite " + quantidade + " numeros inteiros: ");
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Numero: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("Numeros negativo: ");
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] < 0) {
				System.out.println(vetor[i]);
			}
		}
		
		sc.close();
	}

}
