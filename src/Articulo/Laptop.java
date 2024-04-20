package Articulo;

public class Laptop extends Articulo implements Datos{

    private int memoriaRam;
    private String sistemaOperativo;
    public Laptop(int id, String nombre, String modelo, float precio, int memoriaRam, String sistemaOperativo) {
        super(id, nombre, modelo, precio);
        this.memoriaRam = memoriaRam;
        this.sistemaOperativo= sistemaOperativo;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
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
        System.out.println("Memoria Ram: "+getMemoriaRam());
        System.out.println("Sistema operativo: "+getSistemaOperativo());
    }

    @Override
    public float calcularPrecio() {
        return getPrecio();
    }
}
