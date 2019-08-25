package com.sample.ehr.repository.admin;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sample.ehr.models.admin.*;


@Repository
public interface LabtechRepository extends CrudRepository<Labtech, Long> {
}




