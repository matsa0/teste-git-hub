public abstract class Veiculo {

    private String nome;

    public abstract void ligar();
    public abstract void desligar();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}