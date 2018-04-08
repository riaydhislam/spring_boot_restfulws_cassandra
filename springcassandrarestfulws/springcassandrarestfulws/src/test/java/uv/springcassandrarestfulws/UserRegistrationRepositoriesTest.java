/**
 * 
 */
package uv.springcassandrarestfulws;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import uv.springcassandrarestfulws.configuration.CassandraConfig;
import uv.springcassandrarestfulws.model.UserRegistration;
import uv.springcassandrarestfulws.model.UserRole;
import uv.springcassandrarestfulws.repositories.UserRegistrationCassandraRepository;
import uv.springcassandrarestfulws.repositories.UserRegistrationCrudRepository;
import uv.springcassandrarestfulws.repositories.UserRegistrationTypedIdCassandraRepository;

/**
 * @author A.Riaydh
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes =CassandraConfig.class)
public class UserRegistrationRepositoriesTest {
private static final Logger LOGGER = Logger.getLogger(UserRegistrationRepositoriesTest.class);
@Autowired
private UserRegistrationCassandraRepository userRegistrationCassandraRepository;
@Autowired
private UserRegistrationCrudRepository userRegistrationCrudRepository;
@Autowired
private UserRegistrationTypedIdCassandraRepository userRegistrationTypedIdCassandraRepository;

@Test
@Ignore
public void saveUserRegistrationForTypedIdCassandraRepository(){
	LOGGER.info("saveUserRegistrationForTypedIdCassandraRepository");
	UserRegistration urnew=new UserRegistration();
	UserRole urOb1=new UserRole();
	urOb1.setUserRoleId(10L);
	urOb1.setUserRoleType("Officer");
	
	UserRole urOb2=new UserRole();
	urOb2.setUserRoleId(11L);
	urOb2.setUserRoleType("Admin");
	
	List<UserRole> urObs=new ArrayList<UserRole>();
	urObs.add(urOb1);
	urObs.add(urOb2);
	
	urnew=new UserRegistration();
	urnew.setUserRegistrationId(107L);
	urnew.setUserRegistrationName("shaiful");
	urnew.setUserRoleUDTs(urObs);
	UserRegistration result= userRegistrationTypedIdCassandraRepository.save(urnew);
	System.out.println(String.format(" saved successful getUserRegistrationId():%s",result.getUserRegistrationId()));
}

@Test
@Ignore
public void findAllUserRegistrationForTypedIdCassandraRepository(){
	LOGGER.info("findAllUserRegistrationForTypedIdCassandraRepository");
	List<UserRegistration> urs =(List<UserRegistration>) userRegistrationTypedIdCassandraRepository.findAll();
	System.out.println(String.format("record:%s",urs.size()));
	for(UserRegistration ob:urs){
		System.out.println(String.format("getUserRegistrationName():%S,getUserAddressId():%S",
				ob.getUserRegistrationName(), ob.getUserAddressId()));
		for(UserRole ur:ob.getUserRoleUDTs()){
			System.out.println(String.format("getUserRoleId():%s,getUserRoleName():%s,getUserRoleType():%s,getUserRoleDate():%s",
					ur.getUserRoleId(),ur.getUserRoleName(),ur.getUserRoleType(),ur.getUserRoleDate()));
			
		}
	}
}
	
@Test
@Ignore
public void saveUserRegistrationForCrudRepository(){
	LOGGER.info("saveUserRegistrationForCrudRepository");
	UserRegistration urnew=new UserRegistration();
	UserRole urOb1=new UserRole();
	urOb1.setUserRoleId(10L);
	urOb1.setUserRoleType("Officer");
	
	UserRole urOb2=new UserRole();
	urOb2.setUserRoleId(11L);
	urOb2.setUserRoleType("Admin");
	
	List<UserRole> urObs=new ArrayList<UserRole>();
	urObs.add(urOb1);
	urObs.add(urOb2);
	
	urnew=new UserRegistration();
	urnew.setUserRegistrationId(108L);
	urnew.setUserRegistrationName("shaiful");
	urnew.setUserRoleUDTs(urObs);
	UserRegistration result= userRegistrationCrudRepository.save(urnew);
	System.out.println(String.format(" saved successful getUserRegistrationId():%s",result.getUserRegistrationId()));
}

@Test
@Ignore
public void saveUserRegistrationForCassandraRepository(){
	LOGGER.info("saveUserRegistrationForCassandraRepository");
	UserRegistration urnew=new UserRegistration();
	UserRole urOb1=new UserRole();
	urOb1.setUserRoleId(10L);
	urOb1.setUserRoleType("Officer");
	
	UserRole urOb2=new UserRole();
	urOb2.setUserRoleId(11L);
	urOb2.setUserRoleType("Admin");
	
	List<UserRole> urObs=new ArrayList<UserRole>();
	urObs.add(urOb1);
	urObs.add(urOb2);
	
	urnew=new UserRegistration();
	urnew.setUserRegistrationId(109L);
	urnew.setUserRegistrationName("shaiful");
	urnew.setUserRoleUDTs(urObs);
	UserRegistration result= userRegistrationCassandraRepository.save(urnew);
	System.out.println(String.format(" saved successful getUserRegistrationId():%s",result.getUserRegistrationId()));
}


@Test
@Ignore
public void deleteUserRegistrationForCassandraRepository(){
	LOGGER.info("deleteUserRegistrationForCassandraRepository");
	UserRegistration urnew=new UserRegistration();
	urnew.setUserRegistrationId(109L);
	userRegistrationCassandraRepository.delete(urnew);
	System.out.println(String.format(" delete successful"));
}
@Test
@Ignore
public void deleteUserRegistrationForCrudRepository(){
	LOGGER.info("deleteUserRegistrationForCrudRepository");
	UserRegistration urnew=new UserRegistration();
	urnew.setUserRegistrationId(108L);
	userRegistrationCrudRepository.delete(urnew);
	System.out.println(String.format(" delete successful"));
}

@Test
@Ignore
public void deleteUserRegistrationForTypeIdCassandraRepository(){
	LOGGER.info("deleteUserRegistrationForTypeIdCassandraRepository");
	UserRegistration urnew=new UserRegistration();
	urnew.setUserRegistrationId(107L);
	userRegistrationTypedIdCassandraRepository.delete(urnew);
	System.out.println(String.format(" delete successful"));
}

@Test
@Ignore
public void findAllUserRegistrationForCrudRepository(){
	LOGGER.info("findAllUserRegistrationForCrudRepository");
	List<UserRegistration> urs =(List<UserRegistration>) userRegistrationCrudRepository.findAll();
	System.out.println(String.format("record:%s",urs.size()));
	for(UserRegistration ob:urs){
		System.out.println(String.format("getUserRegistrationName():%S,getUserAddressId():%S",ob.getUserRegistrationName(), ob.getUserAddressId()));
		for(UserRole ur:ob.getUserRoleUDTs()){
				System.out.println(String.format("getUserRoleId():%s,getUserRoleName():%s,getUserRoleType():%s,getUserRoleDate():%s",
						ur.getUserRoleId(),ur.getUserRoleName(),ur.getUserRoleType(),ur.getUserRoleDate()));
			}	
	}
}

@Test
@Ignore
public void findAllUserRegistrationForCassandraRepository(){
	LOGGER.info("findAllUserRegistrationForCassandraRepository");
	List<UserRegistration> urs =(List<UserRegistration>)  userRegistrationCassandraRepository.findAll();
	System.out.println(String.format("record:%s",urs.size()));
	for(UserRegistration ob:urs){
		System.out.println(String.format("getUserRegistrationName():%S,getUserAddressId():%S",ob.getUserRegistrationName(), ob.getUserAddressId()));
		for(UserRole ur:ob.getUserRoleUDTs()){
			System.out.println(String.format("getUserRoleId():%s,getUserRoleName():%s,getUserRoleType():%s,getUserRoleDate():%s",
					ur.getUserRoleId(),ur.getUserRoleName(),ur.getUserRoleType(),ur.getUserRoleDate()));
			
		}
	}
}


@Test
@Ignore
public void findByUserRegistrationName(){
	LOGGER.info("findByUserRegistrationName");
	List<UserRegistration> urs =(List<UserRegistration>)  userRegistrationCassandraRepository.findByUserRegistrationName("riaydh");
	System.out.println(String.format("record:%s",urs.size()));
	for(UserRegistration ob:urs){
		System.out.println(String.format("getUserRegistrationName():%S,getUserAddressId():%S",ob.getUserRegistrationName(), ob.getUserAddressId()));
		for(UserRole ur:ob.getUserRoleUDTs()){
			System.out.println(String.format("getUserRoleId():%s,getUserRoleName():%s,getUserRoleType():%s,getUserRoleDate():%s",
					ur.getUserRoleId(),ur.getUserRoleName(),ur.getUserRoleType(),ur.getUserRoleDate()));
			
		}
	}
}
	
	@Test
	@Ignore
	public void findByUserRegistrationNameQuery(){
		LOGGER.info("findByUserRegistrationNameQuery");
		List<UserRegistration> urs =(List<UserRegistration>)  userRegistrationCassandraRepository.findByUserRegistrationNameQuery("riaydh");
		System.out.println(String.format("record:%s",urs.size()));
		for(UserRegistration ob:urs){
			System.out.println(String.format("getUserRegistrationName():%S,getUserAddressId():%S",ob.getUserRegistrationName(), ob.getUserAddressId()));
			for(UserRole ur:ob.getUserRoleUDTs()){
				System.out.println(String.format("getUserRoleId():%s,getUserRoleName():%s,getUserRoleType():%s,getUserRoleDate():%s",
						ur.getUserRoleId(),ur.getUserRoleName(),ur.getUserRoleType(),ur.getUserRoleDate()));
				
			}
		}		
     }
	@Test
	@Ignore
	public void findOneTypedIdCassandraRepository(){
		LOGGER.info("findOneTypedIdCassandraRepository");
		UserRegistration ob=userRegistrationTypedIdCassandraRepository.findOne(103L);
			System.out.println(String.format("getUserRegistrationName():%S,getUserAddressId():%S",
					ob.getUserRegistrationName(), ob.getUserAddressId()));		
}
	
	
	@Test
	@Ignore
	public void findOneCrudRepository(){
		LOGGER.info("findOneTypedIdCassandraRepository");
		UserRegistration ob=userRegistrationCrudRepository.findOne(101L);
			System.out.println(String.format("getUserRegistrationName():%S,getUserAddressId():%S",
					ob.getUserRegistrationName(), ob.getUserAddressId()));	
}
	
	@Test
	@Ignore
	public void findOneCassandraRepository(){
		LOGGER.info("findOneTypedIdCassandraRepository");
		UserRegistration ob=userRegistrationTypedIdCassandraRepository.findOne(101L);
			System.out.println(String.format("getUserRegistrationName():%S,getUserAddressId():%S",
					ob.getUserRegistrationName(), ob.getUserAddressId()));
			
			
}
	

}
