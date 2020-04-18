package com.AAAD.x00109319;
import java.util.Scanner;


public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        int meses_Contrato=0, extension=0;
        double salario=0;
        String nombre=" ", puesto=" ";
        ServicioProfesional trabajador =new ServicioProfesional(nombre, puesto, salario, meses_Contrato);
        PlazaFija personal= new PlazaFija(nombre, puesto,salario , extension);
                            //SP
                            System.out.println("Servicios profesionales");
                            trabajador.puesto= "Servicios profesionales";
                            System.out.println("Nombre: ");
                            trabajador.nombre= scan.nextLine();
                            System.out.println("Salario: ");
                            trabajador.salario= scan.nextDouble();
                            System.out.println("Meses de contrato: ");
                            meses_Contrato= scan.nextInt(); scan.nextLine();
                            trabajador.setMeses_Contrato(meses_Contrato);
                            System.out.println(trabajador.toString());
                            //PF
                              System.out.println("Plaza fija");
                            personal.puesto="Plaza fija";
                            System.out.println("Nombre: ");
                            personal.nombre= scan.nextLine();
                            System.out.println("Salario: ");
                            personal.salario= scan.nextDouble();
                            System.out.println("Extension: ");
                            extension= scan.nextInt(); scan.nextLine();
                            personal.setExtension(extension);
                            System.out.println(personal.toString());

                    System.out.println("Sueldo liquido de los empleados: ");
                    System.out.println("Servicios profesionales: " + CalculadoraDeImpuestos.calcularPago(trabajador));
                    System.out.println("Plaza fija: "+ CalculadoraDeImpuestos.calcularPago(personal));





    }


}
