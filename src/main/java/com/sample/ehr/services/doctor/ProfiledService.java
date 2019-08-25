package com.sample.ehr.services.doctor;

import com.sample.ehr.models.doctor.Profiled;

public interface ProfiledService {

    Iterable<Profiled> listAllProfileds();

    Profiled getProfiledById(Long id);

    Profiled saveProfiled(Profiled profiled);

    void deleteProfiled(Long id);

}
