# Projeto do Bootcamp da Digital Innovation One (DIO)

Este é o projeto desenvolvido como parte do Bootcamp da Digital Innovation One. O projeto foi criado como parte de um desafio no curso e tem o objetivo de aplicar e demonstrar diversos conceitos e tecnologias aprendidas durante o programa.

## Descrição do Projeto

O projeto consiste em uma aplicação Java utilizando o framework Spring, que visa gerenciar sessões de cinema e suas respectivas salas, filmes e assentos. O sistema, ainda em desenvolvimento, possui funcionalidades para criar, visualizar, atualizar e excluir sessões, salas, filmes e assentos, além de atribuir preços diferenciados para diferentes tipos de assentos.

## Estado Atual

É importante notar que este projeto não está completo e nem todas as funcionalidades estão totalmente funcionais (Para ser sincero, está extremamente cru em relação ao que eu quero fazer). Estou sempre que possivel trabalhando para melhorar e expandir o sistema.

## Padrões de Projeto Utilizados

O projeto incorpora diversos padrões de projeto, alguns dos quais são gerenciados pelo Spring ou gerados pelo lombok:

- **Singleton:** Utilizado em várias partes do código para garantir que apenas uma instância de certas classes seja criada, otimizando recursos.
  
- **Factory Method:** Implementado nas classes `AssentoBasicFactory` e `AssentoPremiumFactory`, permitindo a criação de diferentes tipos de assentos de forma flexível.

- **Builder Pattern (Padrão de Projeto Construtor):** Utilizado em classes como `Sessao` e `Filme` para criar objetos complexos passo a passo, permitindo uma construção mais flexível.

- **Strategy Pattern (Padrão de Projeto Estratégia):** Implementado nas classes `AssentoBasic` e `AssentoPremium` para permitir diferentes comportamentos (estratégias) para os tipos de assentos.

- **Facade:** Implementado para fornecer uma interface unificada para um conjunto de interfaces do sistema. Facilitando o uso em conjunto dos services da aplicação pelo controladores, ocultando complexidades internas.

Sinta-se à vontade para explorar o código-fonte para ver como esses padrões de projeto são implementados em diferentes partes do projeto.

---

*Este projeto é uma obra em andamento e está em constante evolução. Agradeco por sua compreensão e apoio enquanto continuo a desenvolver e aprimorar essa aplicação.*
