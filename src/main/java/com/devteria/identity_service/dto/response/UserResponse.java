package com.devteria.identity_service.dto.response;

import java.time.LocalDate;
import java.util.Set;

public class UserResponse {
     private String id;
     private String username;
     private String firstName;
     private String lastName;
     private LocalDate dob;
     private Set<RoleResponse> roles;

     public UserResponse() {
     }

     public UserResponse(String id, String username, String firstName, String lastName, LocalDate dob, Set<RoleResponse> roles) {
          this.id = id;
          this.username = username;
          this.firstName = firstName;
          this.lastName = lastName;
          this.dob = dob;
          this.roles = roles;
     }

     public Set<RoleResponse> getRoles() {
          return roles;
     }

     public void setRoles(Set<RoleResponse> roles) {
          this.roles = roles;
     }

     public String getId() {
          return id;
     }

     public void setId(String id) {
          this.id = id;
     }

     public String getUsername() {
          return username;
     }

     public void setUsername(String username) {
          this.username = username;
     }

     public String getFirstName() {
          return firstName;
     }

     public void setFirstName(String firstName) {
          this.firstName = firstName;
     }

     public String getLastName() {
          return lastName;
     }

     public void setLastName(String lastName) {
          this.lastName = lastName;
     }

     public LocalDate getDob() {
          return dob;
     }

     public void setDob(LocalDate dob) {
          this.dob = dob;
     }
}
