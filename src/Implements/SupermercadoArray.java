package Implements;

public class SupermercadoArray implements Supermercado{
    private final String[] items;
    private int lastIndex;

    public SupermercadoArray(final int size) {
        items = new String[size];
        lastIndex = -1;
    }

    @Override
    public void add(final String item) {
        if(lastIndex == items.length-1) {
            System.out.println("Lista cheia");
        }else {
            lastIndex++;
            items[lastIndex] = item;
        }

    }

    @Override
    public void print() {
        System.out.println("============================================");
        if(lastIndex < 0) {
            System.err.println("Lista vazia");
        }
        for(int i = 0; i <= lastIndex; i++){
            System.out.println(i + " - " + items[i]);
        }
        System.out.println("============================================");
    }

    @Override
    public void remove(final int index) {
        if (index >= 0 && index <= lastIndex) {
            shift(index);
            lastIndex--;
        } else {
            System.err.println("Índice inválido");
        }
    }

    private void shift(final int index) {
        for(int i = index; i < lastIndex; i++) {
            items[i] = items[i+1];
        }
    }


}
