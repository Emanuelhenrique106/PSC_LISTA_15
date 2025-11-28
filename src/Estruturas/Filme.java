package Estruturas;

public class Filme extends ItemMidia implements Avaliavel {
    private String diretor;

    public Filme(String titulo, int anoLancamento, double duracao, String diretor) {
        super(titulo, anoLancamento, duracao);
        this.diretor = diretor;
    }

    public String getDiretor() {
        return diretor;
    }

    @Override
    public void reproduzir() {
        System.out.println("Iniciando o filme: " + getTitulo() + " de " + diretor + ". Duração: " + getDuracao() + " minutos.");
    }

    @Override
    public void receberAvaliacao(int nota) {
        System.out.println("O filme " + getTitulo() + " recebeu a nota " + nota + ".");
    }
}