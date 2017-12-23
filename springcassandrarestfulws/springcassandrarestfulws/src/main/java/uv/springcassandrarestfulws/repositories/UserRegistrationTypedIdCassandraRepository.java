/**
 * 
 */
package uv.springcassandrarestfulws.repositories;

import org.springframework.data.cassandra.repository.TypedIdCassandraRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uv.springcassandrarestfulws.model.UserRegistration;

/**
 * @author A.Riaydh
 *
 */
@RepositoryRestResource(collectionResourceRel = "userRegistration", path = "userRegistrations")
public interface UserRegistrationTypedIdCassandraRepository extends TypedIdCassandraRepository<UserRegistration, Long> {
	
	

}
