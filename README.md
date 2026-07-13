# Sistema Bancário em Java (POO)

## Sobre o Projeto

Este projeto é uma simulação de um sistema bancário back-end desenvolvido inteiramente em Java. O objetivo principal da aplicação é demonstrar a implementação prática e rigorosa dos pilares da Orientação a Objetos (POO), garantindo um código limpo, seguro, escalável e de fácil manutenção.

## Funcionalidades

- Criação de contas bancárias (Conta Base e Conta Poupança).
- Operações de Depósito e Saque validadas.
- Transferências seguras entre diferentes instâncias de contas.
- Cálculo e aplicação de rendimento de juros exclusivo para Conta Poupança.
- Aplicação de taxas operacionais variáveis baseadas no tipo de conta instanciada.

## Conceitos Técnicos Aplicados

Durante o desenvolvimento, foram aplicados conceitos fundamentais de arquitetura de software:

- **Classes e Objetos:** Estruturação das regras de negócio.
- **Construtores:** Inicialização segura de dados obrigatórios, impedindo a criação de objetos inconsistentes.
- **Encapsulamento:** Proteção de dados sensíveis (saldo, titular) utilizando modificadores de acesso (`private`, `protected`) e métodos `Getters/Setters`.
- **Herança:** Reutilização e extensão de comportamentos através da classe base para classes filhas (`Conta` estendido para `ContaPoupanca`).
- **Polimorfismo:** Sobrescrita de métodos (`@Override`) para aplicar regras de negócio específicas em tempo de execução, como a cobrança de taxa de saque exclusiva para contas do tipo Poupança.

## Tecnologias Utilizadas

- **Linguagem:** Java
- **Paradigma:** Programação Orientada a Objetos (POO)
- **Versionamento:** Git e GitHub

## Como Executar

1. Clone este repositório em sua máquina local:
   ```bash
   git clone [https://github.com/LucasRyanC/SistemaBancario.git](https://github.com/LucasRyanC/SistemaBancario.git)
   ```
