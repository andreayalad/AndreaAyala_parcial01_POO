package com.AAAD.x00109319;

public final class CalculadoraDeImpuestos{
    private static double totalRenta, totalISSS, totalAFP;

    private CalculadoraDeImpuestos() {
    }
    public static double calcularPago(Empleado s){
        double pagoTotal=0;
        double auxRenta=0,auxISSS=0, auxAFP=0;
        if(s instanceof ServicioProfesional){
            auxRenta= s.getSalario()*0.1;
            pagoTotal= s.getSalario()-auxRenta;
        }else{ //Plaza fija
            auxISSS= s.getSalario()*0.0625;
            auxAFP= s.getSalario()*0.03;
            double restante= s.getSalario()-auxAFP-auxISSS;
            //rangoA
            if(restante >=0.01 && restante <= 472)
                auxRenta= restante;
            //rangoB
            else if (restante >=472.01 && restante <= 895.24)
                auxRenta= (0.1*(restante-472)+17.67);
            //rangoC
            else if(restante >=895.25 && restante <=2038.10)
                auxRenta= (0.2*(restante-895.24)+60);
            //rangoD
            else
                auxRenta= (0.3*(restante-2038.10)+288.57);
             pagoTotal= restante-auxRenta;


        }
        totalRenta += auxRenta;
        totalAFP += auxAFP;
        totalISSS += auxISSS;


        return pagoTotal;
    }
    public String mostrarTotales(){
        return ("Total AFP: "+totalAFP+" Total ISSS: "+totalISSS+" Total Renta: "+totalRenta);
    }
}
