public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("João", "03/01/2004", 20, 3480.22, "TI");
        Programador programador = new Programador("Antônio", "23/12/2003", 21, 2222.54, "Python");

        System.out.println("Gerente:");
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Data de Nascimento: " + gerente.getNasc());
        System.out.println("Idade: " + gerente.getIdade());
        gerente.informarSalario();
        gerente.informarProjeto();
        System.out.println("Aniversário: " + gerente.calcularIdade());

        System.out.println("--------------------");

        System.out.println("Programador:");
        System.out.println("Nome: " + programador.getNome());
        System.out.println("Data de Nascimento: " + programador.getNasc());
        System.out.println("Idade: " + programador.getIdade());
        programador.informarSalario();
        programador.informarLinguagem();
        System.out.println("Aniversário: " + programador.calcularIdade());
    }
}