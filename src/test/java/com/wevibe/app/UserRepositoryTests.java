package com.wevibe.app;

import com.wevibe.app.dtos.Address;
import com.wevibe.app.dtos.User;
import com.wevibe.app.dtos.UserRepository;
import com.wevibe.app.dtos.UserRole;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)
public class UserRepositoryTests {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TestEntityManager testEntityManager;

    @Test
    public void testCreateUser() {
        User user = new User();
        Address address = new Address();

        address.setNameAddress("Dom");
        address.setCountry("Poland");
        address.setCity("Warszawa");
        address.setPostalCode("05-300");
        address.setStreet("Warszawska");
        address.setStreetNumber(7);
        address.setApartmentNumber(2);

        user.setEmail("lukasz@gmail.com");
        user.setPassword("haslo123");
        user.setFirstName("Lukasz");
        user.setLastName("Swiatek");
//        user.setBirthOfDay(2000,07,08);
        user.setAddressUser(address);
        user.setPhoneNumber(700700700);
        user.setGender(true);
        user.setUserRole(UserRole.USER);

        User savedUser = userRepository.save(user);

        User existUser = testEntityManager.find(User.class, savedUser.getIdUser());

        assertThat(existUser.getEmail()).isEqualTo(user.getEmail());
    }
}
