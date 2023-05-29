/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenfinal;

import java.util.ArrayList;

/**
 *
 * @author sardr
 */
public class produccion {

    private String actividad;
    private String codigo;
    private int id;
    private String nombre;
    private String responsable;
    private String uso;
    
    public static ArrayList<produccion> producciones = new ArrayList<>();
    
 public produccion(){
 }

    public produccion(String actividad, String codigo, int id, String nombre, String responsable, String uso) {
        this.actividad = actividad;
        this.codigo = codigo;
        this.id = id;
        this.nombre = nombre;
        this.responsable = responsable;
        this.uso = uso;
    }
    
    public static void llenar(){
        insertarproduccion("Proceso general de fabricación de nuevos productos","FAB-000", 1, "FAB-000 FABRICACIÓN","GERENCIA, PRODUCCIÓN, COMPRAS, CALIDAD", "planificadores" );
        insertarproduccion("SubProceso de órdenes de producción del plan anual","FAB-001",2, "FAB-001 Órdenes de producción Plan Anual", "FABRICACION","GERENCIA");
        insertarproduccion("SubProceso de lanzamiento de fabricación de nuevos productos","FAB-002",3,  "FAB-002 Órdenes de producción", "FABRICACION","PRODUCION");
        insertarproduccion("SubProceso de Solicitud de Insumos", "FAB-002",4,"FAB-003 Solicitud de Insumos","FABRICACION","PRODUCCION");
        insertarproduccion( "SubProceso de Autorización de Insumos para su compra","FAB-004",5,"FAB-004 Autorización de Insumos", "FABRICACION", "PRODUCCION" );
        insertarproduccion("SubProceso de Autorización de Insumos para su compra", "FAB-005",6, "FAB-005 Autorización de Insumos", "FABRICACION","COMPRAS");
        insertarproduccion("SubProceso de Autorización de Insumos para su compra","FAB-006",7,"FAB-005 Control de Calidad","FABRICACION","CALIDAD");
    }
    public static void insertarproduccion(String actividad, String codigo, int id, String nombre, String responsable, String uso) {
       producciones.add(new produccion(actividad, codigo, id, nombre,responsable, uso)); 
    }
    
    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    @Override
    public String toString() {
        return "produccion{" + "actividad=" + actividad + ", codigo=" + codigo + ", id=" + id + ", nombre=" + nombre + ", responsable=" + responsable + ", uso=" + uso + '}';
    }
    
}


