package com.wevibe.app.registration;

import com.wevibe.app.dtos.Address;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.Date;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class RegistrationRequest {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String password;
    private final Date birthOfDay;
    private final Address addressUser;
    private final Integer phoneNumber;
    private final Boolean gender;
}
