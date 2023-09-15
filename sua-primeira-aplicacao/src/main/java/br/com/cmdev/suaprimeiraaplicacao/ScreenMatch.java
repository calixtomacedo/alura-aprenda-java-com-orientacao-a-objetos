package br.com.cmdev.suaprimeiraaplicacao;

public class ScreenMatch {

    public static void main(String[] args) {
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2002;
        System.out.println("Ano de lançamento: " + anoDeLancamento);

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);

        String sinopse = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Muito bom!
                Ano de Lançamento
                """ + anoDeLancamento;

        System.out.println(sinopse);

        int classificacao = (int) (media / 2);

        System.out.println(classificacao);

    }
}
