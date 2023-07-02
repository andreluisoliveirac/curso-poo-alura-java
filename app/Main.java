import br.com.alura.screenmatch.modelos.App;

public class Main {
    public static void main(String[] args) {
        App meuFilme = new App();
        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLacamento(1980);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setInlcuidoNoPlano(true);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.obtemMedia());        
    }
}