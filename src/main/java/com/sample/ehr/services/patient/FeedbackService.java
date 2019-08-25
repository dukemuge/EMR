package com.sample.ehr.services.patient;

import com.sample.ehr.models.patient.Feedback;

public interface FeedbackService {

    Iterable<Feedback> listAllFeedbacks();

    Feedback getFeedbackById(Long id);

    Feedback saveFeedback(Feedback feedback);

    void deleteFeedback(Long id);

}
