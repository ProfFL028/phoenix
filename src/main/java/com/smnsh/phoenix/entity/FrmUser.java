package com.smnsh.phoenix.entity;

import javax.persistence.*;

@Entity
@Table(name="FRM_USER")
public class FrmUser {

    @Id
    @Column(name = "paramId")
    @GeneratedValue
    private Long paramId;

    @Column(name="username")
    private String username;

    @Column(name="password")
    private String password;

    @Column(name="email")
    private String email;

    @Column(name="enabled")
    private Boolean enabled;

    @Column(name="fullname")
    private String fullname;

    @Override
    public String toString() {
        return "FrmUser{" +
                "paramId=" + paramId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", enabled=" + enabled +
                ", fullname='" + fullname + '\'' +
                '}';
    }

    public Long getParamId() {
        return paramId;
    }

    public void setParamId(Long paramId) {
        this.paramId = paramId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
}
