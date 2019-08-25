package com.sample.ehr.services.patient;

import com.sample.ehr.models.patient.*;
import com.sample.ehr.repository.patient.RemindRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Product service implement.
 */
@Service
public class RemindServiceImpl implements RemindService {

    private RemindRepository remindRepository;

    @Autowired
    public void setRemindRepository(RemindRepository remindRepository) {
        this.remindRepository = remindRepository;
    }

    @Override
    public Iterable<Remind> listAllReminds() {
        return remindRepository.findAll();
    }

    @Override
    public Remind getRemindById(Long id) {
        return remindRepository.findById(id).get();
    }

    @Override
    public Remind saveRemind(Remind remind) {
        return remindRepository.save(remind);
    }

    @Override
    public void deleteRemind(Long id) {
        remindRepository.deleteById(id);
    }

}
