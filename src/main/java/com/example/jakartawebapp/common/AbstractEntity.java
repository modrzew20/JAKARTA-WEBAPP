package com.example.jakartawebapp.common;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.UUID;

@MappedSuperclass
public abstract class AbstractEntity {

    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    @GeneratedValue()
    @Getter
    private UUID id;

}
