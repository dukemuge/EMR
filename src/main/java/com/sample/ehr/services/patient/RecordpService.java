package com.sample.ehr.services.patient;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.ehr.models.patient.Donation;
import com.sample.ehr.models.patient.Recordp;
import com.sample.ehr.repository.patient.DonationRepository;
import com.sample.ehr.repository.patient.RecordpRepository;

@Service
public class RecordpService {
	@Autowired

    private RecordpRepository recordpRepository;

    public void setRecordpRepository(RecordpRepository recordpRepository) {
        this.recordpRepository = recordpRepository;
    }

    public ArrayList<Recordp> findAll() {
        return (ArrayList<Recordp>) recordpRepository.findAll();
    }

    public Recordp create(Recordp recordp) {
        return recordpRepository.save(recordp);
    }

    public Recordp update(Recordp recordp) {
        return recordpRepository.save(recordp);
    }

    public Recordp findById(Long id) {
        return recordpRepository.findById(id).get();
    }

    public void deleteById(Long idToDelete) {
        recordpRepository.deleteById(idToDelete);
    }

    public void deleteRecordp(Recordp recordp) {
        recordpRepository.delete(recordp);
    }

}
