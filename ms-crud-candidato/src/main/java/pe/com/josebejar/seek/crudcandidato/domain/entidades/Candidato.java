package pe.com.josebejar.seek.crudcandidato.domain.entidades;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "CANDIDATO")
public class Candidato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "APELLIDO")
    private String apellido;

    @Column(name = "EMAIL")
    private String correo;

    @Column(name = "GENERO")
    private String genero;

    @Column(name = "TELEFONO")
    private String telefono;

    @Column(name = "EXPECTATIVA_SALARIAL")
    private Double expectativaSalarial;
}
