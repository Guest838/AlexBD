package com.example.AlBD.controller;
import com.example.AlBD.Season;
import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.AlBD.repository.SeasonRepository;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/seasons")
public class SeasonController {



    private final SeasonRepository repo;

    @GetMapping(value = "/getAll")
    public ResponseEntity<List<Season>> getAllSeasons() {
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
    public ResponseEntity<Season> getSeasonByID(int id) {
        var result=repo.findById(id);
        return result.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping(value="/updateByID")
            public ResponseEntity<Season> updateSeasonByID(Integer id, @RequestBody Season season)
    {

        if (repo.findById(id).isPresent())
        {
            Season result=repo.findById(id).orElseThrow(RuntimeException::new);
            result.setId(season.getId());
            result.setMonthStart(season.getMonthStart());
            result.setMonthEnd(season.getMonthEnd());
            result.setName(season.getName());
            return  ResponseEntity.ok(repo.save(result));
        }
        else
        {
            return ResponseEntity.notFound().build();
        }


    }

    @DeleteMapping(value = "/deleteByID")
    public void deleteSeasonByID(int id) {
        repo.deleteById(id);
    }


}



