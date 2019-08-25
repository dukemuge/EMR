package com.sample.ehr.repository.patient;

import org.springframework.data.repository.CrudRepository;

import com.sample.ehr.models.patient.Donation;

public interface DonationRepository extends CrudRepository<Donation, Long> {

}
