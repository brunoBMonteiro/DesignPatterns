package withbuilder;

/*
    Aplicando o padrão de projeto Builder, temos agora um objeto “construtor”
    para o objeto Pizza. A classe Pizza está um pouco mais complexa
 */

public class TestePizza {

    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder(10)
                .queijo()
                .tomate()
                .bacon()
                .build();

    }
}
