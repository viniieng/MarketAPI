package br.com.senai.apiProject.controller;

import br.com.senai.apiProject.entity.Sector;
import br.com.senai.apiProject.service.SectorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sectors")
public class SectorController {

    private final SectorService sectorService;

    public SectorController(SectorService sectorService) {
        this.sectorService = sectorService;
    }

    @GetMapping
    public List<Sector> findAll() {
        return sectorService.findAll();
    }

    @PostMapping
    public ResponseEntity<Sector> create(@RequestBody Sector sector) {
        Sector newSector = sectorService.save(sector);
        return ResponseEntity.ok(newSector);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        sectorService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{name}")
    public List<Sector> searchSectorByName(@PathVariable String name) {
        return sectorService.searchSectorByName(name);
    }
}