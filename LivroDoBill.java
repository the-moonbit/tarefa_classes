/**
 * Representa o livro do Bill no mundo real, guardando suas informações
 * principais e permitindo ações simples como abrir, ler páginas e marcar leitura.
 */
public class LivroDoBill {
    // Propriedades (atributos) do livro
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginaAtual;
    private boolean aberto;

    // Construtor para criar um novo exemplar do livro do Bill
    public LivroDoBill(String titulo, String autor, int totalPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.paginaAtual = 0;
        this.aberto = false;
    }

    // Método simples: abre o livro
    public void abrir() {
        this.aberto = true;
        System.out.println("Você abriu \"" + titulo + "\".");
    }

    // Método simples: avança uma quantidade de páginas se o livro estiver aberto
    public void lerPaginas(int quantidade) {
        if (!aberto) {
            System.out.println("Abra o livro antes de começar a ler.");
            return;
        }
        if (quantidade <= 0) {
            System.out.println("Informe um numero de paginas maior que zero.");
            return;
        }

        paginaAtual = Math.min(paginaAtual + quantidade, totalPaginas);
        System.out.println("Lendo... Voce esta na pagina " + paginaAtual + " de " + totalPaginas + ".");
    }

    // Método simples: exibe um resumo do estado atual do livro
    public void exibirResumo() {
        System.out.println("Livro: " + titulo + " | Autor: " + autor +
                " | Progresso: " + paginaAtual + "/" + totalPaginas +
                " | Aberto: " + (aberto ? "Sim" : "Não"));
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        LivroDoBill livro = new LivroDoBill("O Livro do Bill", "Bill Cypher", 208);
        livro.exibirResumo();
        livro.abrir();
        livro.lerPaginas(25);
        livro.exibirResumo();
    }
}