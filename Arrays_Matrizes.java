import java.util.Scanner;

public class Main {

    // 1. Função sem retorno que imprime uma mensagem
    static void mensagem() {
        System.out.println("Meu primeiro programa com funcoes");
    }

    // 2. Função que recebe uma String e imprime mensagem com parâmetro
    static void imprimeNovaMensagem(String parametro) {
        System.out.println("Meu primeiro programa com funcoes e parametro: " + parametro);
    }

    // 3. Método que retorna o maior entre dois números
    static int encontrarMax(int a, int b) {
        return (a > b) ? a : b;
    }

    // 4. Método que retorna true se número for par, false se ímpar
    static boolean isPar(int numero) {
        return numero % 2 == 0;
    }

    // 5. Método que retorna o dia da semana baseado em número (1-7)
    static String exibirDiaSemana(int numero) {
        switch (numero) {
            case 1: return "domingo";
            case 2: return "segunda";
            case 3: return "terça";
            case 4: return "quarta";
            case 5: return "quinta";
            case 6: return "sexta";
            case 7: return "sábado";
            default: return "Dia da semana inválido";
        }
    }

    // 6a. Retorna o maior valor de um vetor
    static int maiorValor(int[] vetor) {
        int maior = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        return maior;
    }

    // 6b. Retorna o menor valor de um vetor
    static int menorValor(int[] vetor) {
        int menor = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        return menor;
    }

    // 6c. Retorna a média entre o maior e menor valor de um vetor
    static double mediaMaxMin(int[] vetor) {
        int max = maiorValor(vetor);
        int min = menorValor(vetor);
        return (max + min) / 2.0;
    }

    // 7. Método que calcula o fatorial de um número
    static long calcularFatorial(int n) {
        long fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Teste do exercício 1
        System.out.println("=== Exercício 1 ===");
        mensagem();
        mensagem();
        mensagem();

        // Teste do exercício 2
        System.out.println("\n=== Exercício 2 ===");
        imprimeNovaMensagem("Primeira chamada");
        imprimeNovaMensagem("Segunda chamada");
        imprimeNovaMensagem("Terceira chamada");

        // Teste do exercício 3
        System.out.println("\n=== Exercício 3 ===");
        System.out.print("Digite o primeiro número: ");
        int num1 = entrada.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = entrada.nextInt();
        System.out.println("O maior número é: " + encontrarMax(num1, num2));

        // Teste do exercício 4
        System.out.println("\n=== Exercício 4 ===");
        System.out.println("Digite números para verificar se são pares (0 para sair):");
        while (true) {
            int n = entrada.nextInt();
            if (n == 0) break;
            if (isPar(n)) {
                System.out.println("número par");
            } else {
                System.out.println("número impar");
            }
        }

        // Teste do exercício 5
        System.out.println("\n=== Exercício 5 ===");
        System.out.print("Digite um número de 1 a 7 para o dia da semana: ");
        int dia = entrada.nextInt();
        System.out.println("Dia correspondente: " + exibirDiaSemana(dia));

        // Teste do exercício 6
        System.out.println("\n=== Exercício 6 ===");
        int[] vetor = {10, 5, 22, 8, 15};
        System.out.println("Vetor: 10, 5, 22, 8, 15");
        System.out.println("Maior valor: " + maiorValor(vetor));
        System.out.println("Menor valor: " + menorValor(vetor));
        System.out.println("Média entre maior e menor: " + mediaMaxMin(vetor));

        // Teste do exercício 7
        System.out.println("\n=== Exercício 7 ===");
        System.out.print("Digite um número para calcular o fatorial: ");
        int f = entrada.nextInt();
        System.out.println("Fatorial de " + f + " = " + calcularFatorial(f));

        entrada.close();
    }
}
