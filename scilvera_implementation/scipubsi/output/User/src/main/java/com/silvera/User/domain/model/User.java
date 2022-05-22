/**
    THIS IS GENERATED CODE AND SHOULD NOT BE CHANGED MANUALLY!!!

    Generated by: silvera
    Date: 2022-05-22 03:03:00
*/

package com.silvera.User.domain.model;

import org.springframework.data.annotation.Id;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.validation.constraints.*;
import java.util.Collection;

public class User implements UserDetails {

    
    
    
    @Id
    
    @NotBlank(message="Field 'username' cannot be empty!")
    private java.lang.String username;
    
    
    @NotBlank(message="Field 'password' cannot be empty!")
    private java.lang.String password;
    
    private java.lang.String email;
    
    
    @NotBlank(message="Field 'firstname' cannot be empty!")
    private java.lang.String firstname;
    
    
    @NotBlank(message="Field 'lastname' cannot be empty!")
    private java.lang.String lastname;


    
    public java.lang.String getUsername() {
        return this.username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public void setUsername(java.lang.String username) {
        this.username = username;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    public java.lang.String getPassword() {
        return this.password;
    }

    public void setPassword(java.lang.String password) {
        this.password = password;
    }
    
    public java.lang.String getEmail() {
        return this.email;
    }

    public void setEmail(java.lang.String email) {
        this.email = email;
    }
    
    public java.lang.String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(java.lang.String firstname) {
        this.firstname = firstname;
    }
    
    public java.lang.String getLastname() {
        return this.lastname;
    }

    public void setLastname(java.lang.String lastname) {
        this.lastname = lastname;
    }
    

    
    public java.lang.String getId(){
        return this.username;
    }
    
}