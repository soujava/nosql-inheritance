package org.jnosql.demo.se;

import jakarta.data.repository.Repository;
import org.eclipse.jnosql.databases.oracle.mapping.OracleNoSQLRepository;

import java.util.UUID;

@Repository
public interface Console extends OracleNoSQLRepository<GameCharacter, UUID>{
}
