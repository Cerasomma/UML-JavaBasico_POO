public class ReprodutorMusical implements Dispositivo{

    @Override
    public void desligar() {
        System.out.println("Reprodutor musical desligado.");      
    }

    @Override
    public void ligar() {
        System.out.println("Reprodutor musical ligado.");   
    }

    public void tocarMusica(){
        System.out.println("Música tocando.");
    }
    
    public void pausarMusica(){
        System.out.println("Música pausada.");
    }

    public void proximaFaixa(){
        System.out.println("Indo para próxima faixa.");
    }

    public void anteriorFaixa(){
        System.out.println("Voltando para a faixa anterior.");
    }

}
