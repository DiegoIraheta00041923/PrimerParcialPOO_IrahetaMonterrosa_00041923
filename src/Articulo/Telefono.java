package Articulo;

import Articulo.Articulo;

public class Telefono extends Articulo implements Datos{
    private int memoria;
    private int pixelesCamara;

    public Telefono(int id, String nombre, String modelo, float precio, int memoria, int pixelesCamara) {
        super(id, nombre, modelo, precio);
        this.memoria = memoria;
        this.pixelesCamara = pixelesCamara;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public int getPixelesCamara() {
        return pixelesCamara;
    }

    public void setPixelesCamara(int pixelesCamara) {
        this.pixelesCamara = pixelesCamara;
    }

    @Override
    public float ObtenerPrecio() {
        return calcularPrecio();
    }

    @Override
    public void ObtenerDescripcion() {
        darDescripcion();
    }

    @Override
    public void darDescripcion() {
        System.out.println("memoria: "+getMemoria());
        System.out.println("Megapixeles de la camara: "+getPixelesCamara());
    }

    @Override
    public float calcularPrecio() {
        return getPrecio();
    }
}
