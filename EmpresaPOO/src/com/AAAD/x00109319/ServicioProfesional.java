package com.AAAD.x00109319;

public class ServicioProfesional extends Empleado {
    private int meses_Contrato;

    public ServicioProfesional(String nombre, String puesto, int salario, int meses_Contrato) {
        super(nombre, puesto, salario);
        this.meses_Contrato=meses_Contrato;
    }

    public int getMeses_Contrato() {
        return meses_Contrato;
    }

    public void setMeses_Contrato(int mesesdeC) {
        meses_Contrato= mesesdeC;
    }
}
