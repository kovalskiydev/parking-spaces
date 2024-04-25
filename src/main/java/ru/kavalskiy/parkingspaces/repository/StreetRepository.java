package ru.kavalskiy.parkingspaces.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kavalskiy.parkingspaces.model.Street;

public interface StreetRepository extends JpaRepository<Street, Integer> { }
