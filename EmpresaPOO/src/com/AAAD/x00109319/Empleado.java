package com.AAAD.x00109319;

public abstract class Empleado {
    protected String nombre, puesto;
    protected double salario;

    public Empleado(String nombre, String puesto, int salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double pSalario) {
        salario= pSalario;
    }

}
