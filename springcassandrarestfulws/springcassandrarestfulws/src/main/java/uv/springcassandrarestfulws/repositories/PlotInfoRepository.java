/**
 * 
 */
package uv.springcassandrarestfulws.repositories;

import org.springframework.data.cassandra.repository.TypedIdCassandraRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uv.springcassandrarestfulws.model.PlotInfo;

/**
 * @author A.Riaydh
 *
 */
@RepositoryRestResource(collectionResourceRel="plotInfo", path="plotInfos")
public interface PlotInfoRepository extends TypedIdCassandraRepository<PlotInfo, Long>{

}
