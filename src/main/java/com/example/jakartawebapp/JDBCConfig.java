package com.example.jakartawebapp;

import jakarta.annotation.sql.DataSourceDefinition;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.sql.Connection;

@DataSourceDefinition(
        name = "java:app/jdbc/heroku",
        className = "org.postgresql.ds.PGSimpleDataSource",
        user = "",
        password = "",
        serverName = "127.0.0.1",
        portNumber = 5432,
        databaseName = "",
        initialPoolSize = 1,
        minPoolSize = 0,
        maxPoolSize = 1,
        maxIdleTime = 10,
        transactional = true,
        isolationLevel = Connection.TRANSACTION_READ_COMMITTED)

@Stateless
public class JDBCConfig {
    @PersistenceContext(unitName = "HerokuUser")
    private EntityManager em;
}
