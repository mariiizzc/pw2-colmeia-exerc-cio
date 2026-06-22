public class Zangao extends Abelha implements Tarefa{

    private int voosAcasalamento;

    public Zangao(String nome, int idade, int voosAcasalamento) {
        super(nome, idade);
        this.voosAcasalamento = voosAcasalamento;
    }

    public void executarAtividade() {
        System.out.println("Realizando voo de acasalamento.");
    }

    public double calcularConsumo() {
        return 15 + (voosAcasalamento * 3);
    }

    @Override
    public void executarTarefa() {
        System.out.printf(nome + ":\n");
        System.out.println("Defendendo a entrada da colméia.");
        System.out.println("----------------------------------------");
    }
}