package dao;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Objects;

public class ConfigPersistance {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo_jpa");

    private EntityManager entityManager;

    public EntityManager getEntityManager(){
        if(Objects.isNull(entityManager)){
            entityManager = emf.createEntityManager();
        }
        return entityManager;
    }
}
