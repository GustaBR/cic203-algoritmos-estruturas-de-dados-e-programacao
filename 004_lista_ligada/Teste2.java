import java.util.Random;

public class Teste2 {
    public static void main(String[] args) throws Exception {
        var playlist = new ListaLigada();
        String[] musicas = {"One", "Two", "Three", "Four", "Five", "Six"};
        var gerador = new Random();

        while (true) {
            var musica = musicas[gerador.nextInt(0, musicas.length)];
            var oQueFazer = gerador.nextInt(1, 5);
            // 1. Adicionar no começo
            // 2. Adicionar no fim
            // 3. Remover do começo
            // 4. Remover do fim

            switch (oQueFazer) {
                case 1:
                    System.out.println("Adicionando \"" + musica + "\" ao começo...");
                    Thread.sleep(2000);
                    playlist.adicionarNoComeco(musica);
                    break;
                case 2:
                    System.out.println("Adicionando \"" + musica + "\" ao fim...");
                    Thread.sleep(2000);
                    playlist.adicionarNoFim(musica);
                    break;
                case 3:
                    System.out.println("Removendo a primeira música...");
                    Thread.sleep(2000);
                    playlist.removerDoComeco();
                    break;
                case 4:
                    System.out.println("Removendo a última música...");
                    Thread.sleep(2000);
                    playlist.removerDoFim();
                    break;
            }

            System.out.println(playlist);
            System.out.println("=========================================");
        }
    }
}