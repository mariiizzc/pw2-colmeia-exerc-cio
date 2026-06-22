public class Operaria extends Abelha implements Tarefa{

    private int horasVoo;

    public Operaria(String nome, int idade, int horasVoo) {
        super(nome, idade);
        this.horasVoo = horasVoo;
    }

    public void executarAtividade() {
        System.out.println("Coletando nectar e polen.");
    }

    public double calcularConsumo() {
        return 10 + (horasVoo * 2);
    }


    @Override
    public void executarTarefa() {
        System.out.printf(nome + ":\n");
        System.out.println("Coletando néctar das flores.");
        System.out.println("Defendendo a entrada da colméia.");
        System.out.println("----------------------------------------");
    }
}