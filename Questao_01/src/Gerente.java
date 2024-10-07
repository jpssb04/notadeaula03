public class Gerente extends Funcionario{
    private String projeto;

    public Gerente(String nome, String nasc, int idade, double salario, String projeto) {
        super(nome, nasc, idade, salario);
        this.projeto = projeto;
    }

    public void informarProjeto(){
        System.out.println("Projeto: " + projeto);
    }
}
