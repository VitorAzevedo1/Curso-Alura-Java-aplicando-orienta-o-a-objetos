public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;

    void exibeFichaTecnica() {
        System.out.println("Titulo da musica: " + titulo);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    void avalia(double nota) {
        avaliacao+=nota;
        numAvaliacoes++;
    }

    double media() {
        return avaliacao/numAvaliacoes;
    }
}
