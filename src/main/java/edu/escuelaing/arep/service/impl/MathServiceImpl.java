package edu.escuelaing.arep.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.escuelaing.arep.service.MathService;

@Service
public class MathServiceImpl implements MathService {

    @Override
    public List<Integer> factors(int n) {
        List<Integer> factors = new ArrayList<>();

        for(int i = 1; i <= n; i++) {
            if (n % i == 0) factors.add(i);
        }

        return factors;
    }

    @Override
    public List<Integer> primes(int n) {
        List<Integer> primes = new ArrayList<>();

        for(int i = 1; i <= n; i++) {
            int nfactors = 0;

            for(int j = 1; j <= i; j++) {
                if (i % j == 0) nfactors++;
            }

            if (nfactors == 2) primes.add(i);
        }

        for (Integer prime : primes) {
            System.out.println(prime);
        }

        return primes;
    }
    
}
