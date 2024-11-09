public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private boolean ligado = false;
    private int volume = 5;
    private int nivelBateria = 100;

    public void ligarAparelho() {
        ligado = true;
        System.out.println("Aparelho ligado.");
    }

    public void desligarAparelho() {
        ligado = false;
        System.out.println("Aparelho desligado.");
    }

    private void consumirBateria() {
        if (nivelBateria > 0) {
            nivelBateria -= 5;
            System.out.println("Nível de bateria: " + nivelBateria + "%");
        } else {
            System.out.println("Bateria fraca. Recarregue o aparelho.");
        }
    }

    public void aumentarVolume() {
        if (volume < 10) {
            volume++;
            System.out.println("Volume aumentado para: " + volume);
        } else {
            System.out.println("Volume máximo atingido.");
        }
    }

    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
            System.out.println("Volume diminuído para: " + volume);
        } else {
            System.out.println("Volume mínimo atingido.");
        }
    }

    // Métodos de ReprodutorMusical
    @Override
    public void tocar() {
        if (ligado) {
            consumirBateria();
            System.out.println("Tocando música.");
        } else {
            System.out.println("Ligue o aparelho para tocar música.");
        }
    }

    @Override
    public void pausar() {
        if (ligado) {
            System.out.println("Música pausada.");
        } else {
            System.out.println("Ligue o aparelho para pausar música.");
        }
    }

    @Override
    public void selecionarMusica(String musica) {
        if (ligado) {
            System.out.println("Música selecionada: " + musica);
        } else {
            System.out.println("Ligue o aparelho para selecionar música.");
        }
    }

    // Métodos de AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        if (ligado) {
            consumirBateria();
            System.out.println("Ligando para " + numero);
        } else {
            System.out.println("Ligue o aparelho para fazer chamadas.");
        }
    }

    @Override
    public void atender() {
        if (ligado) {
            System.out.println("Atendendo chamada.");
        } else {
            System.out.println("Ligue o aparelho para atender chamadas.");
        }
    }

    @Override
    public void iniciarCorreioVoz() {
        if (ligado) {
            System.out.println("Iniciando correio de voz.");
        } else {
            System.out.println("Ligue o aparelho para acessar o correio de voz.");
        }
    }

    // Métodos de NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        if (ligado) {
            consumirBateria();
            System.out.println("Exibindo página: " + url);
        } else {
            System.out.println("Ligue o aparelho para acessar a internet.");
        }
    }

    @Override
    public void adicionarNovaAba() {
        if (ligado) {
            System.out.println("Nova aba adicionada.");
        } else {
            System.out.println("Ligue o aparelho para adicionar abas.");
        }
    }

    @Override
    public void atualizarPagina() {
        if (ligado) {
            consumirBateria();
            System.out.println("Página atualizada.");
        } else {
            System.out.println("Ligue o aparelho para atualizar páginas.");
        }
    }

    // Método Main para testar a classe iPhone
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();
        
        // Testando o controle do aparelho
        meuIphone.ligarAparelho();
        meuIphone.tocar();
        meuIphone.aumentarVolume();
        meuIphone.diminuirVolume();
        
        // Testando funcionalidades de telefone
        meuIphone.ligar("123-456-789");
        meuIphone.iniciarCorreioVoz();
        
        // Testando navegador de internet
        meuIphone.exibirPagina("www.exemplo.com");
        meuIphone.atualizarPagina();
        
        // Desligando o aparelho
        meuIphone.desligarAparelho();
    }
}
