package com.test.userlogin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.userlogin.common.APIResponse;
import com.test.userlogin.common.APIResponse1;
import com.test.userlogin.controller.dto.LoginRequestDTO;
import com.test.userlogin.controller.dto.PermissionDto;
import com.test.userlogin.controller.dto.Roledto;
import com.test.userlogin.controller.dto.RolesPermissiondto;
import com.test.userlogin.controller.dto.SignUpRequestDTO;
import com.test.userlogin.controller.entiry.Permission;
import com.test.userlogin.controller.entiry.Roles;
import com.test.userlogin.controller.entiry.User;
import com.test.userlogin.controller.service.LoginService;
import com.test.userlogin.util.JwtUtils;

@RestController
public class LoginController {
@Autowired
	private JwtUtils jwtutils;
	@Autowired
	private LoginService loginService;
	
	//permission all api
	//1.create
	@PostMapping("/adddpermission")
	
	public Permission savepermission1(@RequestBody PermissionDto permission) {
		return loginService.savePermission(permission);
	}
	//2.delete
	@DeleteMapping("/deletepermission/{pid}")
	public String deletepermission(@PathVariable int pid) {
		return loginService.deletePermission(pid);
	}
	//3.update
	@PutMapping("/updatepermission/{pid}")
//	public Permission updatepermission1(@RequestBody Permission permission) {
//	return loginService.savePermission(permission);
//	 
//	}
//	
	//4.search
	
	@GetMapping("/findpermissionbyid/{pid}")
	public Permission findpermission(@PathVariable int pid) {
		return loginService.finbyidpermission(pid);
		
	}
	
	
	
	
	
	
	
	
	
	
//role crud
	//1.create
	@PostMapping("/roles")
public Roles setpostman(@RequestBody Roles role)	{
		return loginService.addroleintoTable(role);
	}
	//2.delete
	@DeleteMapping("/deleterole/{r_id}")
	public String deletedrole1(@PathVariable int r_id) {
		return loginService.deleterole(r_id);
	}
	//3.fetch
	@GetMapping("/findrolebyid/{r_id}")
	public RolesPermissiondto findrole(@PathVariable int r_id) {
		return loginService.getrolepermission(r_id);
	}
	
	//4.update

	@PutMapping("/update/{r_id}")
	public Roles updaterole(@RequestBody Roles role) {
		return  loginService.updaterole(role);
	}
	
//	@PutMapping("/updatepermission/{pid}")
//	public Permission updatepermission1(@RequestBody Permission permission) {
//	return loginService.savePermission(permission);
//	 
//	}
	//user 
	
	//1.create
	@PostMapping("/signup")
	public ResponseEntity<APIResponse1> signUp(@RequestBody SignUpRequestDTO dto) {

	APIResponse1 apiResponse1 = loginService.signUp(dto);
		return ResponseEntity.status(apiResponse1.getStatus()).body(apiResponse1);
	}
	//2.delete user
	@DeleteMapping("/delete/{id}")
	public String deleteuser1(@PathVariable int id) {
	return	loginService.deleteuser(id);
	}
	
	//3.search user
	@GetMapping("/search/{id}")
	public User finduserbyidd( @PathVariable    int id) {
		return loginService.finbyiduser(id);
	}
	//4.update
	@PutMapping("/updateuser/{id}")
	public User updateuserdetails(@RequestBody User user) {
	return	loginService.updateuser(user);
	}

	
	
	
	@PostMapping("/Login")
	public ResponseEntity<APIResponse> login(@RequestBody LoginRequestDTO loginRequestDTO) {

		APIResponse apiResponse = loginService.login(loginRequestDTO);
		return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);

	}
//	
//	@GetMapping("/privateapi")
//	public ResponseEntity<APIResponse2> accessusinttoken(@RequestHeader(value = "authorization",defaultValue="")String auth)  {
//		
//		APIResponse2 apiResponse2=loginService.validateuser(auth);
//		return ResponseEntity.status(apiResponse2.getStatus()).body(apiResponse2);}
//		
	
		
		
		
		
	
	}
		
		
	
	
	
	
	
	
	

