package repository;

import entity.Material;
import entity.Tiekejas;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
public interface MaterialRepository extends JpaRepository<Material, Long> {
    List<Material> findByKategorijaAndPavadinimas(String kategorija, String pavadinimas);
    Optional<Material> findByPavadinimasAndTiekejas(String pavadinimas, Tiekejas tiekejas);
}
