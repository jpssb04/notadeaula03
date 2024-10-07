public class Programador extends Funcionario{
    private String linguagem;

    public Programador(String nome, String nasc, int idade, double salario, String linguagem) {
        super(nome, nasc, idade, salario);
        this.linguagem = linguagem;
    }

    public void informarLinguagem(){
        System.out.println("Linguagem: " + linguagem);
    }
}