public class Pilha {
    Disco topo = null;
    char nome;

    // Nome para identificação do pino
    public Pilha(char nome) {
        this.nome = nome;
    }

    public void empilha(int valor) throws Exception {
        if(topo != null) {
            if(valor > topo.getValor()) {
                throw new Exception("Erro: O disco não pode ser maior que a anterior");
            }
        }
        Disco novo = new Disco();
        novo.setValor(valor);
        novo.setAnterior(topo);
        topo = novo;
    }

    public int desempilha() throws Exception {
        if (topo == null) {
            throw new Exception("Erro: Pilha vazia");
        }

        int valor = topo.getValor();
        topo = topo.getAnterior();
        return valor;
    }
}
