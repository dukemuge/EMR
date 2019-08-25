package com.sample.ehr.repository.patient;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sample.ehr.models.patient.Profile;
//import com.example.demo.models.patient.Remind;
@Repository
public interface ProfileRepository extends CrudRepository<Profile, Long> {
}
