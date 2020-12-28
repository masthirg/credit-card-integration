/**
 * Copyright (c) 2020, LOLC Technologies and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */

/*-
 * Instructions to maintain version history.
 *
 * #                        :- A running number, each time a modification is applied, this will get increased.
 * Version No               :- For java files, version no should increment by one.
 * URS / Help Desk No       :- URS or help desk no which is cause to modify this file.
 * Date                     :- The modified date.
 * Author                   :- The person who modify the code.
 * Description              :- Brief description about the changes.
 *
 *     #        Version No        URS/Help Desk No        Date            Author            Description
 * -----------------------------------------------------------------------------------------------------------------
 *    1        1.0.0                                    01-Jan-2020       NadeenG           Created.
 *
 */
package com.loits.models.audit;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import java.util.Date;

import static javax.persistence.TemporalType.TIMESTAMP;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class Auditable<U> {

    @CreatedBy
    @Column(name = "CREATED_BY")
    private U createdBy;

    @CreatedDate
    @Column(name = "CREATED_AT", nullable = false, updatable = false)
    @Temporal(TIMESTAMP)
    private Date createdAt;

    @LastModifiedBy
    @Column(name = "UPDATED_BY")
    private U updatedBy;

    @LastModifiedDate
    @Column(name = "UPDATED_AT")
    @Temporal(TIMESTAMP)
    private Date updatedAt;

    @JsonIgnore
    public U getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(U createdBy) {
        this.createdBy = createdBy;
    }

    @JsonIgnore
    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @JsonIgnore
    public U getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(U updatedBy) {
        this.updatedBy = updatedBy;
    }

    @JsonIgnore
    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}