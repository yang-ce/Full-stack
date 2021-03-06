package com.iiht.emart.user.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.iiht.emart.user.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer>{

	public UserEntity findById(Integer id);
	public UserEntity findByUserName(String userName);

	@Modifying
	@Transactional
	@Query(value = "update s_user u set u.conformed='1' where u.id=?",nativeQuery = true)
	public int activeUser(@Param("id")Integer id);

//	@Modifying
//	@Transactional
//	@Query(value = "create e_user u set u.user_name=?id and u.password =?password and mobile_num=?mobileNum ",nativeQuery = true)
//	public int regist(@Param("id")String id,@Param("password")String password,@Param("mobileNum")String mobileNum);
}
