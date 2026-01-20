public class Program {
    public static void main(String[] args) throws Exception {

        // Livros escolhidos

        // Livro 01: Core Java 2
        // Livro 02: Java, Como programar

        // Código: 1598FHK, Título: Core Java 2, Autores: Cay S. Horstmann e Gary Cornel, ISBN: 0130819336, Ano: 2005 

        Livro livro1 = new Livro();

        livro1.codigo = "1598FHK";
        livro1.titulo = "Core Java 2";
        livro1.autores = "Cay S. Horstmann e Gary Cornel";
        livro1.ISBN = "0130819336";
        livro1.ano = 2005;

        System.out.format("\nLivro 01 \nCódigo: %s \nTitulo: %s \nAutores: %s \nISBN: %s \nAno: %d\n ", livro1.codigo, livro1.titulo,
        livro1.autores, livro1.ISBN, livro1.ano
        );

        // Código: 9865PLO, Título: Java, Como programar, Autores: Harvey Deitel, ISBN: 0130341517, Ano: 2015

        Livro livro2 = new Livro();

        livro2.codigo = "9865PLO";
        livro2.titulo = "Java, Como programar";
        livro2.autores = "Harvey Deitel";
        livro2.ISBN = "0130341517";
        livro2.ano = 2015;

        System.out.format("\n===================================================================\n");

        System.out.format("\nLivro 02 \nCódigo: %s \nTitulo: %s \nAutores: %s \nISBN: %s \nAno: %d\n ", livro2.codigo, livro2.titulo,
        livro2.autores, livro2.ISBN, livro2.ano
        );

    }
}
