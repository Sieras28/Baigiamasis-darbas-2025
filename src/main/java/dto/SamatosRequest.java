package dto;

import lombok.Builder;
import lombok.Data;

public class SamatosRequest {
    @Data
    @Builder
    public class SamatosDalisDto {
        private String kategorija;
        private String medziaga;
        private String tiekejas;
        private double vienetoKaina;
        private double bendraKaina;
    }
}
