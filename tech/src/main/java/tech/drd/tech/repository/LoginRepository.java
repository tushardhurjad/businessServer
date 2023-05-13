package tech.drd.tech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tech.drd.tech.entity.TbLogin;

public interface LoginRepository extends JpaRepository<TbLogin, Integer> {
	

}
