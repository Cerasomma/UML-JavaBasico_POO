public class AparelhoTelefonico implements Dispositivo{

    @Override
    public void desligar() {
        System.out.println("Aparelho telefônico desligado.");  
    }

    @Override
    public void ligar() {
        System.out.println("Aparelho telefônico ligado");       
    }

    public void fazerChamada(String numero){
        System.out.println("Fazendo chamada para: " + numero);
    }

    public void receberChamada(String numero){
        System.out.println("Recebendo chamada do numero: " + numero);
    }

    public void acessarContatos(){
        System.out.println("Acessando agenda de contatos.");
    }

}
