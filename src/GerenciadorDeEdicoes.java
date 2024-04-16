public class GerenciadorDeEdicoes {

    public static int calcularDistanciaEdicao(String a, String b) {
        int numeroDeEdicoes = 0;
        int indiceA = 0;
        int indiceB = 0;

        while (indiceA < a.length() && indiceB < b.length()) {
            if (a.charAt(indiceA) != b.charAt(indiceB)) {
                if (indiceA + 1 < a.length() && a.charAt(indiceA + 1) == b.charAt(indiceB)) {
                    System.out.println("Remove '" + a.charAt(indiceA) + "' em a");
                    numeroDeEdicoes++;
                    indiceA++;
                } else if (indiceB + 1 < b.length() && b.charAt(indiceB + 1) == a.charAt(indiceA)) {
                    System.out.println("Insere '" + b.charAt(indiceB) + "' em a");
                    numeroDeEdicoes++;
                    indiceB++;
                } else {
                    System.out.println("Substitui '" + a.charAt(indiceA) + "' por '" + b.charAt(indiceB) + "' em a");
                    numeroDeEdicoes++;
                    indiceA++;
                    indiceB++;
                }
            } else {
                indiceA++;
                indiceB++;
            }
        }

        // Adicionando operações para caracteres restantes
        while (indiceA < a.length()) {
            System.out.println("Remove '" + a.charAt(indiceA) + "' em a");
            numeroDeEdicoes++;
            indiceA++;
        }

        while (indiceB < b.length()) {
            System.out.println("Insere '" + b.charAt(indiceB) + "' em a");
            numeroDeEdicoes++;
            indiceB++;
        }

        return numeroDeEdicoes;
    }
}