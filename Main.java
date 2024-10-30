public class Main {
    public static void main(String[] args) {
        //Criando e testando o reprodutor musical
        ReprodutorMusical reprodutor = new ReprodutorMusical();
        reprodutor.ligar();
        reprodutor.pausarMusica();
        reprodutor.proximaFaixa();
        reprodutor.tocarMusica();
        reprodutor.desligar();

        //Criando e testando aparelho telefonico
        AparelhoTelefonico aparelho = new AparelhoTelefonico();
        aparelho.ligar();
        aparelho.acessarContatos();
        aparelho.fazerChamada("9999-9999");
        aparelho.receberChamada("3333-3333");
        aparelho.desligar();

        //Criando e testando navegador de internet
        NavegadorInternet navegador = new NavegadorInternet();
        navegador.ligar();
        navegador.abrirPagina("www.dio.com.br");
        navegador.adicionarFavoritos("www.dio.com.br");
        navegador.atualizarPagina();
        navegador.desligar();
    }
    
}
