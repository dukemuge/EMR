package com.sample.ehr.services.patient;

import com.sample.ehr.models.patient.Remind;

public interface RemindService {

    Iterable<Remind> listAllReminds();

    Remind getRemindById(Long id);

    Remind saveRemind(Remind remind);

    void deleteRemind(Long id);

}
