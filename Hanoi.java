public class Hanoi {
    // Executa movimentações entre as pilhas
    public static void torreHanoi(int discos, Pilha origem, Pilha destino, Pilha auxiliar) throws Exception {
        if (discos > 0) {
            torreHanoi(discos - 1, origem, auxiliar, destino);
            destino.empilha(origem.desempilha()); // Troca entre pinos
            torreHanoi(discos - 1, auxiliar, destino, origem);
        }
    }
}
