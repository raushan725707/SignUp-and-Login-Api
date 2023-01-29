package com.test.userlogin.controller.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.userlogin.controller.entiry.Roles;

public interface RolesRepo extends JpaRepository<Roles, Integer>{

}
