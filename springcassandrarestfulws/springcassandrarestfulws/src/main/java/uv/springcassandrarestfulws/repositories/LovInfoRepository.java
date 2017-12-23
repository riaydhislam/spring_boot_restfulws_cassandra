/**
 * 
 */
package uv.springcassandrarestfulws.repositories;



import org.springframework.data.cassandra.repository.TypedIdCassandraRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uv.springcassandrarestfulws.model.LovInfo;

/**
 * @author A.Riaydh
 *
 */
@RepositoryRestResource(collectionResourceRel = "lovInfo", path = "lovInfos")
public interface LovInfoRepository extends TypedIdCassandraRepository<LovInfo, Long>{

}
