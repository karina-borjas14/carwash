package hn.lenguaje.carwash.modelos;

import org.springframework.boot.autoconfigure.AutoConfiguration;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AutoConfiguration
@NoArgsConstructor
@Table(name = "vehiculo")
@Entity

public class Vehiculo {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int idVehiculo;

    private String marca;

    private int anyo;

    private boolean disponible;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "idTipoVehiculo", referencedColumnName = "idTipoVehiculo ")
    private TipoVehiculo tipoVehiculo;

    

    
}
