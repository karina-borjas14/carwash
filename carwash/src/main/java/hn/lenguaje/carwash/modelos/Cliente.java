package hn.lenguaje.carwash.modelos;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

//import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
//import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "cliente")
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

   @Id
   @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int  codigoCliente;

    private String  nombre;

    private   String  apellido;

     private Date  fechaIngreso;
    
    
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = " idTipoCliente", referencedColumnName="idTipoCliente")
    private TipoCliente tipoCliente;

 
    




}
