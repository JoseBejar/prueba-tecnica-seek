package pe.com.josebejar.seek.crudcandidato.infrastructure.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import pe.com.josebejar.seek.crudcandidato.application.service.CandidatoService;
import pe.com.josebejar.seek.crudcandidato.domain.entidades.Candidato;

import java.util.List;

@RestController
public class CandidatoControllerImpl implements CandidatoController{


    private final CandidatoService candidatoService;

    public CandidatoControllerImpl(CandidatoService candidatoService) {
        this.candidatoService = candidatoService;
    }

    @Override
    public ResponseEntity<List<Candidato>> getAllCandidates() {
        List<Candidato> listCandidatos = candidatoService.getAllCandidates();
        return ResponseEntity.ok(listCandidatos);
    }

    @Override
    public ResponseEntity<Candidato> getCandidatoById(Long id) {
        Candidato candidato = candidatoService.getCandidatoById(id);
        if (candidato != null) {
            return ResponseEntity.ok(candidato);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<Candidato> createCandidato(Candidato candidato) {
        Candidato createdCandidato = candidatoService.createCandidato(candidato);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdCandidato);
    }

    @Override
    public ResponseEntity<Candidato> updateCandidato(Long id, Candidato candidato) {
        Candidato updatedCandidato = candidatoService.updateCandidato(id, candidato);
        if (updatedCandidato != null) {
            return ResponseEntity.ok(updatedCandidato);
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<Void> deleteCandidato(Long id) {
        candidatoService.deleteCandidato(id);
        return ResponseEntity.noContent().build();
    }
}
