public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        Pessoa pessoa = new Pessoa();
        Calculadora calculo1 = new Calculadora();
        Musica minhaMusica = new Musica();
        Aluno aluno1 = new Aluno();

        meuFilme.nome = "Poderoso chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(9);

        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.pegaMedia());
        pessoa.exibeOlaMundo();
        System.out.println(calculo1.dobro(2));

        minhaMusica.titulo = "Infiel";
        minhaMusica.anoLancamento = 2010;
        minhaMusica.exibeFichaTecnica();

        minhaMusica.avalia(8);
        minhaMusica.avalia(10);

        System.out.println(minhaMusica.avaliacao);
        System.out.println(minhaMusica.numAvaliacoes);
        System.out.println(minhaMusica.media());

        aluno1.nome = "Vitor Hugo";
        aluno1.idade = 21;
        aluno1.exibeFichaAluno();
    }
}