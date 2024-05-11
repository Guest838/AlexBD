package com.example.AlBD.controller;

import com.example.AlBD.Country;
import com.example.AlBD.repository.CountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/countries")
public class CookingWayController {



    private final CountryRepository repo;

    @GetMapping(value = "/getAll")
    public ResponseEntity<List<Country>> getAllCountries() {
        var result=repo.findAll();
        if (!result.isEmpty())
        {
            return ResponseEntity.ok(result);
        }
        else {
            return ResponseEntity.noContent().build();
        }
    }

    @GetMapping(value = "/getByID")
    public ResponseEntity<Country> getCountryByID(int id) {
        var result=repo.findById(id);
        return result.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping(value="/updateByID")
    public ResponseEntity<Country> updateCountryByID(Integer id, @RequestBody Country country)
    {

        if (repo.findById(id).isPresent())
        {
            Country result=repo.findById(id).orElseThrow(RuntimeException::new);
            result.setName(country.getName());
            result.setDescriptionFamousDishes(country.getDescriptionFamousDishes());
            return  ResponseEntity.ok(repo.save(result));
        }
        else
        {
            return ResponseEntity.notFound().build();
        }


    }

    @DeleteMapping(value = "/deleteByID")
    public void deleteCountryByID(int id) {
        repo.deleteById(id);
    }


}
