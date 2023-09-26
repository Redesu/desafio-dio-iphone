public class iPhone {
    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;

    public iPhone() {
        reprodutorMusical = new ReprodutorMusical();
        aparelhoTelefonico = new AparelhoTelefonico();
        navegadorInternet = new NavegadorInternet();
    }

    public void usarReprodutorMusical() {
        reprodutorMusical.Tocar();
        reprodutorMusical.Pausar();
        reprodutorMusical.SelecionarMusica();
    }

    public void usarAparelhoTelefônico() {
        aparelhoTelefonico.Ligar();
        aparelhoTelefonico.Atender();
        aparelhoTelefonico.IniciarCorreioVoz();
    }

    public void usarNavegadorInternet() {
        navegadorInternet.ExibirPagina();
        navegadorInternet.AdicionarNovaAba();
        navegadorInternet.AtualizarPagina();
    }

    public static void main(String[] args) {
        iPhone meuiPhone = new iPhone();

        meuiPhone.usarReprodutorMusical();
        meuiPhone.usarAparelhoTelefônico();
        meuiPhone.usarNavegadorInternet();
    }
}