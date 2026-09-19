import java.util.Scanner;
import java.util.Random;
public class AtividadeLogica {
    static Scanner tc = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        int op;
        do {
            System.out.println("Digite um numero de 1 a 14 ou 0:SAIR");
            op = tc.nextInt();
            switch (op) {
                case 1: {
                    questao01();
                    break;
                }
                case 2: {
                    questao02();
                    break;
                }
                case 3: {
                    questao03();
                    break;
                }
                case 4: {
                    questao04();
                    break;
                }
                case 5: {
                    questao05();
                    break;
                }
                case 6: {
                    questao06();
                    break;
                }
                case 7: {
                    questao07();
                    break;
                }
                case 8: {
                    questao08();
                    break;
                }
                case 9: {
                    questao09();
                    break;
                }
                case 10: {
                    questao10();
                    break;
                }
                case 11: {
                    questao11();
                    break;
                }
                case 12: {
                    questao12();
                    break;
                }
                case 13: {
                    questao13();
                    break;
                }
                case 14: {
                    questao14();
                    break;
                }
                case 0: {
                    System.out.println("Voce saiu!");
                    break;
                }
                default:
            }
        } while (op != 0);
    }

    /* Exercicio 01: Maior e menor */
    private static void questao01() {
        int n1, n2;
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        n1 = tc.nextInt();
        System.out.println("Digite o segundo numero: ");
        n2 = tc.nextInt();

        if (n1 == n2) {
            System.out.println("Os dois numeros são iguais!");
        } else if (n1 > n2) {
            System.out.println("Maior = " + n1 + " Menor = " + n2);
        } else {
            System.out.println("Maior = " + n2 + " Menor = " + n1);
        }
    }

    /* Exercicio 02: Media de dois numeros */
    private static void questao02() {
        int n1, n2;
        System.out.println("Digite o primeiro numero");
        n1 = tc.nextInt();
        System.out.println("Digite o segundo numero");
        n2 = tc.nextInt();
        double media = (n1 + n2) / 2;
        System.out.println("A media dos numeros é" + media);
    }

    /* Exercicio 03: Par ou Impar */
    private static void questao03() {
        int n1;
        System.out.println("Digite o numero");
        n1 = tc.nextInt();
        if (n1 % 2 == 0) {
            System.out.println("O numero e par!");
        } else {
            System.out.println("O numero e impar!");
        }
    }

    /* Exercicio 04: Calculo de Idade */
    private static void questao04() {
        int anoDeNasc, idade;
        System.out.println("Digite o ano de nascimento");
        anoDeNasc = tc.nextInt();
        idade = 2026 - anoDeNasc;
        System.out.println("Sua idade é:" + idade);

    }

    /* Exercicio 05: Sucessor e Antecessor */
    private static void questao05() {
        int n1, antecessor, sucessor;
        System.out.println("Digite um numero");
        n1 = tc.nextInt();
        antecessor = n1 - 1;
        sucessor = n1 + 1;
        System.out.println("O antecessor é: " + antecessor + " O sucessor é: " + sucessor);
    }

    /* Exercicio 06: Media e Aprovacao de aluno */
    private static void questao06() {
        tc.nextLine();
        String nome;
        double num1, num2, num3;
        System.out.println("Nome do aluno:");
        nome = tc.nextLine();
        System.out.println("Digite a 1 nota:");
        num1 = tc.nextDouble();
        System.out.println("Digite a 2 nota:");
        num2 = tc.nextDouble();
        System.out.println("Digite a 3 nota:");
        num3 = tc.nextDouble();
        tc.nextLine();
        double media = (num1 + num2 + num3) / 3.0;
        System.out.println("Aluno: " + nome + " | Media: " + String.format("%.2f", media) + " | "+ (media >= 7 ? "Aprovado" : "Reprovado"));
    }

    /* Exercicio 07: Processamento de 20 Alunos */
    private static void questao07() {
        tc.nextLine();
        String resultadoAlunos = "";
        int contador = 0;

        for(int i = 1; i <= 20; i++) {
            System.out.println("Nome do aluno " +i);
            String nome = tc.nextLine();
            System.out.println("Digite a 1 nota:");
            double n1 = tc.nextDouble();
            System.out.println("Digite a 2 nota:");
            double n2 = tc.nextDouble();
            System.out.println("Digite a 3 nota:");
            double n3 = tc.nextDouble();
            tc.nextLine();
            double media = (n1 + n2 + n3) / 3.0;
            if (media > 8.0) {
            resultadoAlunos += "Aluno: " + nome + " | Media: " + String.format("%.2f", media) + "\n";
            contador++;
        }
    }

    System.out.println("\n--- Alunos com media maior que 8 ---");
    if (contador > 0) {
        System.out.print(resultadoAlunos);
    } else {
        System.out.println("Nenhum aluno com a media maior que 8");
    }
    }

    /* Exercicio 08: Contagem de numeros no intervalo fechado */
    private static void questao08() {
        int contador = 0;
        for (int i = 1; i <= 80; i++) {
            System.out.println("Digite o " + i + "º numero:");
            int numero = tc.nextInt();
            if (numero >= 10 && numero <= 150) {
                contador++;
            }
        }
        System.out.println("Total de numeros entre 10 e 150: " + contador);
    }

    /* Exercicio 09: Salario e Comissao do vendedor */
    private static void questao09() {
        tc.nextLine();
        System.out.println("Digite o nome do vendedor: ");
        String nome = tc.nextLine();
        System.out.println("Digite o salario fixo: ");
        double salarioFixo = tc.nextDouble();
        System.out.println("Digite o total de vendas: ");
        double totalVendas = tc.nextDouble();
        tc.nextLine();

        double comissao = totalVendas * 0.15;
        double salarioFinal = salarioFixo + comissao;

        System.out.println("Vendedor: " + nome + " | Salario fixo: R$ " + String.format("%.2f", salarioFixo)+ " | Salario final: R$ " + String.format("%.2f", salarioFinal));
    }

    /* Exercicio 10: Contagem de numeros pares e impares */
    private static void questao10() {
        tc.nextLine();
        int par = 0;
        int impar = 0;
        int numero;
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i + 1) + "º numero: ");
            numero = tc.nextInt();
            if (numero % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }
        System.out.println("Quantidade de numeros pares: " + par);
        System.out.println("Quantidade de numeros impares: " + impar);
    }

    /* Exercicio 11: Soma dos Pares e Media dos impares */
    private static void questao11() {
    tc.nextLine();
    int impar = 0;
    int somaPar = 0;
    double mediaImpar = 0;
        for(int i = 0; i < 10; i++){
            System.out.println("Digite o " + (i+1) + "º numero: ");
            int numero = tc.nextInt();
            if(numero % 2 == 0){
            somaPar += numero;
            }else{
            mediaImpar += numero;
            impar++;
            }
        }
        mediaImpar /= impar;
        System.out.println("Soma dos pares: " + somaPar);
        System.out.println("Media dos impares: " + mediaImpar);
    }
    
    /* Exercicio 12: Analise de 50 valores inteiros */
    private static void questao12() {
        int negativos = 0;
        int somaPositivos = 0;
        String valores = "";
        Random gerador = new Random();
        for(int i = 0; i < 50;i++){
            int numero = gerador.nextInt(201) - 100;
            valores += numero + " ";
            if(numero > 0){
                somaPositivos += numero;
            }else if(numero < 0){
                negativos++;
            }
        }
        System.out.println("Valores: "+ valores);
        System.out.println("Quantidade de numeros negativos: " + negativos);
        System.out.println("Soma dos numeros positivos: " + somaPositivos);

    }

    /* Exercicio 13: Pares entre 85 e 907 */
    private static void questao13() {
        int somaPares = 0;
        for(int i = 85; i <= 907;i++){
            if(i % 2 == 0){
            System.out.print(i + "-");
            somaPares += i;
            }
        }
        System.out.println("Soma dos pares: " + somaPares);
    }
    /* Exercicio 14: Analise fisica de 20 pessoas */
    private static void questao14() {
        tc.nextLine();
    String nome;
    String nomeMaiorPeso = "";
    String nomeMaiorAltura = "";
    double altura;
    double peso;
    double maiorPeso = 0;
    double maiorAltura = 0;
    for(int i = 0;i<20;i++){
        System.out.println("Digite o nome da "+(i+1)+" pessoa: ");
        nome = tc.nextLine();
        System.out.println("Digite a altura da "+(i+1)+" pessoa: ");
        altura = tc.nextDouble();
        System.out.println("Digite o peso da "+(i+1)+" pessoa: ");
        peso = tc.nextDouble();
        tc.nextLine();
        if(peso > maiorPeso){
            maiorPeso = peso;
            nomeMaiorPeso = nome;
        }
        if(altura > maiorAltura){
            maiorAltura = altura;
            nomeMaiorAltura = nome;
        }
    }
    System.out.println("Pessoa com maior peso: "+nomeMaiorPeso+" | Peso: "+maiorPeso);
    System.out.println("Pessoa com maior altura: "+nomeMaiorAltura+" | Altura: "+maiorAltura);
    }
}