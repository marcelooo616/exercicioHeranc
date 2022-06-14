package br.com.generation.faturamento;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Atributo pare = new Atributo();
		lista list = new lista();
		Atributo atributo = new Atributo();
		
		System.out.println("======Lista de compras=====");
		
		
		
		while(pare.pare != "sim") {
			
			System.out.println("Digite o nome do produto: ");
			list.nome = sc.next();
			System.out.println("Digite o valor: ");
			list.valor = sc.nextDouble();
			System.out.println("Digite a quantidade: ");
			list.quantidade = sc.nextInt();
			System.out.println("continuar....");
			pare.pare = sc.next();
			
			list.resultado = list.valor * list.quantidade;
		
		    
			
		}
		System.out.println(list.resultado);
		


	}

}
