package com.AAAD.x00109319;
import java.util.Scanner;


public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        int opc, meses_Contrato=0, extension=0;
        double salario=0;
        String nombre=" ", puesto=" ";
        ServicioProfesional trabajador =new ServicioProfesional(nombre, puesto, salario, meses_Contrato);
        PlazaFija personal= new PlazaFija(nombre, puesto,salario , extension);

        do{
            mainMenu();
            opc= scan.nextInt(); scan.nextLine();
            switch (opc){
                case 1:
                        System.out.println("Puesto: ");
                        puesto= scan.nextLine();
                        if(puesto.equalsIgnoreCase("Servicio profesional")){
                            trabajador.puesto= "Servicio Profesional";
                            System.out.println("Nombre: ");
                            trabajador.nombre= scan.nextLine();
                            System.out.println("Salario: ");
                            trabajador.salario= scan.nextDouble();
                            System.out.println("Meses de contrato: ");
                            meses_Contrato= scan.nextInt();
                            trabajador.setMeses_Contrato(meses_Contrato);
                            System.out.println(trabajador.toString());
                        } else if(puesto.equalsIgnoreCase("Plaza fija")){
                            personal.puesto="Plaza fija";
                            System.out.println("Nombre: ");
                            personal.nombre= scan.nextLine();
                            System.out.println("Salario: ");
                            personal.salario= scan.nextDouble();
                            System.out.println("Extension: ");
                            extension= scan.nextInt(); scan.nextLine();
                            personal.setExtension(extension);
                            System.out.println(personal.toString());

                        }else{
                            System.out.println("Puesto ingresado INVALIDO.");
                        }
                        break;
                case 2:
                    System.out.println("Sueldo liquido de los empleados: ");
                    System.out.println( "Servicio profesional: ");
                    System.out.println("Plaza fija: "+ personal.getSalario());
                    break;




            }
        }while(opc!=0);
    }
    static void mainMenu(){
        System.out.println("Bienvenido . . . ");
        System.out.println("1. Ingresar empleado");
        System.out.println("2.Ver sueldo liquido");
        System.out.println("0. SALIR");
    }



}
