package com.sample.ehr.repository.clerk;

import com.sample.ehr.models.clerk.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WarddRepository extends CrudRepository<Wardd, Long> {
}
