package com.sample.ehr.repository.patient;

import com.sample.ehr.models.patient.*;
import org.springframework.data.repository.CrudRepository;

public interface RemindRepository extends CrudRepository<Remind, Long> {

}
