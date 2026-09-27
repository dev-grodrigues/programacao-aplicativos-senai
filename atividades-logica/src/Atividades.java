import java.util.Scanner;

public class Atividades {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Digite o 1 número: ");
		int n1 = sc.nextInt();
		System.out.println("Digite o 2 número: ");
		int n2 = sc.nextInt();
		int soma = n1 + n2;
		System.out.println("Soma = "+ soma);
	}
}
