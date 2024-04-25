package ru.kavalskiy.parkingspaces.service;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import ru.kavalskiy.parkingspaces.model.Street;
import ru.kavalskiy.parkingspaces.repository.StreetRepository;

import java.util.List;

@Service
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StreetServiceImpl implements StreetService {
    StreetRepository streetRepository;

    @Override
    public void save(Street street) {
        streetRepository.save(street);
    }

    @Override
    public List<Street> findAll() {
        return streetRepository.findAll();
    }

    @Override
    public Street findById(int id) {
        return streetRepository.findById(id).get();
    }

    @Override
    public void delete(Street street) {
        streetRepository.delete(street);
    }
}
