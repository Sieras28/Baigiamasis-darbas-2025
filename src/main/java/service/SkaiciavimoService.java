package service;

import dto.SamatosRequest;
import dto.SamatosDalis;

import java.util.List;

public interface SkaiciavimoService {
    String getKategorija();
    List<SamatosDalis> skaiciuoti(SamatosRequest request);
}
