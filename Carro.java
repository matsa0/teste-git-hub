public class Carro extends Veiculo{
    
    @Override
    public void ligar(String nome) {
        System.out.println("Ligando o " + nome);
    }

    public void desligar(String nome) {
        System.out.println("Desligando o " + nome);
    }
}
