import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        long tempoInicio = System.currentTimeMillis();
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a quantidade de dicos: ");
        int discos = scan.nextInt();

        Pilha pinoA = new Pilha('A');
        Pilha pinoB = new Pilha('B');
        Pilha pinoC = new Pilha('C');

        // Inicia todas os dicos no pino A
        for(int i = discos; i > 0; i--) {
            pinoA.empilha(i);
        }

        // Movimentações
        Hanoi.torreHanoi(discos, pinoA, pinoC, pinoB);

        scan.close(); // Encerra a leitura
        System.out.println("Total de movimentos = "+(Math.pow(2,discos)-1));
        long tempFinal = System.currentTimeMillis();
        System.out.println((tempFinal-tempoInicio)/1000 + " segundos");
    }
}


