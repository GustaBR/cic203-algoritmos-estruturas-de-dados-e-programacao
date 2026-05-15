public class Teste {
    public static void main(String[] args) {
        var maxHeap = new MaxHeap(new int[] {6, 2, 1, 4, 3, 5, 10, 40, 1, 3, 45, 5, 67});

        maxHeap.imprimirTopK(14);
        System.out.println(maxHeap);
    }
}