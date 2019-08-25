package com.sample.ehr.services.doctor;

import com.sample.ehr.models.doctor.*;
import com.sample.ehr.repository.doctor.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

/**
 * record service implement.
 */
@Service
public class RecordService {
    @Autowired

    private RecordRepository recordRepository;

    public void setRecordRepository(RecordRepository recordRepository) {
        this.recordRepository = recordRepository;
    }

    public ArrayList<Record> findAll() {
        return (ArrayList<Record>) recordRepository.findAll();
    }

    public Record create(Record record) {
        return recordRepository.save(record);
    }

    public Record update(Record record) {
        return recordRepository.save(record);
    }

    public Record findById(Long id) {
        return recordRepository.findById(id).get();
    }

    public void deleteById(Long idToDelete) {
        recordRepository.deleteById(idToDelete);
    }

    public void deleteRecord(Record record) {
        recordRepository.delete(record);
    }

}
