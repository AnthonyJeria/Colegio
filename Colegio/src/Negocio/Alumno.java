package Negocio;

/**
 *
 * @author ANTHONY JERIA
 */
public class Alumno {
    
    private String nombre,snombre,appaterno,apmaterno,dv_rut;
    private int edad,numRut;

    public Alumno() {
    }

    public Alumno(String nombre, String snombre, String appaterno, String apmaterno, String dv_rut, int edad, int numRut) {
        this.nombre = nombre;
        this.snombre = snombre;
        this.appaterno = appaterno;
        this.apmaterno = apmaterno;
        this.dv_rut = dv_rut;
        this.edad = edad;
        this.numRut = numRut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSnombre() {
        return snombre;
    }

    public void setSnombre(String snombre) {
        this.snombre = snombre;
    }

    public String getAppaterno() {
        return appaterno;
    }

    public void setAppaterno(String appaterno) {
        this.appaterno = appaterno;
    }

    public String getApmaterno() {
        return apmaterno;
    }

    public void setApmaterno(String apmaterno) {
        this.apmaterno = apmaterno;
    }

    public String getDv_rut() {
        return dv_rut;
    }

    public void setDv_rut(String dv_rut) {
        this.dv_rut = dv_rut;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumRut() {
        return numRut;
    }

    public void setNumRut(int numRut) {
        this.numRut = numRut;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", snombre=" + snombre + ", appaterno=" + appaterno + ", apmaterno=" + apmaterno + ", dv_rut=" + dv_rut + ", edad=" + edad + ", numRut=" + numRut + '}';
    }
    
}
