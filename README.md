# Conversor de Moeda

 
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

![Captura de tela 2024-05-27 072357](https://github.com/Kaio-0708/Moedas/assets/123708201/8e265051-31d8-4d7d-ac72-5f271771b6dd)

## Repetir a mesma moeda
Em caso de desejar utilizar a mesma opção de moeda para conversão, aparece mensagem para designar outra moeda. 

![Captura de tela 2024-05-27 072542](https://github.com/Kaio-0708/Moedas/assets/123708201/1fb9ab63-6e0f-4683-85fa-464274827f09)

### Resultado da Conversão
Após inserir os valores desejados, o programa irá exibir o resultado da conversão.

![Captura de tela 2024-05-27 072451](https://github.com/Kaio-0708/Moedas/assets/123708201/131496fe-3322-4187-a065-ed8432fad464)
![Captura de tela 2024-05-27 072516](https://github.com/Kaio-0708/Moedas/assets/123708201/dc2fc672-cc84-458f-a8b7-2bb424f390a7)

### Histórico de Conversões
Você pode visualizar o histórico de conversões realizadas selecionando a opção correspondente no menu principal.

![Captura de tela 2024-05-27 072504](https://github.com/Kaio-0708/Moedas/assets/123708201/8395fa40-44ec-42aa-a8c1-d241a41bad7d)

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
