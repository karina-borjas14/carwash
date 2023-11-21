package hn.lenguaje.carwash.modelos;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name ="tipoVehiculo")
@Entity
public class TipoVehiculo {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int  idTipoVehículo;

    private String  descripcion;

    private double  precioXhora;

    @OneToMany
    (mappedBy = "TipoVehiculo", cascade = CascadeType.ALL)
    private Vehiculo vehiculo;



    
}
