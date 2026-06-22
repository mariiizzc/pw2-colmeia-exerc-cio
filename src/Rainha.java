public class Rainha extends Abelha implements Tarefa{

    private int ovosPorDia;

    Rainha(String nome, int idade, int ovosPorDia) {
        super(nome, idade);
        this.ovosPorDia = ovosPorDia;
    }

    public int getOvosPorDia() {
        return ovosPorDia;
    }

    public void setOvosPorDia(int ovosPorDia) {
        this.ovosPorDia = ovosPorDia;
    }

    public void executarAtividade() {
        System.out.println("Colocando ovos.");
    }

    public double calcularConsumo() {
        return 20 + (ovosPorDia * 0.01);
    }


    @Override
    public void executarTarefa() {
        System.out.printf(nome + ":\n");
        System.out.println("Não possui capacidades especiais");
        System.out.println("----------------------------------------");
    }
}