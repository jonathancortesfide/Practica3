package Practica01.demo.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="arbol")
public class Arbol implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    private String nombre_comun;
    private String tipo_flor;
    private int dureza_madera;
    private float altura;
    private String ruta_imagen;

    public Arbol() {
    }

    public Arbol(String nombre_comun,String tipo_flor,int dureza_madera, float altura ) {
        this.nombre_comun = nombre_comun; 
        this.tipo_flor = tipo_flor;
        this.dureza_madera = dureza_madera;
        this.altura = altura;
    }
    
      // Getter para el atributo nombre
    public long getIdArbol() {
        return this.id;
    }
    
}