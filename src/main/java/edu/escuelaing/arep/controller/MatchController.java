package edu.escuelaing.arep.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.escuelaing.arep.service.MathService;

@RestController
public class MatchController {
    private final MathService mathService;

    public MatchController(MathService mathService) {
        this.mathService = mathService;
    }

    @GetMapping("/factors")
    public List<Integer> factors(@RequestParam int n) {
        return mathService.factors(n);
    }

    @GetMapping("/primes")
    public List<Integer> primes(@RequestParam int n) {
        return mathService.primes(n);
    }
}
