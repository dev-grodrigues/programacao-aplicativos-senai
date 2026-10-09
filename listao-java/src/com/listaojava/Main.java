package com.listaojava;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		menu();
	}
	public static void menu() {
		System.out.println("=====LISTAO JAVA WESTN=====\nEscolha a questão que deseja:\n1 a 110");
		int op = sc.nextInt();
		do{
			switch(op) {
			case 1 -> questao1();
			default -> System.out.println("Opção invalida!");
			}
			break;
		}while(op != 120);
	}
	public static void questao1(){
		System.out.println("a)"+(double)(20 - 15) / 2);
		System.out.println("b)"+ (20 - 15 / 2));
		System.out.println("c)"+((double)2*5/20+30/15*2));
		System.out.println("d)"+( (double)2 * (5/20) + 30 / (15*2)));
	}
}
