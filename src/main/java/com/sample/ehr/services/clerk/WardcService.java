package com.sample.ehr.services.clerk;

import com.sample.ehr.models.clerk.*;
import com.sample.ehr.repository.clerk.WardcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

/**
 * ward service implement.
 */
@Service
public class WardcService {
    @Autowired

    private WardcRepository wardcRepository;

    public void setWardcRepository(WardcRepository wardcRepository) {
        this.wardcRepository = wardcRepository;
    }

    public ArrayList<Wardc> findAll() {
        return (ArrayList<Wardc>) wardcRepository.findAll();
    }

    public Wardc create(Wardc wardc) {
        return wardcRepository.save(wardc);
    }

    public Wardc update(Wardc wardc) {
        return wardcRepository.save(wardc);
    }

    public Wardc findById(Long id) {
        return wardcRepository.findById(id).get();
    }

    public void deleteById(Long idToDelete) {
        wardcRepository.deleteById(idToDelete);
    }

    public void deleteWardc(Wardc wardc) {
        wardcRepository.delete(wardc);
    }

}
