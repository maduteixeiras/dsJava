public class Vetores {
    public static void main(String[] args) {

    int[] colecaoDeInteiros = {1,2,3};
    System.out.println(colecaoDeInteiros[0]); 
    // Dessa maneira, já inicializamos o vetor com um determinado valor\comprimento e não conseguimos mais alterar ou adicionar novos elementos.

    // mostrar comprimento do vetor - length
    // O .length é um atributo do vetor que retorna o tamanho (número de elementos) do vetor
    System.out.println("Tamanho do vetor coleção de inteiros: " + colecaoDeInteiros.length);
    String[] colecaoDeNomes = {"Maria", "Carla"};
    System.out.println(colecaoDeNomes[1]);

    
    int n[] = {1,2,9,4};
        for (int i = 0; i < n.length - 1; i++){
            System.out.println(n[i]);
        }

        
    }
    
}

