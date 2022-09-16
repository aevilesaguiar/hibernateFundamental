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


O que é uma Entidade? Uma entidade é um objeto de dominio que pode ser persistido.
Uma classe deve se anotada com @Entity ou ser definida por meio da configuração XML. 
Deve ser uma classe de nível superior e aplicativos e interfaces não podem ser entidades.
Deve ter um construtor sem argumentos publicos ou protegidos. 
Pode definir outros construtores.
A especificação JPA exige que uma classe de entidade não seja final.
O hibernate não será tão  estrito e permitirá declarar classes finais como entidades. No entanto
não é uma boa prática, pois impedirá o hibernate de usar o padrão de proxy para melhorar o
desempenho.

O que uma entidade suporta?
Uma entidade suporta herança(inheritance) , associação polimorficas(Polymorphic associations) 
e consultas polimórficas(polymorphic queries).
O estado persistente da entidade é representado pela variaveis de instancia.

O estado de Persistencia, podem ser dos seguintes tipos:
- Primitive types (tipos primitivos , byte, short, int, long, float, double, boolean e char);
- Serializable types: tipos seriazáveis incluindo  aqui wrappers dos tipos primitivos como
inteiros, ou caractere ou tipos definidos pelo o usuario que implememtam a interface serializable.
- Outros tipos de entidades: enum, tipos incorporáveis, tipos corporáveis, Collections.
## Mapeando Objetos

As tabelas de BD s serem mapeadas  para um objeto a ser persistido são determinadas por anotações,
pelos parâmetros das anotações e pelas regras padrão.
As anotações que especificam o mapeamento de tabelas são:
- @Table: especifica a tabela primária(Primary table) para a entidade anotada. Uma classe pode
não ter a anotação @Table e neste caso o seu nome seria o nome da classe entidade.
A anotação table pode receber vários parâmetros, e também  adicionar unique constraint (restrição 
exclusiva). 
- @SecondaryTable: especifica uma tabela secundária para a aclasse de entidade anotada. Se ausente 
todos os campos persistentes da entidade são mapeados para a atabela primária.
Os parametros são os mesmos da anotação Table mais pkJoinColumns e ForeignKey que especificam
as colunas que são usadas para unir com a chave primaria e a foreignKey para colunas correspondentes
ao elemento pkJoinColumns usado se a geração da tabela estiver em efeito. 
- @SecondaryTables: especifica várias tabelas para uma classe de entidade. Se ausente todos s campos
persistentes são mapeados para a tabela primária. Ela recebe como parâmetro várias anotações SecondaryTable
cada uma especificndo uma das classes de entidade estrangeira das tabelas secundárias. Cada tabela
especificada pela SecondaryTable Annotation pode manter o nome da chave primária ou pode 
especificar chaves primárias com nomes diferentes.
