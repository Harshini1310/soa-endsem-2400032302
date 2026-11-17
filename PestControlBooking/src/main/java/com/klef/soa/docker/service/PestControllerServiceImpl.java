
package com.klef.soa.docker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.soa.docker.entity.PestControllerEntity;
import com.klef.soa.docker.repository.PestControllerRepository;

@Service
public class PestControllerServiceImpl implements PestControllerService {

    @Autowired
    private PestControllerRepository pestControllerRepository;

    @Override
    public PestControllerEntity addPest(PestControllerEntity p) {
        return pestControllerRepository.save(p);
    }

    @Override
    public List<PestControllerEntity> displayAll() {
        return pestControllerRepository.findAll();
    }

}
