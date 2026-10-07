import java.util.Arrays; 
public class ManipulacaoVetorNativo {
    public static void main(String[] args) {
        
        String[] nomes = {"Mariana", "Carla", "Heitor", "Yuri", "Marcela", "Beatriz"};
        int[] numeros = {20, 70, 40, 55, 2, 200};

        
        // Arrays.sort(vetor) - Ordena o vetor em ordem alfabética/crescente
        for (int i : numeros) {
            Arrays.sort(numeros);
            System.out.print(i + " ");
        }

        for (String a : nomes) {
            Arrays.sort(nomes);
            System.out.print(a + " ");
        }

        // Arrays.toString(vetor) - converte um vetor em um String formatada para exibição mais fácil.
        for (int n : numeros) {
            Arrays.toString(numeros);
            System.out.print(n + " ");
        }

        // Arrays.binarySearch(vetor,valor) - Busca a posição de um elemento no vetor (requer que o vetor já esteja ordenado).

        Arrays.sort(numeros); // binarySearch só funciona corretamente se o array estiver previamente ordenado. Por isso, o Arrays.sort() deve vir antes da busca.
        int posicao = Arrays.binarySearch(numeros, 200);
        if (posicao >= 0) {
            System.out.println("\nO número 200 está na posição " + posicao);
        } else {
            System.out.println("\nPosição não encontrada");
        }
        
    }
    
}
