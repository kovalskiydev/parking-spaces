package ru.kavalskiy.parkingspaces.controller;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.kavalskiy.parkingspaces.model.Street;
import ru.kavalskiy.parkingspaces.service.StreetService;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@AllArgsConstructor
@RequestMapping("/api/streets")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StreetControllerImpl implements StreetController {
    StreetService streetService;

    @Override
    public ResponseEntity<?> save(Street street) {
        Map<String, Object> response = new LinkedHashMap<>();

        streetService.save(street);
        response.put("status", 1);
        response.put("message", "Street saved");
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }


    @Override
    public ResponseEntity<?> getAll() {
        Map<String, Object> response = new LinkedHashMap<>();

        List<Street> streetList = streetService.findAll();
        if (!streetList.isEmpty()) {
            response.put("status", 1);
            response.put("data", streetList);

            return new ResponseEntity<>(response, HttpStatus.OK);
        } else {
            response.put("status", 0);
            response.put("message", "No streets found");

            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ResponseEntity<?> getById(Integer id) {
        Map<String, Object> response = new LinkedHashMap<>();

        try {
            Street street = streetService.findById(id);

            response.put("status", 1);
            response.put("data", street);

            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception ex) {
            response.clear();

            response.put("status", 0);
            response.put("message", "No street found");

            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }

    }

    @Override
    public ResponseEntity<?> updateById(Integer id, Street street) {
        Map<String, Object> response = new LinkedHashMap<>();

        try {
            Street streetToUpdate = streetService.findById(id);

            streetToUpdate.setName(street.getName());
            streetToUpdate.setTotalSpace(street.getTotalSpace());
            streetToUpdate.setAvailableSpace(street.getAvailableSpace());
            streetToUpdate.setOccupiedSpace(street.getOccupiedSpace());

            streetService.save(streetToUpdate);

            response.put("status", 1);
            response.put("data", streetService.findById(id));

            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception ex) {
            response.clear();

            response.put("status", 0);
            response.put("message", "No street found");

            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ResponseEntity<?> delete(Integer id) {
        Map<String, Object> response = new LinkedHashMap<>();
        try {
            streetService.delete(streetService.findById(id));

            response.put("status", 1);
            response.put("message", "Street deleted");

            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception ex) {
            response.clear();

            response.put("status", 0);
            response.put("message", "No street found");

            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }
    }
}
