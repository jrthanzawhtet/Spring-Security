package com.jdc.shop.controller;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("public/signup")
public class SignUpController {
	
	private final AuthenticationManager authenticationManager;

}
