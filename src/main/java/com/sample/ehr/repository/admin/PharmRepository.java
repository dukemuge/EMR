package com.sample.ehr.repository.admin;

import com.sample.ehr.models.admin.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PharmRepository extends CrudRepository<Pharm, Long> {
}
