public class Teste {
    public static void main(String[] args) {
        var arvore = new ArvoreBinariaBusca();
        arvore.inserir(50);
        arvore.inserir(40);
        arvore.inserir(60);
        arvore.inserir(70);

        System.out.print("Pré-ordem: ");
        arvore.preOrdem();
        System.out.print("Em ordem: ");
        arvore.emOrdem();
        System.out.print("Pós-ordem: ");
        arvore.posOrdem();
        System.out.println("Soma: " + arvore.somar());
    }
}