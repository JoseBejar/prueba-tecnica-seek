package pe.com.josebejar.seek.crudcandidato.infrastructure.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import pe.com.josebejar.seek.crudcandidato.domain.entidades.Candidato;

import java.util.List;

@RequestMapping(value = "/api/v1/candidatos")
public interface CandidatoController {
    @GetMapping(value = "/getListaCandidatos")
    ResponseEntity<List<Candidato>> getAllCandidates();

    @GetMapping("/getcandidato/{id}")
    public ResponseEntity<Candidato> getCandidatoById(@PathVariable("id") Long id);

    @PostMapping("/nuevocandidato")
    ResponseEntity<Candidato> createCandidato(@RequestBody Candidato candidato);

    @PutMapping("/updatecandidato/{id}")
    ResponseEntity<Candidato> updateCandidato(@PathVariable Long id, @RequestBody Candidato candidato);

    @DeleteMapping("/eliminarcandidato/{id}")
    ResponseEntity<Void> deleteCandidato(@PathVariable("id") Long id);
}
