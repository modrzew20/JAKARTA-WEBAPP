package com.example.jakartawebapp.common;
import jakarta.persistence.EntityManager;

public abstract class AbstractFacade<T> {
        private final Class<T> entityClass;

        public AbstractFacade(Class<T> entityClass){
            this.entityClass = entityClass;
        }

        protected abstract EntityManager getEntityManager();

        public void create(T entity){
            getEntityManager().persist(entity);
        }

        public void edit(T entity){
            getEntityManager().merge(entity);
        }

        public void remove (T entity){
            getEntityManager().remove(entity);
        }

        public T find(Object id){
            return getEntityManager().find(entityClass, id);
        }
    }


