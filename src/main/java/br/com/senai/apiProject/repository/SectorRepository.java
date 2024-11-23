package br.com.senai.apiProject.repository;

import br.com.senai.apiProject.entity.Sector;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface SectorRepository extends JpaRepository<Sector, Long> {

    Optional<Sector> findByNameIgnoreCase(String name);

    @Query("SELECT COUNT(p) FROM Product p WHERE p.sector.id = :sectorId")
    Long countProductsInSector(Long sectorId);

    @Query("SELECT s FROM Sector s WHERE LOWER(s.name) LIKE LOWER(CONCAT('%', :name, '%'))")
    List<Sector> findByNameContainingIgnoreCase(@Param("name") String name);
}