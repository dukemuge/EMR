package com.sample.ehr.services.doctor;

import com.sample.ehr.models.doctor.Reminder;

public interface ReminderService {

    Iterable<Reminder> listAllReminders();

    Reminder getReminderById(Long id);

    Reminder saveReminder(Reminder reminder);

    void deleteReminder(Long id);

}
