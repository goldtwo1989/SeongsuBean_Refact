package com.oopsw.seongsubean.account.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
@RequiredArgsConstructor
public class AccountController {
  @GetMapping("/myPage")
  public String myPage() {
    return "account/my-page";
  }

  @GetMapping("/editProfile")
  public String editProfile() {
    return "account/edit-profile";
  }

  @GetMapping("/myPost")
  public String myPost() {
    return "account/my-post";
  }

}
