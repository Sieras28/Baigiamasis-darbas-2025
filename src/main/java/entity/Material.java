package entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Material {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String pavadinimas;
    private String kategorija;
    private String matavimoVienetas;
    private double vienetoKaina;

    @ManyToOne
    private Tiekejas tiekejas;
}

