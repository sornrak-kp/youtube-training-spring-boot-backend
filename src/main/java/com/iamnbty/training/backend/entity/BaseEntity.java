package com.iamnbty.training.backend.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

import javax.persistence.*;

@Data
@MappedSuperclass
public abstract class BaseEntity {

    // @Id
    // @GenericGenerator(name = "uuid2", strategy = "uuid2")
    // @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "uuid2")
    // @Column(name = "id", nullable = false, updatable = false)
    // private UUID id;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, columnDefinition = "UUID default gen_random_uuid()")
    private UUID id;

}
