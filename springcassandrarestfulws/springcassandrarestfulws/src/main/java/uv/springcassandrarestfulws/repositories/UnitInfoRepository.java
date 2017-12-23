/**
 * 
 */
package uv.springcassandrarestfulws.repositories;

import org.springframework.data.cassandra.repository.TypedIdCassandraRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uv.springcassandrarestfulws.model.UnitInfo;

/**
 * @author A.Riaydh
 *
 */
@RepositoryRestResource(collectionResourceRel="unitInfo",path="unitInfos")
public interface UnitInfoRepository extends TypedIdCassandraRepository<UnitInfo, Long> {

}
