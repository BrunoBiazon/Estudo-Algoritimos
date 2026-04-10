package Capitulos.capitulo_01;

public class BuscaBinaria {

    public static int busca(int[] lista, int num_desejado) {
        int baixo = 0;
        int alto = lista.length - 1;
        int meio, tentativa;
        int num_etapas = 0;

        while (baixo <= alto) {
            meio = (baixo + alto) / 2;
            tentativa = lista[meio];
            num_etapas += 1;

            if (tentativa == num_desejado) {
                System.out.println("Numero de etapas: " + num_etapas);
                return meio;
            }
            if (tentativa > num_desejado) {
                alto = meio - 1;
            } else {
                baixo = meio + 1;
            }
        }
        System.out.println("Não encontrado, numero de etapas: " + num_etapas);
        return -1; // Como java é tipado, tenho que retornar um inteiro, então coloquei -1
    }

    public static void main(String[] args) {
        int[] lista1 = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
        int num_desejado_lista1 = 300;

        int[] lista2 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int num_desejado_lista2 = 6;
        int num_desejado_lista2_erro = 5;

        int resultado1 = busca(lista1, num_desejado_lista1);
        System.out.println("Lista 1: " + resultado1);

        int resultado2 = busca(lista2, num_desejado_lista2);
        System.out.println("Lista 2: " + resultado2);

        int resultado3 = busca(lista2, num_desejado_lista2_erro);
        System.out.println("Lista 2 (exemplo com n inexistente na lista2): " + resultado3);
    } 
}