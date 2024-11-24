package br.com.senai.apiProject.service;

import br.com.senai.apiProject.entity.Sector;
import br.com.senai.apiProject.repository.SectorRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SectorService {

    private final SectorRepository sectorRepository;

    public SectorService(SectorRepository sectorRepository) {
        this.sectorRepository = sectorRepository;
    }

    public List<Sector> findAll() {
        return sectorRepository.findAll();
    }

    public Sector save(Sector sector) {
        return sectorRepository.save(sector);
    }

    public void deleteById(Long id) {
        sectorRepository.deleteById(id);
    }

    public List<Sector> searchSectorByName(String sectorName) {
        List<Sector> sectors = new ArrayList<>();
        try {
            sectors = sectorRepository.findByNameContainingIgnoreCase(sectorName);

            if (!sectors.isEmpty()) {
                System.out.println("Found Sector: " + sectors.get(0).getName());
            } else {
                System.out.println("No sectors found with the name: " + sectorName);
            }

        } catch (Exception exception) {
            System.out.println("Error while searching for sectors: " + exception.getMessage());
        }

        return sectors;
    }

    public Sector updateSector(Long id, Sector updatedSector) {
        Optional<Sector> existingSectorOpt = sectorRepository.findById(id);
        if (existingSectorOpt.isPresent()) {
            Sector existingSector = existingSectorOpt.get();
            existingSector.setName(updatedSector.getName());
            return sectorRepository.save(existingSector);
        } else {
            throw new RuntimeException("Sector not found with id: " + id);
        }
    }
}