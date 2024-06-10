package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/quadri")
public class QuadroController {

    @Autowired
    private QuadroService quadroService;

    @GetMapping
    public List<Quadro> getAll() {
        return quadroService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Quadro> getById(@PathVariable Long id) {
        Optional<Quadro> quadro = quadroService.findById(id);
        if (quadro.isPresent()) {
            return ResponseEntity.ok(quadro.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Quadro createQuadro(@RequestBody Quadro quadro) {
        return quadroService.save(quadro);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Quadro> updateQuadro(@PathVariable Long id, @RequestBody Quadro quadroDetails) {
        Optional<Quadro> quadroOptional = quadroService.findById(id);
        if (quadroOptional.isPresent()) {
            Quadro quadro = quadroOptional.get();
            quadro.setId(quadroDetails.getId());
            quadro.setTitolo(quadroDetails.getTitolo());
            quadro.setAutore(quadroDetails.getAutore());
            quadro.setAnno(quadroDetails.getAnno());
            return ResponseEntity.ok(quadroService.save(quadro));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteQuadro(@PathVariable Long id) {
        Optional<Quadro> quadro = quadroService.findById(id);
        if (quadro.isPresent()) {
            quadroService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
