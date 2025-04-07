package dto;

import lombok.Builder;
import lombok.Data;

public class SamatosDalis {
    @Data
    @Builder
    public class SamatosRequest {
        private String kategorija;
        private String medziaga;
        private String tiekejas;
        private double vienetoKaina;
        private double bendraKaina;
    }
}
