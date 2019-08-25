package com.sample.ehr.repository.labtech;

import com.sample.ehr.models.labtech.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReminderlRepository extends CrudRepository<Reminderl, Long> {
}




