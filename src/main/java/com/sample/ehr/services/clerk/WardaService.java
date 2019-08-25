package com.sample.ehr.services.clerk;

import com.sample.ehr.models.clerk.*;
import com.sample.ehr.repository.clerk.WardaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

/**
 * ward service implement.
 */
@Service
public class WardaService {
    @Autowired

    private WardaRepository wardaRepository;

    public void setWardaRepository(WardaRepository wardaRepository) {
        this.wardaRepository = wardaRepository;
    }

    public ArrayList<Warda> findAll() {
        return (ArrayList<Warda>) wardaRepository.findAll();
    }

    public Warda create(Warda warda) {
        return wardaRepository.save(warda);
    }

    public Warda update(Warda warda) {
        return wardaRepository.save(warda);
    }

    public Warda findById(Long id) {
        return wardaRepository.findById(id).get();
    }

    public void deleteById(Long idToDelete) {
        wardaRepository.deleteById(idToDelete);
    }

    public void deleteWarda(Warda warda) {
        wardaRepository.delete(warda);
    }

}
