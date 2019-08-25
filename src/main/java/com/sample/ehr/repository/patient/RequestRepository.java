package com.sample.ehr.repository.patient;

import com.sample.ehr.models.patient.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestRepository extends CrudRepository<Request, Long> {
}




