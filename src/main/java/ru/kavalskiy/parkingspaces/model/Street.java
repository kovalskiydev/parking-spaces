package ru.kavalskiy.parkingspaces.model;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@Entity
@Table(name = "streets")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Street {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "name")
    String name;

    @Column(name = "totalSpace")
    Integer totalSpace;

    @Column(name = "availableSpace")
    Integer availableSpace;

    @Column(name = "occupiedSpace")
    Integer occupiedSpace;
}
