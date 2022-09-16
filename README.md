# Java Persistence with Hibernate 5 Fundamentals

O que é ORM?

Significa mapeamento relacional Objeto(Object relational mapping). É uma técnica que converte dados entre uma linguagem de 
de POO e o sistema de gerenciamento de BD relacional.

JPA Java Persistence API é a especificação Java para mapeamento  objeto-relacional e persistencia.

Hibernate é o framework mais utilizado para implementar a especificação JPA.
O Hibernate pode usar XMLs ou anotaçãoes para especificar a logica de mapeamento do mundo  orientado a objetos´para o banco relacional.
Temos que mapear as classes e os campos de um objeto para tabelas e colunas.

Vantagens do JPA comparado com jdbc  -> escrever menos código, você trabalha mais do lado do objeto. 
Escrever menos código significará que você poderá aumentar seu desempenho. Excluir você do conhecimento SQL. A carga de persistencia estrára
do lado do framework hibernate.Você será independente do fornecedor do banco de dados, seu código será portátil
e o hibernate irá traduzí-lo para ser entendido pelo o banco de dados.

Desvantagens:

Curva de aprendizagem.
O sistema está passando por uma camada adicional será mais dificil depurar.
Desempenho pode ser prejudicado.
Tem situações que você gostaria de usar o jdbc como estado mais próximo do BD.

A incompatibilidade de impedancia Objeto-relacional( Object-relational impedance Mismatch) significa que o objeto e os modelos relacionais não funcionam bem juntos.
A programação orientada a objetos mantem dados como  objetos interconectados com campos e métodos, enquanto um
RDBMS mantém os dados como tabelas relacionadas.

Há vários pontos onde o modelo relacional é incompatível com o modelo de objetos
Granularidade
Herança e polimorfismo
Identidade
Associações
Navegação em grafos



