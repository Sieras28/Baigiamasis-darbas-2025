package controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class PamataiController {
    @RestController
    @RequiredArgsConstructor
    @RequestMapping("/pamatai")
    public class PamataiController {
        private final PamataiService service;

        @PostMapping
        public List<SamatosDalisDto> skaiciuoti(@RequestBody SamatosRequest request) {
            return service.skaiciuoti(request);
        }
    }
}
