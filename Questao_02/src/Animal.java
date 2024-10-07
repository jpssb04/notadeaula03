public class Animal {
    protected String nome, raca;

    public Animal (){

    }

    public Animal (String nome){
        this.nome = nome;
    }

    public void caminha (){
        System.out.println("Caminhando...");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}