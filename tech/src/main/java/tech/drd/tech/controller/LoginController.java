package tech.drd.tech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tech.drd.tech.dto.ResponseDTO;
import tech.drd.tech.service.LoginService;

@RestController
@RequestMapping(value = { "tech/admin/" })
public class LoginController {
	@Autowired
	LoginService loginService;

	@GetMapping("loginAuth")
	public ResponseDTO loginData(@RequestParam String username, @RequestParam String pass) {
		return new ResponseDTO("success", loginService.loginValidate(username, pass), null);
	}
}
