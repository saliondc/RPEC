public class FilaEstatica {

    private int[] dados; // Array que armazena os elementos da fila
    private int inicio;  // Indice do primeiro elemento da fila
    private int fim;    // Índice do próximo espaço vazio na fila
    private int tamanho; // Tamanho máximo da fila

    public FilaEstatica(int tamanho) {
        this.tamanho = tamanho;
        this.dados = new int[tamanho];
        this.inicio = 0;
        this.fim = 0;
    }


    public boolean vazia() {
        return inicio == fim;
    }

        public boolean cheia() {
        return fim == tamanho;
    }

        public void enfileirar(int valor) {
        if (cheia()) {
            System.out.println("Fila cheia!");
            return;
        }
        dados[fim] = valor;
        fim++;
        System.out.println(valor + " enfileirado na fila.");
    }


    public int desenfileirar() {
        if (vazia()) {
            System.out.println("Fila vazia!");
            return -1; // Valor para indicar erro
        }
        int valor = dados[inicio];
        inicio++;
        System.out.println(valor + " desenfileirado da fila.");
        return valor;
    }

       public void imprimir() {
        if (vazia()) {
            System.out.println("Fila vazia!");
            return;
        }
        System.out.print("Fila: ");
        for (int i = inicio; i < fim; i++) {
            System.out.print(dados[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        FilaEstatica fila = new FilaEstatica(5);
        fila.enfileirar(10);
        fila.enfileirar(20);
        fila.enfileirar(30);
        fila.imprimir();

        fila.desenfileirar();
        fila.imprimir();

        fila.enfileirar(40);
        fila.enfileirar(50);
        fila.imprimir();

         fila.enfileirar(60);
        fila.imprimir();
    }
}