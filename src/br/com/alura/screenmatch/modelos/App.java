package br.com.alura.screenmatch.modelos;

public class App {
    private String nome;
    private int anoDeLacamento;
    private boolean inlcuidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;

    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLacamento);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double obtemMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;

    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoDeLacamento() {
		return anoDeLacamento;
	}

	public void setAnoDeLacamento(int anoDeLacamento) {
		this.anoDeLacamento = anoDeLacamento;
	}

	public boolean isInlcuidoNoPlano() {
		return inlcuidoNoPlano;
	}

	public void setInlcuidoNoPlano(boolean inlcuidoNoPlano) {
		this.inlcuidoNoPlano = inlcuidoNoPlano;
	}

	public double getSomaDasAvaliacoes() {
		return somaDasAvaliacoes;
	}

	public void setSomaDasAvaliacoes(double somaDasAvaliacoes) {
		this.somaDasAvaliacoes = somaDasAvaliacoes;
	}

	public int getDuracaoEmMinutos() {
		return duracaoEmMinutos;
	}

	public void setDuracaoEmMinutos(int duracaoEmMinutos) {
		this.duracaoEmMinutos = duracaoEmMinutos;
	}

	public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
		this.totalDeAvaliacoes = totalDeAvaliacoes;
	}
}