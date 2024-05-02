package modulos.home;

import Pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@DisplayName("Testes Web da Tela Inicial do Blog Agi")
public class BuscaTest {
    private FirefoxDriver navegador;

    @BeforeEach
    //Configurar a versao do driver e abrir o navegador
    public void beforeEach(){
    WebDriverManager.firefoxdriver().setup();
    this.navegador = new FirefoxDriver();

    //navegar até a página inicial
    navegador.get("https://blogdoagi.com.br/");

    //maximixar o browser
    navegador.manage().window().maximize();;
    }

    @Test
    @DisplayName("Verificar se a página inciial foi carregada")
    public void testeVerificarPaginaInicial(){
        String mensagem = new HomePage(navegador)
                .CapturarMensagemHome();
        Assertions.assertEquals("Últimas do Blog do Agi", mensagem);

    }

    @Test
    @DisplayName("Verificar se o item cartão de benefícios, existe na busca")
    public void testeVerificarItemPesquisado(){
        String mensagem = new HomePage(navegador)
                .PesquisarInformacao("cartão benefícios")
                .CapturarInformacaoPesquisada();
        Assertions.assertEquals("Resultados encontrados para: cartão benefícios", mensagem);

    }

    @Test
    @DisplayName("Verificar mensagem para item não encontrado")
    public void testeVerificarItemNaoEncontrado(){
        String mensagem = new HomePage(navegador)
                .PesquisarInformacao("agroamigo")
                .CapturarInformacaoItemNaoExistente();
        Assertions.assertEquals("Lamentamos, mas nada foi encontrado para sua pesquisa, tente novamente com outras palavras.", mensagem);

    }

    @AfterEach
    public void afterEach(){
        navegador.quit();
    }
}
