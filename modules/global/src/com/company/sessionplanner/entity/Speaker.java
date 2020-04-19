package com.company.sessionplanner.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@NamePattern("%s %s|firstname,lastname")
@Table(name = "SESSIONPLANNER_SPEAKER")
@Entity(name = "sessionplanner_Speaker")
public class Speaker extends StandardEntity {
    private static final long serialVersionUID = -785326450121099162L;

    @NotNull
    @Column(name = "FIRSTNAME", nullable = false)
    protected String firstname;

    @Column(name = "LASTNAME")
    protected String lastname;

    @Email
    @NotNull
    @Column(name = "EMAIL", nullable = false, unique = true)
    protected String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
}