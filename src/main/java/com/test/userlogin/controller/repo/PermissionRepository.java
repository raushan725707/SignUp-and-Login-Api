package com.test.userlogin.controller.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.userlogin.controller.entiry.Permission;
import com.test.userlogin.controller.entiry.Roles;

public interface PermissionRepository extends JpaRepository<Permission, Integer> {

	Permission findByRoles(Roles roles );

}
