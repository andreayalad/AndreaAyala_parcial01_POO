package com.AAAD.x00109319;

public final class CalculadoraDeImpuestos{
    private static double totalRenta, totalISSS, totalAFP;

    private CalculadoraDeImpuestos() {
    }
    public static double calcularPago(Empleado s){
        double pagoTotal;
        if(s instanceof ServicioProfesional){
            totalRenta= s.getSalario()*0.1;
            pagoTotal= s.getSalario()-totalRenta;
        }else{ //Plaza fija
            totalISSS= s.getSalario()*0.0625;
            totalAFP= s.getSalario()*0.03;
            double restante= s.getSalario()-totalISSS-totalAFP;
            //rangoA
            if(restante >=0.01 || restante <= 472)
                totalRenta= restante;
            //rangoB
            else if (restante >=472.01 || restante <= 895.24)
                totalRenta= (0.1*(restante-472)+17.67);
            //rangoC
            else if(restante >=895.25 || restante <=2038.10)
                totalRenta= (0.2*(restante-895.24)+60);
            //rangoD
            else
                totalRenta= (0.3*(restante-2038.10)+288.57);
             pagoTotal= restante-totalRenta;

        }


        return pagoTotal;
    }
    public String mostrarTotales(){
        return ("Total AFP: "+totalAFP+" Total ISSS: "+totalISSS+" Total Renta: "+totalRenta);
    }
}
