package ru.kavalskiy.parkingspaces.service;

import ru.kavalskiy.parkingspaces.model.Street;

import java.util.List;

public interface StreetService {
    void save(Street street);
    List<Street> findAll();
    Street findById(int id);
    void delete(Street street);
}
