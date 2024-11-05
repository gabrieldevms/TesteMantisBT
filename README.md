# Projeto de Automação de Testes - Mantis

Este projeto consiste na automação de testes para o sistema Mantis, uma ferramenta de gestão de bugs, utilizando Java e Selenium WebDriver. O objetivo é garantir a funcionalidade e a confiabilidade do sistema por meio de testes automatizados.

## Tecnologias Utilizadas

- **Linguagem de Programação**: Java
- **Framework de Automação Web**: Selenium WebDriver
- **Gerenciador de Dependências**: Maven
- **Framework de Testes**: TestNG
- **Ferramenta de Versionamento**: GitHub

## Funcionalidades Testadas

O projeto inclui a automação dos seguintes casos de teste:

1. **Teste de Login**: Validação do processo de login no sistema.
2. **Criação de Tarefa**: Verificação da funcionalidade de criação de uma nova tarefa, incluindo:
   - Preenchimento do resumo e descrição.
   - Seleção da categoria.
   - Envio da tarefa e confirmação da criação.

## Estrutura do Projeto

- **src/**
  - **main/**
    - **java/**
      - **pages/**: Classes de página que representam as funcionalidades do sistema.
      - **tests/**: Classes de teste que contêm os métodos de automação.
  - **resources/**: Arquivos de configuração e outros recursos necessários.
