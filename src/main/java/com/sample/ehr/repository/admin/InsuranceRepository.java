package com.sample.ehr.repository.admin;

import com.sample.ehr.models.admin.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InsuranceRepository extends CrudRepository<Insurance, Long> {
}
