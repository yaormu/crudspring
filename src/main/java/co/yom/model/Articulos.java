package co.yom.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "articulos")
@AllArgsConstructor
@NoArgsConstructor
public class Articulos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(name = "descripcion", length = 60, nullable = false)
    private String descripcion;

    @Column(name = "precio", length = 60, nullable = false)
    private float precio;
}



