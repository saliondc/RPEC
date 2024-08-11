package Pilha;

public class main {
    public static void main(String[] args) {
        // Cria uma pilha com capacidade para 5 elementos
        Stack<Integer> stack = new Stack<>(5);

        // Testando se a pilha está vazia
        System.out.println("A pilha está vazia? " + stack.isEmpty());

        // Empilhando elementos na pilha
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        // Tentando adicionar um elemento extra para verificar se a pilha está cheia
        stack.push(60);

        // Exibe o estado atual da pilha
        System.out.println("Topo da pilha: " + stack.getTop());


        // Desempilhando elementos
        System.out.println("Desempilhando: " + stack.pop());
        System.out.println("Desempilhando: " + stack.pop());

        // Exibe o estado atual da pilha
        System.out.println("Topo da pilha após desempilhar: " + stack.getTop());


        // Limpando a pilha
        stack.clear();
        System.out.println("Pilha limpa.");

        // Verificando se a pilha está vazia após a limpeza
        System.out.println("A pilha está vazia após limpar? " + stack.isEmpty());
    }
}
