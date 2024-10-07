public class Funcionario {
    protected String nome, nasc;
    protected int idade;
    protected double salario;

    public Funcionario(String nome, String nasc, int idade, double salario) {
        this.nome = nome;
        this.nasc = nasc;
        this.idade = idade;
        this.salario = salario;
    }

    public void informarSalario(){
        System.out.printf("Salário: R$ %.2f\n", salario);
    }

    public int calcularIdade() {
        idade++;
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getNasc() {
        return nasc;
    }

    public int getIdade() {
        return idade;
    }
}