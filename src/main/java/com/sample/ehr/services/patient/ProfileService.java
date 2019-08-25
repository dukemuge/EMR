package com.sample.ehr.services.patient;

import com.sample.ehr.models.patient.Profile;

public interface ProfileService {

    Iterable<Profile> listAllProfiles();

    Profile getProfileById(Long id);

    Profile saveProfile(Profile profile);

    void deleteProfile(Long id);

}
