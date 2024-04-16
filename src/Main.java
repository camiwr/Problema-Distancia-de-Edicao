
public class Main {
    public static void main(String[] args) {

        // Exemplo 1
        String a = "asar";
        String b = "casa";
        System.out.println("\n-------Transformando a palavra 'a': '" + a + "', na palavra 'b': '" + b + "'-------");
        System.out.println("\nDistância de Edições: " + GerenciadorDeEdicoes.calcularDistanciaEdicao(a, b));
        System.out.println("-------------------------------------------------------------");


        // Exemplo 2
        a = "inserir";
        b = "inserção";
        System.out.println("\n-------Transformando a palavra 'a': '" + a + "', na palavra 'b': '" + b + "'-------");
        System.out.println("\nDistância de Edições: " + GerenciadorDeEdicoes.calcularDistanciaEdicao(a, b));
        System.out.println("-------------------------------------------------------------");


        // Exemplo 3
        a = "computador";
        b = "computação";
        System.out.println("\n-------Transformando a palavra 'a': '" + a + "', na palavra 'b': '" + b + "'-------");
        System.out.println("\nDistância de Edições: " + GerenciadorDeEdicoes.calcularDistanciaEdicao(a, b));
        System.out.println("-------------------------------------------------------------");


        // Exemplo 4
        a = "biblioteca";
        b = "livraria";
        System.out.println("\n-------Transformando a palavra 'a': '" + a + "', na palavra 'b': '" + b + "'-------");
        System.out.println("\nDistância de Edições: " + GerenciadorDeEdicoes.calcularDistanciaEdicao(a, b));
        System.out.println("-------------------------------------------------------------");

    }
}