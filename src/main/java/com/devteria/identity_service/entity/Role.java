package com.devteria.identity_service.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Role {

    @Id
    private String name;
    private String description;

    @ManyToMany
    Set<Permission> permissions;



    public Role() {
    }

    public Role(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Set<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<Permission> permissions) {
        this.permissions = permissions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
