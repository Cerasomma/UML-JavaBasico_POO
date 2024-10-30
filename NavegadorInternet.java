public class NavegadorInternet implements Dispositivo{

    @Override
    public void desligar() {
        System.out.println("Navegador internet desligado.");  
    }

    @Override
    public void ligar() {
        System.out.println("Navegador internet ligado.");    
    }

    public void abrirPagina(String url){
        System.out.println("Abrindo página: " + url);
    }

    public void atualizarPagina(){
        System.out.println("Atualizando página.");
    }

    public void adicionarFavoritos(String url){
        System.out.println("Adicionando favoritos: " + url);
    }

}
