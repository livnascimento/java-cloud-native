# Criando um Banco Digital com Java e Orientação a Objetos

Este repositório contém a solução para o desafio Criando um Banco Digital com Java e Orientação a Objetos da [DIO](https://www.dio.me/) no [Bootcamp Java Cloud Native](https://www.dio.me/bootcamp/bradesco-java-cloud-native) em parceria com o Bradesco.

## ℹ Descrição do Projeto

O projeto consiste em um sistema bancário simples desenvolvido em Java, aplicando os conceitos de Programação Orientada a Objetos (POO), como abstração, encapsulamento, herança e polimorfismo.

## ⚙ Tecnologias Utilizadas

- Java - Linguagem principal do projeto.

- Maven - Gerenciador de dependências e build.

- Paradigma POO - Aplicação dos princípios de orientação a objetos.

## 📂 Estrutura do Projeto
```
banco-digital
│
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── banco
│   │   │   │   ├── models
│   │   │   │   │   ├── BancoDigital.java
│   │   │   │   │   ├── Cliente.java
│   │   │   │   │   ├── Conta.java
│   │   │   │   │   ├── ContaCorrente.java
│   │   │   │   │   ├── ContaPoupanca.java
│   │   │   │   ├── Main.java
├── pom.xml
├── README.md
```

## ▶ Como Executar o Projeto

1. Clone o repositório
```
git clone https://github.com/livnascimento/java-cloud-native
```

2. Acesse o diretório do projeto
```
cd banco-digital
```

3. Compile o projeto usando Maven
```
mvn clean install
```

4. Execute a aplicação
```
mvn exec:java -Dexec.mainClass="banco.Main"
```

## 🔨 Funcionalidades

- Criar clientes e associá-los a contas bancárias.

- Operações de depósito e saque.

- Transferências entre contas.

- Consulta de saldo.

- Impressão de extratos bancários.

## 🧾 Licença

Este projeto foi desenvolvido para fins educacionais e segue a licença MIT.

---

Obrigada por visitar meu repo, te convido a entrar no meu perfil e ver o que estou desenvolvendo no momento. 💜