/**
 * 
 */
package uv.springcassandrarestfulws.services;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.data.cassandra.repository.MapId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import uv.springcassandrarestfulws.model.UserRegistration;
import uv.springcassandrarestfulws.repositories.CassandraRepositoryTemplateGeneral;
import uv.springcassandrarestfulws.repositories.UserRegistrationCassandraRepository;
import uv.springcassandrarestfulws.utility.LoggerUtility;
import uv.springcassandrarestfulws.utility.ResultTO;

/**
 * @author A.Riaydh
 *
 */
@Service
public class UserRegistrationServiceImpl implements UserRegistrationService{
	
	 private final Logger logger = LoggerFactory.getLogger(getClass());
	 LoggerUtility loggerUtility=new LoggerUtility();

	@Autowired
	private CassandraRepositoryTemplateGeneral cassandraRepositoryTemplateGeneral;
	@Autowired
	private UserRegistrationCassandraRepository userRegistrationCassandraRepository;
	
	@Autowired
	private CassandraOperations cassandraTemplate;
	
	@Override
	public List<UserRegistration> findAll() {
		return cassandraRepositoryTemplateGeneral.findAll(UserRegistration.class);
	}
	
	
	@Override
	public List<UserRegistration> findAllFromCR() {
		List<UserRegistration>  list=(List<UserRegistration>) userRegistrationCassandraRepository.findAll();
		logger.info(loggerUtility.numberOfRecordFound(list.size()));
		if(list.size()>0 && !list.isEmpty()){
			return list;
		}
		else{
			logger.info(loggerUtility.noOfRecordFound());
			return new ArrayList<UserRegistration>(list);
		}
	}
	
	@Override
	public UserRegistration save(UserRegistration userRegistration) {
		
		boolean value=cassandraTemplate.exists(UserRegistration.class, userRegistration.getUserRegistrationId());
		if(value){
			return new UserRegistration();
		}
		else{
			return cassandraRepositoryTemplateGeneral.create(userRegistration);
		}
	}
	
	@Override
	public UserRegistration saveFromCR(UserRegistration userRegistration) {
       boolean value=cassandraTemplate.exists(UserRegistration.class, userRegistration.getUserRegistrationId());
       logger.info(loggerUtility.existId(value));
		if(value){
			logger.info(loggerUtility.existId());
			logger.info(loggerUtility.primaryKeyId(userRegistration.getUserRegistrationId()));
			return new UserRegistration();
		}
		else{
			logger.info(loggerUtility.primaryKeyId(userRegistration.getUserRegistrationId()));
			return userRegistrationCassandraRepository.save(userRegistration);
		}
	}
	
	@Override
	public UserRegistration delete(Long id) {
		logger.info(String.format("Input User Registartion Id:%S", id));
		boolean value=cassandraTemplate.exists(UserRegistration.class, id);
		logger.info(loggerUtility.existId(value));
		if(value){
			cassandraTemplate.deleteById(UserRegistration.class, id);	
		}
		else{
			new UserRegistration();
		}
		return new UserRegistration();
	}
	
	@Override
	public ResultTO deleteFromCR(Long id) {
		logger.info(loggerUtility.primaryKeyId(id));
		UserRegistration userRegistration=new UserRegistration();
		userRegistration.setUserRegistrationId(id);
		boolean value=cassandraTemplate.exists(UserRegistration.class, id);
		logger.info(loggerUtility.existId(value));
		
		ResultTO resultTO=new ResultTO();
		if(value){
			resultTO=new ResultTO();
			resultTO.setId(id);
			userRegistrationCassandraRepository.delete(userRegistration);	
			resultTO.setMessage(value);
		}
		else{
			logger.info(loggerUtility.isNotExistId());
			resultTO.setMessage(value);
		}
		return resultTO;
		
	}
	
	@Override
	public UserRegistration findOne(Long id) {
		UserRegistration ob=cassandraTemplate.selectOneById(UserRegistration.class, id);
		if(ob!=null && ob.getUserRegistrationId()!=null){
		 logger.info(String.format("Record found with above user registartion:%S!", id));
		return ob;	
		}
		else{
			logger.info(String.format("No Record found with above user registartion:%S!", id));
			return new UserRegistration();
		}
	}

	@Override
	public UserRegistration update(UserRegistration userRegistration) {
		return cassandraRepositoryTemplateGeneral.update(userRegistration, UserRegistration.class);
	}
	
	@Override
	public UserRegistration updateFromCR(UserRegistration userRegistration, Long id) {
		logger.info(loggerUtility.primaryKeyId(id));
		boolean ob=cassandraTemplate.exists(UserRegistration.class, id);
		logger.info(loggerUtility.existId(ob));
		if(ob){
			userRegistration.setUserRegistrationId(id);
			return userRegistrationCassandraRepository.save(userRegistration);
		}
		else{
			logger.info(loggerUtility.isNotExistId());
			return new UserRegistration();
		}
	}
	
	
	
	
	
	@Override
	public Page<UserRegistration> findByUserRegistrationName(String userRegistrationName, PageRequest pageRequest) {
		
		return null;
	}

	@Override
	public List<UserRegistration> findByUserRegistrationfullName(String userRegistrationfullName) {
		
		return null;
	}

	

}
