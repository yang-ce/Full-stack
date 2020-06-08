package com.iiht.emart.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iiht.emart.user.entity.UserEntity;
import com.iiht.emart.user.service.UserBusiness;

@RestController
@RequestMapping("/api/user")
//@CrossOrigin(origins="http://localhost:4200")
public class UserController {
	@Autowired
	private UserBusiness userBusiness;

	/**
	 *
	 * @return
	 */
	@GetMapping("/search")
	public ResponseEntity<List<UserEntity>> findAllUsers(){
		List<UserEntity> userEntity = userBusiness.findAllUsers();
		return ResponseEntity.ok(userEntity);
	}

	@PostMapping
	public ResponseEntity<UserEntity> regist(UserEntity user){
		UserEntity userEntity = userBusiness.registUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(userEntity);
	}

	@PutMapping
	public ResponseEntity<UserEntity> update(UserEntity user){
		UserEntity userEntity = userBusiness.updateUser(user);
		return ResponseEntity.ok(userEntity);
	}

	@GetMapping("/active/{id}")
	public ResponseEntity<UserEntity> active(@PathVariable Integer id){
		UserEntity user = userBusiness.activeUser(id);
		return ResponseEntity.ok(user);
	}

	@DeleteMapping("/{id}")
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public ResponseEntity<String> delete(@PathVariable Integer id){
		userBusiness.delete(id);
		return ResponseEntity.ok("Delete user successfully.");
	}
}
