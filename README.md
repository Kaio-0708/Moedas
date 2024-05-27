# Conversor de Moeda

Bem-vindo ao repositório do Conversor de Moeda. 
Este projeto é uma Challenge ONE: Conversor de Moedas do programa ONE-Oracle Next Education, que é parceria da Alura Latam e Oracle, no qual designa um aplicativo de linha de comando desenvolvido em Java
que permite a conversão de valores entre diferentes moedas utilizando taxas de câmbio obtidas de uma API externa.
O programa oferece uma interface interativa para seleção de moedas e registro de conversões realizadas, que são armazenadas em arquivos JSON.

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

### Pacotes e Arquivos
- `Principal`: Contém a classe principal que gerencia a execução do programa.
  - `Principal.java`: Implementa o menu interativo e gerencia o fluxo de conversão de moedas.
- `Api`: Contém a classe responsável por interagir com a API externa para obter as taxas de câmbio.
  - `Conversor.java`: Obtém as taxas de câmbio de uma API externa.
- `Arquivo`: Contém a classe responsável por gerar e salvar arquivos JSON.
  - `GeradorDeArquivo.java`: Salva os registros de conversão em arquivos JSON.
- `Calculo`: Contém a classe que realiza a conversão de moedas.
  - `CalculoDeConversao.java`: Realiza a conversão de moedas e cria registros das conversões.
- `Modelo`: Contém a classe que representa os dados de uma conversão.
  - `ConsultaConversor.java`: Modelo de dados para armazenar informações sobre uma conversão.

### Descrição dos Arquivos e Diretórios
- **`Principal/Principal.java`**: Classe principal que implementa o menu interativo e gerencia a conversão de moedas.
- **`Api/Conversor.java`**: Classe que obtém as taxas de câmbio de uma API externa.
- **`Arquivo/GeradorDeArquivo.java`**: Classe que salva os registros de conversão em arquivos JSON.
- **`Calculo/CalculoDeConversao.java`**: Classe que realiza a conversão de moedas e cria registros das conversões.
- **`Modelo/ConsultaConversor.java`**: Modelo de dados para armazenar informações sobre uma conversão.

## Funcionalidades

- **Conversão de Moedas**: Permite converter valores entre diversas moedas.
- **Obtenção de Taxas de Câmbio**: Obtém taxas de câmbio atualizadas de uma API externa.
- **Registro de Conversões**: Registra cada conversão realizada, incluindo data e hora.
- **Armazenamento em JSON**: Salva as conversões realizadas em arquivos JSON.
- **Exibição de Histórico**: Exibe o histórico de conversões realizadas.

## Utilização

Aqui estão algumas capturas de tela para guiar você através do processo de utilização do Conversor de Moeda:

### Menu Principal
Ao iniciar o programa, você será recebido com o menu principal. Selecione a moeda de origem e destino, e insira o valor a ser convertido.

![Menu Principal](path/to/menu_principal_screenshot.png)

### Resultado da Conversão
Após inserir os valores desejados, o programa irá exibir o resultado da conversão.

![Resultado da Conversão](path/to/resultado_conversao_screenshot.png)

### Histórico de Conversões
Você pode visualizar o histórico de conversões realizadas selecionando a opção correspondente no menu principal.

![Histórico de Conversões](path/to/historico_conversoes_screenshot.png)

## Como Executar o Projeto

1. Clone o repositório:
    ```sh
    git clone https://github.com/Kaio-0708/Moedas.git
    ```

2. Navegue até o diretório do projeto:
    ```sh
    cd Moedas
    ```

3. Compile o projeto:
    ```sh
    javac Principal/Principal.java
    ```

4. Execute o projeto:
    ```sh
    java Principal.Principal
    ```

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests para melhorias e correções.

## Autor

Kaio Vitor - https://github.com/Kaio-0708
