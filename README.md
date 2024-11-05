# Projeto de Automação de Testes - Mantis

Este projeto consiste na automação de testes para o sistema Mantis, uma ferramenta de gestão de bugs, utilizando Java e Selenium WebDriver. O objetivo é garantir a funcionalidade e a confiabilidade do sistema por meio de testes automatizados.

## Tecnologias Utilizadas

- **Linguagem de Programação**: Java
- **Framework de Automação Web**: Selenium WebDriver
- **Gerenciador de Dependências**: Maven
- **Framework de Testes**: TestNG
- **Ferramenta de Versionamento**: GitHub

## Ambiente de Teste
- **Selenium WebDriver**: Versão 4.25.0
- **Navegador**: Chrome 130.0.6723.92
- **Java**: Versão 22.0.1
- **Framework de Testes**: TestNG

## Funcionalidades Testadas

O projeto inclui a automação dos seguintes casos de teste:

1. **Teste de Login**: Validação do processo de login no sistema.
2. **Criação de Tarefa**: Verificação da funcionalidade de criação de uma nova tarefa, incluindo:
   - Preenchimento do resumo e descrição.
   - Seleção da categoria.
   - Envio da tarefa e confirmação da criação.

### 1. Caso de Teste: Validação de Login
- **ID do Caso de Teste**: CT-001
- **Descrição**: Testar a funcionalidade de login do sistema.
- **Pré-condições**: O usuário deve ter um nome de usuário e senha válidos.
- **Passos**:
  1. Acessar a URL do sistema: [http://mantis-prova.base2.com.br].
  2. Preencher o campo de usuário com "Gabriel_Moreira".
  3. Preencher o campo de senha com "G9012643g121291".
  4. Clicar no botão de login.
- **Dados de Entrada**: Nome de usuário e senha válidos.
- **Resultado Esperado**: O sistema deve redirecionar para a página inicial e exibir o botão de relatório de bug.

### 2. Caso de Teste: Criação de Tarefa
- **ID do Caso de Teste**: CT-002
- **Descrição**: Testar a criação de uma nova tarefa no sistema.
- **Pré-condições**: O usuário deve estar logado no sistema.
- **Passos**:
  1. Acessar a página de criação de tarefa.
  2. Preencher o campo de resumo com "Título da tarefa".
  3. Preencher o campo de descrição com "Descrição detalhada da tarefa".
  4. Selecionar a categoria da tarefa.
  5. Clicar no botão de submissão.
- **Dados de Entrada**: Resumo, descrição e categoria da tarefa.
- **Resultado Esperado**: A tarefa deve ser criada com sucesso, e uma mensagem de sucesso deve ser exibida.

## Estrutura do Projeto

- **src/**
  - **main/**
    - **java/**
      - **pages/**: Classes de página que representam as funcionalidades do sistema.
      - **tests/**: Classes de teste que contêm os métodos de automação.
  - **resources/**: Arquivos de configuração e outros recursos necessários.
