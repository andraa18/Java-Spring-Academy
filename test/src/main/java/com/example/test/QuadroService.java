package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuadroService {

    @Autowired
    private QuadroRepository quadroRepository;

    public List<Quadro> findAll() {
        return quadroRepository.findAll();
    }

    public Optional<Quadro> findById(Long id) {
        return quadroRepository.findById(id);
    }

    public Quadro save(Quadro quadro) {
        return quadroRepository.save(quadro);
    }

    public void deleteById(Long id) {
        quadroRepository.deleteById(id);
    }
}
