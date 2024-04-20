package Articulo;

public abstract class Articulo {
    private int id;
    private String nombre;
    private String modelo;
    private float precio;

    public Articulo() {
    }

    public Articulo(int id, String nombre, String modelo, float precio) {
        this.id = id;
        this.nombre = nombre;
        this.modelo = modelo;
        this.precio = precio;
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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public abstract float ObtenerPrecio();
    public abstract void ObtenerDescripcion();
}
