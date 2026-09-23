package com.poderosasqueinspiran.pairgame.common;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.Instant;

/* Para definir una clase base cuyos atributos son heredados por otras entidades*/
@MappedSuperclass 
/* Para especificar clases que escucharán los eventos del ciclo de vida de una entidad JPA */
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseAuditableEntity {
    @CreatedDate
    private Instant createdAt;

    @LastModifiedDate
    private Instant updateAt;

    public Instant getCreatedAt() { return createdAt;}
    public Instant getUpdateAt() { return updateAt;}
}
