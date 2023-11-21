package hn.lenguaje.carwash.modelos;

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

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tipoCliente")
@Entity

public class TipoCliente {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int  idTipoCliente;
    private String descripcion;

    @OneToMany
    private Cliente cliente;



   
    
}
