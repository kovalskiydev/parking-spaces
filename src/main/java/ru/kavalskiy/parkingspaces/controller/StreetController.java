package ru.kavalskiy.parkingspaces.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.kavalskiy.parkingspaces.model.Street;


public interface StreetController {

    @PostMapping("/save")
    ResponseEntity<?> save(@RequestBody Street street);

    @GetMapping("/list")
    ResponseEntity<?> getAll();

    @GetMapping("/{id}")
    ResponseEntity<?> getById(@PathVariable Integer id);

    @PutMapping("/update/{id}")
    ResponseEntity<?> updateById(@PathVariable Integer id, @RequestBody Street street);

    @DeleteMapping("/delete/{id}")
    ResponseEntity<?> delete(@PathVariable Integer id);

}
