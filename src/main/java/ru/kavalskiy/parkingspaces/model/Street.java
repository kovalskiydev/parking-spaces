package ru.kavalskiy.parkingspaces.model;

import jakarta.persistence.*;
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
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "totalSpace")
    private String totalSpace;

    @Column(name = "availableSpace")
    private String availableSpace;

    @Column(name = "occupiedSpace")
    private String occupiedSpace;
}
