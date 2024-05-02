## Automacao Agi
Este é um repositório que contém a automação de alguns cenários levantados para o blog Agi. Os sub-tópicos abaixo descrevem algumas ações tomadas na estrutução do projeto.


## Tecnologias utilizadas

- Java   
  https://www.oracle.com/br/java/technologies/downloads/
- Junit   
  [https://mvnrepository.com/artifact/org.junit.jupit...](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api/5.8.0-M1)
- Selenium 
  https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.0.0
- Maven  
  https://maven.apache.org/
- WebDriverManager  
  https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager

## Testes Automatizados

Testes para validar consultas de itens usando o mecanimo de busca na tela inicial, também valido se a página inicial é carregada com sucesso.

## Notas Gerais

- Nesse projeto fazemos o uso do JUNIT 5, o que nos dá a possibilidade de usar a notação DisplayName para dar descrições em português em  nossos testes.
- Foi utilizado também o formato Page Objects, para separar a manipulação dos elementos da tela e dos testes, facilitando a organização e a reutilização de código.

## Plano de Testes

**Informações Gerais:**
Um Plano de testes para clarificar a todos os envolvidos o que será testado

Identificador único: #3123

Organização Responsável: Agi

Aprovadores: Hildo

**Contexto do Teste**
*Escopo(funcionalidades):*
- Verificar carregamento da tela inicial
- Pesquisar por item não existem
- Pesquisar por item existente

**Critérios de conclusão:**
100% dos incidentes com prioridade média e alta corrigidos.

**Entregáveis:**
- Casos de teste
- Plano de teste
- Relatório
- Scripts de teste

**Cronograma:**
02 de Maio de 2024
