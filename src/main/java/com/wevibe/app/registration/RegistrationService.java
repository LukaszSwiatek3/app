//package com.wevibe.app.registration;
//
//import com.wevibe.app.dtos.User;
//import com.wevibe.app.dtos.UserRole;
//import com.wevibe.app.dtos.UserService;
//import com.wevibe.app.registration.token.ConfirmationToken;
//import com.wevibe.app.registration.token.ConfirmationTokenService;
//import lombok.AllArgsConstructor;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.time.LocalDateTime;
//
//@Service
//@AllArgsConstructor
//public class RegistrationService {
//
//    private final UserService userService;
//    private final ConfirmationTokenService confirmationTokenService;
//
//    public String register(RegistrationRequest request) {
//
//        String token = userService.signUpUser(
//                new User(
//                        request.getFirstName(),
//                        request.getLastName(),
//                        request.getEmail(),
//                        request.getPassword(),
//                        request.getBirthOfDay(),
//                        request.getAddressUser().toString(),
//                        request.getPhoneNumber(),
//                        request.getGender(),
//                        UserRole.USER
//                )
//        );
//
//        return token;
//
//
//    }
//
//    @Transactional
//    public String confirmToken(String token) {
//        ConfirmationToken confirmationToken = confirmationTokenService
//                .getToken(token)
//                .orElseThrow(() -> new IllegalStateException("token not found"));
//
//        if (confirmationToken.getConfirmedAt() != null) {
//            throw new IllegalStateException("email already confirmed");
//        }
//
//        LocalDateTime expiredAt = confirmationToken.getExpiresAt();
//
//        if (expiredAt.isBefore(LocalDateTime.now())) {
//            throw new IllegalStateException("token expired");
//        }
//
//        confirmationTokenService.setConfirmedAt(token);
//        userService.enableUser(
//                confirmationToken.getUser().getEmail());
//        return "confirmed";
//    }
//}
