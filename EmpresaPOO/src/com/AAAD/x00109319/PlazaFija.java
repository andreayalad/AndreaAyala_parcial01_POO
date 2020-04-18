package com.AAAD.x00109319;

public class PlazaFija extends Empleado {
    private int extension;

    public PlazaFija(int extension){
        this.extension = extension;
    }
    public PlazaFija(String nombre, String puesto, double salario, int extension) {
        super(nombre, puesto, salario);
        this.extension = extension;
    }

    public int getExtension() {
        return extension;
    }

    public void setExtension(int nExtension) {
        extension = nExtension;
    }

    @Override
    public String toString() {
        return "PlazaFija{" +
                "extension=" + extension +
                '}';
    }
}
