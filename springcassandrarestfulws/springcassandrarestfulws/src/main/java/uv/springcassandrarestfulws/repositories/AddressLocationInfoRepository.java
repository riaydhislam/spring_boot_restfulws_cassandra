/**
 * 
 */
package uv.springcassandrarestfulws.repositories;

import org.springframework.data.cassandra.repository.TypedIdCassandraRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uv.springcassandrarestfulws.model.AddressLocationInfo;

/**
 * @author A.Riaydh
 *
 */
@RepositoryRestResource(collectionResourceRel="addressLocationInfo",path="addressLocationInfos")
public interface AddressLocationInfoRepository extends TypedIdCassandraRepository<AddressLocationInfo, Long> {

}
