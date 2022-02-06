package withoutbuilder;

public class Pizza {

    private int tamanho;
    private boolean queijo;
    private boolean tomate;
    private boolean bacon;

    Pizza(int tamanho) {
        this.tamanho = tamanho;
    }

    Pizza(int tamanho, boolean queijo) {
        this(tamanho);
        this.queijo = queijo;
    }

    Pizza(int tamanho, boolean queijo, boolean tomate) {
        this(tamanho, queijo);
        this.tomate = tomate;
    }

    Pizza(int tamanho, boolean queijo, boolean tomate, boolean bacon) {
        this(tamanho, queijo, tomate);
        this.bacon = bacon;
    }

}
