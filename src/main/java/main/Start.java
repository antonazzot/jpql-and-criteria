package main;

import dto.AttainmentDto;
import dto.CommunDto;
import dto.PlayerDto;
import model.Attainment;
import model.Player;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;
import java.util.List;


public class Start {
    public static void main(String[] args) {
        Configuration configuration =  new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        EntityManager entityManager = sessionFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

// simple query

//        Query qu = entityManager.createQuery("FROM Player", Player.class);
//        qu.getResultList().stream().forEach(System.out::println);
//        qu.getResultList().forEach(Start::printWithPrefix);

// Typed simple query

//        TypedQuery <Player> query = entityManager.createQuery("from Player", Player.class);
//        query.getResultList().forEach(System.out::println);

 // Typed simple query

//        TypedQuery <Player> playerQuery = entityManager.createQuery( " select p from Player p", Player.class);
//        playerQuery.getResultList().forEach(Start::printWithPrefix);

// Typed simple query by field

//        TypedQuery <String> fildName = entityManager.createQuery( " select p.name from Player p", String.class);
//        fildName.getResultList().forEach(Start::printWithPrefix);

//Typed simple query by field

//        TypedQuery <String> fildLogin = entityManager.createQuery( " select p.login from Player p", String.class);
//        fildLogin.getResultList().forEach(Start::printWithPrefix);

//Typed simple query in DTO class

//        TypedQuery <PlayerDto> playerDtoTypedQueryQuery = entityManager.createQuery( " select new dto.PlayerDto (p.id, p.name, p.login) from Player p", PlayerDto.class);
//        playerDtoTypedQueryQuery.getResultList().forEach(Start::printWithPrefix);

//Typed query with filter

//        TypedQuery <Player> filterTypedQuery
//                = entityManager.createQuery( " select p from Player p   where p.name like 's%' ", Player.class);
//        filterTypedQuery.getResultList().forEach(Start::printWithPrefix);

//Typed query with parameter

//        TypedQuery <Player> parametrFilterOrderByQuery
//                = entityManager.createQuery( " select p from Player p where p.login = :login order by p.name  ", Player.class);
//        parametrFilterOrderByQuery.setParameter("login", "lis");
//        parametrFilterOrderByQuery.getResultList().forEach(Start::printWithPrefix);

//Typed named query with parameter

//        TypedQuery <Player> namedQuery = entityManager.createNamedQuery("byLogin", Player.class);
//        namedQuery.setParameter("login", "step");
//        namedQuery.getResultList().forEach(Start::printWithPrefix);

//Typed named query with filter

//        TypedQuery <Attainment> filterTypedQuery
//                = entityManager.createQuery( " select a from Player p join p.attainments   ", Attainment.class);
//        filterTypedQuery.getResultList().forEach(Start::printWithPrefix);

//Typed named query with parameter

//        TypedQuery <Attainment> attainmentTypedQueryWithParam =
//                entityManager.createNamedQuery("byAttainment", Attainment.class);
//        attainmentTypedQueryWithParam.setParameter("aName", "lord").getResultList().forEach(Start::printWithPrefix);

//Typed named query with parameter

//        TypedQuery <Player> PlayerAttainmentTypedQueryWithParam =
//                entityManager.createNamedQuery("playerByAttainment", Player.class);
//        PlayerAttainmentTypedQueryWithParam.setParameter("aName", "lord").getResultList().forEach(Start::printWithPrefix);

//Typed named query with parameter in DTO\

//        TypedQuery <AttainmentDto> AttainmentDTOTypedQueryWithParam =
//                entityManager.createNamedQuery("AttainmentDtoByPlayer", AttainmentDto.class);
//        AttainmentDTOTypedQueryWithParam.getResultList().forEach(Start::printWithPrefix);

//Typed named query  in DTO mix field

//                TypedQuery <CommunDto> CommunDTOTypedQueryWithParam =
//                entityManager.createNamedQuery("byCommunDto", CommunDto.class);
//        CommunDTOTypedQueryWithParam.setParameter("login", "myhin").getResultList().forEach(Start::printWithPrefix);

//Typed named fetch query

//                TypedQuery <Player> playerFetch =
//                entityManager.createNamedQuery("byPlayer", Player.class);
//        playerFetch.setParameter("name", "killer").getResultList().forEach(Start::printWithPrefix);

// Simple CriteriaBuilder

//        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
//        CriteriaQuery<Player> query = criteriaBuilder.createQuery(Player.class);
//        Root<Player> from = query.from(Player.class);
//        entityManager.createQuery(query).getResultList().forEach(Start::printWithPrefix);

// Simple CriteriaBuilder with param

//        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
//        CriteriaQuery<Player> query = criteriaBuilder.createQuery(Player.class);
//        Root<Player> playerRoot = query.from(Player.class);
//        CompoundSelection<Player> name = criteriaBuilder.construct(Player.class, playerRoot.get("name"));
//        query.select(name);

// Simple CriteriaBuilder with filter

//        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
//        CriteriaQuery <Player> query = criteriaBuilder.createQuery(Player.class);
//        Root <Player> root = query.from(Player.class);
//        query.select(root).where(criteriaBuilder.like(root.get("name"), "anton"));

// Simple CriteriaBuilder with filter

//        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
//        CriteriaQuery <Player> query = criteriaBuilder.createQuery(Player.class);
//        Root <Player> root = query.from(Player.class);
//        query.select(root).where(criteriaBuilder.gt(root.get("id"), 1));

//CriteriaBuilder with predicates

//        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
//        CriteriaQuery <Player> query = criteriaBuilder.createQuery(Player.class);
//        Root <Player> root = query.from(Player.class);
//        Predicate [] predicates = new Predicate[2];
//        predicates [0] = criteriaBuilder.like(root.get("login"), "lis");
//        predicates [1] = criteriaBuilder.gt(root.get("id"), 1);
//        query.select(root).where(predicates);
//        entityManager.createQuery(query).getResultList().forEach(Start::printWithPrefix);



        entityManager.close();

    }
    private static void printWithPrefix (Object o) {
        System.out.println("**********" + o.toString() + " *********");
    }
}
