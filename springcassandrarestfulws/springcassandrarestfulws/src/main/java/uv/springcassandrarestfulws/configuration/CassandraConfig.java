/**
 * 
 */
package uv.springcassandrarestfulws.configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cassandra.config.CassandraCqlClusterFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.cassandra.config.SchemaAction;
import org.springframework.data.cassandra.config.java.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

/**
 * @author A.Riaydh
 *
 */
@Configuration
@EnableCassandraRepositories(basePackages = "uv.springcassandrarestfulws.repositories")
public class CassandraConfig extends AbstractCassandraConfiguration {
	@Autowired
    private Environment environment;
	
    @Bean
    @Override
    public CassandraCqlClusterFactoryBean cluster() {
        CassandraCqlClusterFactoryBean bean = new CassandraCqlClusterFactoryBean();
        bean.setKeyspaceCreations(getKeyspaceCreations());
        bean.setContactPoints(environment.getProperty("spring.data.cassandra.contact-points"));
        bean.setUsername(environment.getProperty("spring.data.cassandra.username"));
        bean.setPassword(environment.getProperty("spring.data.cassandra.password"));
        return bean;
    }

    @Override
    public SchemaAction getSchemaAction() {
        return SchemaAction.CREATE_IF_NOT_EXISTS;
    }

    @Override
    protected String getKeyspaceName() {
        return environment.getProperty("spring.data.cassandra.keyspace-name");
    }

    @Override
    public String[] getEntityBasePackages() {
        return new String[]{"uv.springcassandrarestfulws.model"};
    }




}
