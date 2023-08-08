package Validaciones;

import org.example.Utilidades.Util;

import java.time.LocalDate;

public class OfertaValidacion {
    Util util = new Util();

    public Boolean validarTitulo(String titulo){
        return true;
    }
    public Boolean validarFechaI_F(LocalDate fecha_inicio, LocalDate fecha_fin){
        return true;
    }
    public Boolean validarFecha(LocalDate fecha){
        if (!util.buscarCoincidencia(fecha,fecha.format(DD/MM/YYYY)))
    }
    public Boolean validarCosto(Integer costo){
        return true;
    }

}
