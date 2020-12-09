public class Disco{
    private int valor;
    private Disco anterior;

    public void setAnterior(Disco anterior) {
        this.anterior = anterior;
    }
    public Disco getAnterior() {
        return anterior;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    public int getValor() {
        return valor;
    }
}
