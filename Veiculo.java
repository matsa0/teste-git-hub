public abstract class Veiculo {

    private String nome;

    public abstract void ligar(String nome);
    public abstract void desligar(String nome);

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}