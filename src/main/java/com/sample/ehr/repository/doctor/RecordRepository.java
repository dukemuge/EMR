package com.sample.ehr.repository.doctor;

import com.sample.ehr.models.doctor.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordRepository extends CrudRepository<Record, Long> {
}
