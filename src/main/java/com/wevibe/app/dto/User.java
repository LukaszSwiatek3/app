package com.wevibe.app.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@Entity
public class User implements UserDetails {

    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1)
    @Id
    @GeneratedValue
    private Long idUser;
    private String firstName;
    private String lastName;
    private String password;
    private Date birthOfDay;
    private Address addressUser;
    private String email;
    private Integer phoneNumber;
    private Boolean gender;
    private Boolean isVerified;
    private Boolean isOnline;
    @Enumerated(EnumType.STRING)
    private UserRole userRole;
    private Boolean locked = false;
    private Boolean enabled = false;

    public User(String firstName, String lastName, String password, Date birthOfDay, Address addressUser, String email, Integer phoneNumber, Boolean gender, UserRole userRole) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.birthOfDay = birthOfDay;
        this.addressUser = addressUser;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.userRole = userRole;
    }



    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return email;
    }

    public Date getBirthOfDay() {
        return birthOfDay;
    }

    public Address getAddressUser() {
        return addressUser;
    }

    public String getEmail() {
        return email;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public Boolean getGender() {
        return gender;
    }

    public Boolean getVerified() {
        return isVerified;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setVerified(Boolean verified) {
        isVerified = verified;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        SimpleGrantedAuthority authority =
                new SimpleGrantedAuthority(userRole.name());
        return Collections.singletonList(authority);
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return !locked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }
}
