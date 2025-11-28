package Estruturas;

public abstract class ItemMidia {
    private String titulo;
    private int anoLancamento;
    private double duracao; // em minutos

    public ItemMidia(String titulo, int anoLancamento, double duracao) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        setDuracao(duracao); // usa o setter para aplicar validação
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public double getDuracao() {
        return duracao;
    }

     //setters
    public void setDuracao(double duracao) {
        if (duracao > 0) {
            this.duracao = duracao;
        } else {
            System.out.println("Duraçao nao foi validada (" + duracao + ").A duraçao deve ser positiva. o valor nao teve alteraçoes!!!.");
        }
    }

    
    public abstract void reproduzir();
}