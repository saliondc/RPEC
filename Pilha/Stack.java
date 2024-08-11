package Pilha;

import java.util.Arrays;

public class Stack<T> {
    private int top = -1;
    private T[] data;
    @SuppressWarnings("unchecked")
    public Stack(int size) {
        this.data = (T[]) new Object[size];
    }
    public Stack(int top, T[] data) {
        this.top = top;
        this.data = data;
    }
    public int getTop() {
        return top;
    }
    public void setTop(int top) {
        this.top = top;
    }
    public T[] getData() {
        return data;
    }
    public void setData(T[] data) {
        this.data = data;
    }
    public void push(T element) {
        if (isFull()) {
            System.out.println("A pilha está cheia. Não é possível adicionar mais elementos.");
            return;
        }
        data[++top] = element;
    }
    public T pop() {
        if (isEmpty()) {
            System.out.println("A pilha está vazia. Não há elementos para remover.");
            return null;
        }
        return data[top--];
    }
    public void clear() {
        Arrays.fill(data, null);
        top = -1;
    }
    public boolean isFull() {
        return top == data.length - 1;
    }
    public boolean isEmpty() {
        return top == -1;
    }
}