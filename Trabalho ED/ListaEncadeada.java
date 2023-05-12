import java.util.NoSuchElementException;

public class ListaEncadeada {
    public static class Elemento {
        String valor;
        Elemento prox;

        public Elemento(String valor) {
            this.valor = valor;
            this.prox = null;
        }

        @Override
        public String toString() {
            return this.valor + " --> " + this.prox;
        }
    }

    Elemento inicio;
    // Retornando verdadeiro se a lista estiver vazia
    public boolean isEmpty() {
        return inicio == null;
    }
    //Retornando o tamanho da lista
    public int size() {
        int count = 0;
        Elemento atual = inicio;

        while (atual != null) {
            count++;
            atual = atual.prox;
        }

        return count;
    }
    //Removendo todos os elementos da lista, deixando-a vazia
    public void clear() {
        inicio = null;
    }

    public String removeFirst() {
        if (inicio == null) {
            throw new NoSuchElementException("A lista está vazia");
        }

        String valor = inicio.valor;
        inicio = inicio.prox;
        return valor;
    }

    public void addFirst(String valor) {
        Elemento novo = new Elemento(valor);
        novo.prox = inicio;
        inicio = novo;
    }

    public void addLast(String valor) {
        Elemento novo = new Elemento(valor);

        if (inicio == null) {
            inicio = novo;
        } else {
            Elemento atual = inicio;

            while (atual.prox != null) {
                atual = atual.prox;
            }

            atual.prox = novo;
        }
    }
    //Alterando o valor do elemento na posição do índice,retornando o valor anterior.
    public String set(int indice, String novoValor) {
        if (indice < 0 || indice >= size()) {
            throw new IndexOutOfBoundsException("O índice está fora dos limites da lista");
        }

        Elemento atual = inicio;
        int count = 0;

        while (count < indice) {
            atual = atual.prox;
            count++;
        }

        String valorAnterior = atual.valor;
        atual.valor = novoValor;
        return valorAnterior;
    }

    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        lista.addFirst("Batata");
        lista.addFirst("Cenoura");
        lista.addFirst("Melancia");

        System.out.println("Lista antes de remover: " + lista.inicio);

        String removido = lista.removeFirst();
        System.out.println("Removido: " + removido);

        System.out.println("Lista depois de remover: " + lista.inicio);

        lista.addLast("Laranja");
        lista.addLast("Abacaxi");

        System.out.println("Lista depois de adicionar no final: " + lista.inicio);

        System.out.println("A lista está vazia? " + lista.isEmpty());
        System.out.println("Tamanho da lista: " + lista.size());

        lista.clear();
        System.out.println("Lista após o clear: " + lista.inicio);

        lista.addFirst("Maçã");
        lista.addFirst("Banana");
        lista.addFirst("Pera");

        System.out.println("Lista antes de alterar o valor: " + lista.inicio);
        String valorAnterior = lista.set(1, "Uva");
        System.out.println("Valor anterior: " + valorAnterior);
    }
}

