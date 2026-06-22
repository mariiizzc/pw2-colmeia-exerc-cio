public class Colmeia {

    public static void main(String[] args) {

        Operaria op1 = new Operaria("Bela", 20, 5);
        Operaria op2 = new Operaria("Luna", 15, 4);
        Rainha r1 = new Rainha("Rainha Ana", 100, 2000);
        Zangao z1 = new Zangao("Zeca", 25, 3);

        double consumoTotal = 0;

        op1.exibirInformacoes();
        op1.executarAtividade();
        consumoTotal += op1.calcularConsumo();
        System.out.println("Consumo diario: " + op1.calcularConsumo() + " mg");
        System.out.println("--------------------");

        op2.exibirInformacoes();
        op2.executarAtividade();
        consumoTotal += op2.calcularConsumo();
        System.out.println("Consumo diario: " + op2.calcularConsumo() + " mg");
        System.out.println("--------------------");

        r1.exibirInformacoes();
        r1.executarAtividade();
        consumoTotal += r1.calcularConsumo();
        System.out.println("Consumo diario: " + r1.calcularConsumo() + " mg");
        System.out.println("--------------------");

        z1.exibirInformacoes();
        z1.executarAtividade();
        consumoTotal += z1.calcularConsumo();
        System.out.println("Consumo diario: " + z1.calcularConsumo() + " mg");
        System.out.println("--------------------");

        System.out.println("Consumo total da colmeia: " + consumoTotal + " mg");
        System.out.println("----------------------------------------");

        op1.executarTarefa();
        op2.executarTarefa();
        r1.executarTarefa();
        z1.executarTarefa();

    }
}