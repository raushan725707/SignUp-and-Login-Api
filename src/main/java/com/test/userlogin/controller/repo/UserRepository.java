package com.test.userlogin.controller.repo;


	import org.springframework.data.repository.CrudRepository;
	import org.springframework.stereotype.Repository;

import com.test.userlogin.controller.entiry.User;

	

	@Repository
	public interface UserRepository extends CrudRepository<User,Integer>{


		User findOneByEmailIgnoreCaseAndPassword(String email,String password);

	





		
	}

