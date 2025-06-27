# 🌍 Global Solution 2025 - Preparação para Eventos Climáticos

Projeto acadêmico desenvolvido para a disciplina **Computational Thinking Using Java** do curso de **Análise e Desenvolvimento de Sistemas** da **FIAP (1º Semestre / 2025).**

---

📋 **Tabela de Conteúdos**
- [Sobre o Projeto](#-sobre-o-projeto)
- [Principais Funcionalidades](#-principais-funcionalidades)
- [Tecnologias Utilizadas](#-tecnologias-utilizadas)
- [Estrutura do Projeto](#-estrutura-do-projeto)
- [Como Executar](#-como-executar)
- [Conceitos de OOP Aplicados](#-conceitos-de-oop-aplicados)
- [Autor](#-autor)
- [Licença](#-licença)

---

## 📖 Sobre o Projeto

Este sistema tem como objetivo fornecer suporte informacional e prático à população diante de eventos climáticos extremos. A proposta centraliza dados essenciais, guias de ação e funcionalidades de acessibilidade, visando especialmente públicos vulneráveis. A arquitetura foi estruturada com base nos princípios da **Programação Orientada a Objetos**, buscando modularidade, reutilização de código e facilidade de manutenção.

---

## ✨ Principais Funcionalidades

- 👤 **Gerenciamento de Pessoas**  
  Cadastro de usuários e seus respectivos contatos de emergência.

- 💡 **Guia Interativo de Preparação**  
  Menu interativo para escolha do tipo de evento climático e apresentação de dicas específicas.

- 🏥 **Consulta de Locais Seguros**  
  Lista de pontos de apoio e abrigos com endereço e recursos disponíveis.

- ♿ **Acessibilidade e Comunicação**  
  Suporte a interações acessíveis, envio de feedbacks e perguntas diretamente pelo sistema.

---

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java (JDK 17)
- **Interface com o Usuário:** `javax.swing.JOptionPane` para entrada inicial, e menu via terminal (console)
- **IDE Utilizada:** IntelliJ IDEA

---

## 📁 Estrutura do Projeto

```plaintext
Global-Solution-Java/
├── src/
│   └── br/
│       └── com/
│           └── fiap/
│               ├── beans/
│               │   ├── Acessibilidade.java
│               │   ├── Dica.java              (Classe Abstrata)
│               │   ├── DicasOndasDeCalor.java
│               │   ├── DicasFrioExtremo.java
│               │   ├── DicasChuvaEnchentes.java
│               │   ├── DicasVentosFortes.java
│               │   ├── EventosClimaticos.java (Controlador do Menu)
│               │   ├── Feedback.java
│               │   ├── LocalSeguro.java
│               │   ├── Pessoa.java            (Classe Abstrata)
│               │   ├── PessoaEmergencia.java
│               │   ├── Pergunta.java
│               │   └── Usuario.java
│               └── main/
│                   └── TesteSistema.java      (Classe principal com o método main)
└── README.md
```

---

## 🚀 Como Executar

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
```

2. Abra o projeto em uma IDE compatível com Java (ex: IntelliJ IDEA ou Eclipse).

3. Navegue até o arquivo:
```plaintext
src/br/com/fiap/main/TesteSistema.java
```

4. Execute o método `main()` para iniciar o sistema.

---

## 🎓 Conceitos de OOP Aplicados

- **Abstração**  
  - `Pessoa` e `Dica` são classes abstratas, definindo métodos que obrigatoriamente devem ser implementados pelas subclasses.

- **Encapsulamento**  
  - Todos os atributos são `private`, acessados apenas via métodos `get` e `set`.

- **Herança**  
  - `Usuario` e `PessoaEmergencia` herdam de `Pessoa`.  
  - Classes de dicas específicas herdam de `Dica`.

- **Polimorfismo**  
  - Uso de variáveis de tipo genérico (`Dica`) para instanciar diversas subclasses, com chamadas de métodos que respeitam o tipo real do objeto.

- **Sobrescrita (`@Override`)**  
  - Implementações específicas de `apresentar()`, `toString()` e `identificador()` em subclasses.

- **Sobrecarga (Overload)**  
  - Exemplo na classe `Usuario` com múltiplas versões do método `exibirPerfil()`.

---

## 👨‍💻 Autor

**Felipe Ferrete**  
RM562999

---

## 📄 Licença

Este projeto está licenciado sob os termos da licença MIT.  
