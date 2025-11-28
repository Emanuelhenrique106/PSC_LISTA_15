package Estruturas;

public class Musica extends ItemMidia implements Avaliavel {
    private String artista;

    public Musica(String titulo, int anoLancamento, double duracao, String artista) {
        super(titulo, anoLancamento, duracao);
        this.artista = artista;
    }
    // Metodos getters

    public String getArtista() {
        return artista;
    }

    @Override
    public void reproduzir() {
        System.out.println("Tocando a música:" + getTitulo() + " do " + artista + ". Tempo: " + getDuracao() + " minutos.");
    }

    @Override
    public void receberAvaliacao(int nota) {
        System.out.println("A música " + getTitulo() + " recebeu " + nota + " estrelas.");
    }
}