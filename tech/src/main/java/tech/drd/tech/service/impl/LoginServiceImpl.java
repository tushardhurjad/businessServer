package tech.drd.tech.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.drd.tech.entity.TbLogin;
import tech.drd.tech.repository.LoginRepository;
import tech.drd.tech.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired LoginRepository loginRepository;
	
	@Override
	public Object loginValidate(String username, String pass) {
		TbLogin login=new TbLogin();
		login.setUsername(username);
		login.setPassword(pass);
		loginRepository.save(login);
		return null;
	}

}
