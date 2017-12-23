/**
 * 
 */
package uv.springcassandrarestfulws.repositories;

import org.springframework.data.cassandra.repository.TypedIdCassandraRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uv.springcassandrarestfulws.model.FloorInfo;

/**
 * @author A.Riaydh
 *
 */
@RepositoryRestResource(collectionResourceRel="floorInfo",path="floorInfos")
public interface FloorInfoRepository extends TypedIdCassandraRepository<FloorInfo, Long>{

}
