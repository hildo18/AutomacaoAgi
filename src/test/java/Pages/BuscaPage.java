package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuscaPage {
    private WebDriver navegador;

    public BuscaPage(WebDriver navegador){
        this.navegador = navegador;

    }

    public String CapturarInformacaoPesquisada(){
        return navegador.findElement(By.xpath("//h1[@class='page-title ast-archive-title'][contains(.,'Resultados encontrados para: cartão')]")).getText();
    }

    public String CapturarInformacaoItemNaoExistente(){
        return navegador.findElement(By.xpath("//p[contains(.,'Lamentamos, mas nada foi encontrado para sua pesquisa, tente novamente com outras palavras.')]")).getText();
    }


}
