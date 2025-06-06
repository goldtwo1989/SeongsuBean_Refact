package com.oopsw.seongsubean.auth;


import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthRestController {
  @GetMapping("/check")
  public ResponseEntity<?> checkLoginStatus(@AuthenticationPrincipal AccountDetails accountDetails) {
    boolean isLoggedIn = (accountDetails != null);
    return ResponseEntity.ok(Map.of("loggedIn", isLoggedIn));
  }
}
