package org.jnosql.demo.se;

import jakarta.data.repository.PageableRepository;
import jakarta.data.repository.Repository;

import java.util.UUID;

@Repository
public interface SonicRepository extends PageableRepository<Sonic, UUID> {
}
