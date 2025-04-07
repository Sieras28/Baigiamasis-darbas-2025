package repository;

import entity.Tiekejas;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TiekejasRepository extends JpaRepository<Tiekejas, Long> {
    Optional<Tiekejas> findByPavadinimas(String pavadinimas);
}
