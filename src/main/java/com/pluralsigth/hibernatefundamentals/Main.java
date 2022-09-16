package com.pluralsigth.hibernatefundamentals;

import com.pluralsigth.hibernatefundamentals.airport.Airport;
import com.pluralsigth.hibernatefundamentals.airport.Passenger;
import com.pluralsigth.hibernatefundamentals.airport.Ticket;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        // A configuração de um Entity Manager é modelado por um EntityManagerFactory que criou-o,
       // identifica a unidade de persistência que tem o objetivo de determinar configurações como, por exemplo,
        //os parâmetros de conexão que os Entity Managers gerados nesta fábrica usarão quando se conectar com a base de dados.
        //Um Entity Manager é sempre obtido através de um EntityManagerFactory
        // que determina os parâmetros de configuração que vão dizer como será o funcionamento do Entity Manager
        //existe um EntityManagerFactory e que diversos Entity Managers podem ser criados por um único EntityManagerFactory.
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("hibernatefundamentals");

        //Um Entity Manager é sempre obtido através de um EntityManagerFactory que determina os parâmetros de configuração
        // que vão dizer como será o funcionamento do Entity Manager.
        //criamos um gerenciador de entidades coma ajuda do EntityManager
        EntityManager em=emf.createEntityManager();

      //Persistindo uma Entidade
        //Instanciando um objeto
        Airport airport= new Airport(1, "Henri Coanda");

        Passenger john=new Passenger(1,"John Smith");
        john.setAirport(airport);

        Passenger mike=new Passenger(2,"Mike Smith");
        mike.setAirport(airport);

        airport.addPassenger(john);
        airport.addPassenger(mike);

        Ticket ticket1= new Ticket(1,"AA1234");
        ticket1.setPassenger(john);

        Ticket ticket2= new Ticket(2,"BB1234");
        ticket2.setPassenger(john);

        Ticket ticket3= new Ticket(3,"CC1234");
        ticket3.setPassenger(mike);

        john.addTicket(ticket1);
        john.addTicket(ticket2);
        mike.addTicket(ticket3);


        em.persist(airport);
        em.persist(john);
        em.persist(mike);
        em.persist(ticket1);
        em.persist(ticket2);
        em.persist(ticket3);









        //então começamos a transação
        em.getTransaction().begin();

        //













        em.getTransaction().commit();
        emf.close();



    }
}
