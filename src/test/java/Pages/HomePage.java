package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver navegador;

    public HomePage(WebDriver navegador){
        this.navegador = navegador;

    }

    public BuscaPage PesquisarInformacao(String informacao){
        navegador.findElement(By.xpath("(//span[contains(@class,'ast-icon icon-search')])[2]")).click();
        navegador.findElement(By.id("search-field")).sendKeys(informacao);
        navegador.findElement(By.xpath("(//span[contains(@class,'ast-icon icon-search')])[2]")).click();
        return new BuscaPage(navegador);
    }

    public String CapturarMensagemHome(){
        return navegador.findElement(By.xpath("//h2[@class='uagb-heading-text'][contains(.,'Últimas do Blog do Agi')]")).getText();
    }
}
