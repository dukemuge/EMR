package com.sample.ehr.repository.patient;

import org.springframework.data.repository.CrudRepository;

import com.sample.ehr.models.patient.Feedback;

public interface FeedbackRepository extends  CrudRepository<Feedback, Long> {
}
