package com.test.userlogin.controller.service;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.test.userlogin.common.APIResponse;
import com.test.userlogin.common.APIResponse1;
import com.test.userlogin.common.APIResponse2;
import com.test.userlogin.controller.dto.LoginRequestDTO;
import com.test.userlogin.controller.dto.PermissionDto;
import com.test.userlogin.controller.dto.PermissionResponse;
import com.test.userlogin.controller.dto.Roledto;
import com.test.userlogin.controller.dto.RolesPermissiondto;
import com.test.userlogin.controller.dto.SignUpRequestDTO;
import com.test.userlogin.controller.entiry.Permission;
import com.test.userlogin.controller.entiry.Roles;
import com.test.userlogin.controller.entiry.User;
import com.test.userlogin.controller.repo.PermissionRepository;
import com.test.userlogin.controller.repo.RolesRepo;
import com.test.userlogin.controller.repo.UserRepository;
import com.test.userlogin.util.JwtUtils;

@Service
public class LoginService {
	@Autowired
	private RolesRepo repo;
	@Autowired
	private JwtUtils jwtUtils;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private PermissionRepository repository;
@Autowired
private PermissionRepository repo1;
	// all about permission

	//2.update
	public Permission Updatepermission(Permission permission,int pid) {
	Permission permission1=repository.findById(permission.getPid()).orElse(null);
	permission.setPid(pid);
return	repository.save(permission);
	}
	//3.delete
	public String deletePermission(int pid) {

		repository.deleteById(pid);
		return "deleted permission by id----->>>" + pid;
	}
	//4.search
	public Permission finbyidpermission(int pid) {
//		Permission p=new Permission();
//		p.getRoles();
//		repository.save(p);
	return	 repository.findById(pid).orElse(null);
	}
	
	//1.create
	public Permission savePermission(PermissionDto permissiondto) {
	Roles role=	repo.findById(permissiondto.getR_id()).get();
	
	Permission per=new Permission();
	per.setRead(permissiondto.isRead());
	per.setWrite(permissiondto.isWrite());
	per.setRoles(role);
	return	 repo1.save(per);	 
	}
	
	
	
	
	//all about roles
	//1.create	
	public Roles addroleintoTable(Roles role) {	
		return repo.save(role);	
	}

	// 2delete by id
	public String deleterole(int r_id) {

		repo.deleteById(r_id);
		return "deleted role by id----->>>" + r_id;
	}

//3.update role by id	
	public Roles updaterole(Roles role) {
	Roles role1=	repo.findById(role.getR_id()).orElse(null);
	//role.setR_id(r_id);
	return	repo.save(role);
		
	}
	
	

	//4. find role by id
//	public Roles finbyidrole(int r_id) {
//		return repo.findById(r_id).orElse(null);
//	}
	
	public RolesPermissiondto getrolepermission(int r_id) {

	Roles roles = repo.findById(r_id).get();	
	Permission permission = repository.findByRoles(roles);
	
	PermissionResponse permissionDataObject = new PermissionResponse();
	permissionDataObject.setPid(permission.getPid());
	permissionDataObject.setRead(permission.isRead());
	permissionDataObject.setWrite(permission.isWrite());
	permissionDataObject.setCreated_on(permission.getCreated_on());
	permissionDataObject.setCreatedby(permission.getCreatedby());
	permissionDataObject.setUpdated_on(permission.getUpdated_on());
	
	permissionDataObject.setUpdatedby(permission.getUpdatedby());
	RolesPermissiondto roleDataObject = new RolesPermissiondto();

	roleDataObject.setR_id(r_id);
	roleDataObject.setCreated_on(roles.getCreated_on());
	roleDataObject.setCreatedby(roles.getCreatedby());
	roleDataObject.setUpdated_on(roles.getUpdated_on());
	
	roleDataObject.setUpdatedby(roles.getUpdatedby());
	roleDataObject.setRole(roles.getRole());
	roleDataObject.setPermission(permissionDataObject);
	
		return roleDataObject;
		
	}
	
	
	
	
	
	
	
	
	//all about user

//1.user saved
	public APIResponse1 signUp(SignUpRequestDTO dto) {

		Roles role = repo.findById(dto.getR_id()).get();
		User user = new User();
		user.setPassword(dto.getPassword());
		user.setMob(dto.getMob());
		user.setEmail(dto.getEmail());
		user.setName(dto.getName());
		user.setRole(role);
		User user1 = userRepository.save(user);
		APIResponse1 apiResponse1 = new APIResponse1();
		apiResponse1.setMessage("data added succesfully");
		apiResponse1.setData(user1);
		return apiResponse1;
	}

//2.user delete 

	public String deleteuser(int id) {
		userRepository.deleteById(id);
		return "user deleted which has id" + id;
	}

	// 3.user search
	public User finbyiduser(int id) {
		return userRepository.findById(id).orElse(null);
	}

	//4.user update
	
	public User updateuser(User user) {
		User user1=userRepository.findById(user.getId()).orElse(null);
		user1.setName(null);
		return userRepository.save(user);
	}
	
	
	
	
	
	
	
	public APIResponse login(LoginRequestDTO loginRequestDTO) {
		APIResponse apiResponse = new APIResponse();
		User user = userRepository.findOneByEmailIgnoreCaseAndPassword(loginRequestDTO.getEmail(),
				loginRequestDTO.getPassword());

		if (user == null) {
			apiResponse.setData("data not found");
			apiResponse.setMessage("incorrect information");
			apiResponse.setStatus(HttpStatus.NOT_FOUND.value());
			apiResponse.setToken("invalid user so token can't generate");
			return apiResponse;
		}

		String token = jwtUtils.generateToken(loginRequestDTO.getEmail());
		apiResponse.setToken(token);
		Map<String, Object> m = new HashMap();
		m.put("email", user.getEmail());
		m.put("name", user.getName());
		apiResponse.setMessage("login successfull");
		apiResponse.setData(m);
		return apiResponse;
	}

	public APIResponse2 validateuser(String auth) {
		APIResponse2 apiResponse2 = new APIResponse2();

		if (jwtUtils.validatetoken(auth) != null) {
			apiResponse2.setMessage("welcome to homepage");
			apiResponse2.setToken("valid token permission granted");
			apiResponse2.setData("welcome to homepage access accepted");
			return apiResponse2;
		}

		else {
			return apiResponse2;
		}

	}
}
