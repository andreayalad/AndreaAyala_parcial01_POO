package com.AAAD.x00109319;
import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws SalarioIncorrectoException {
        int opc, meses_Contrato=0, extension = 0;
        double salario=0 ;
        String nombre=" ", puesto=" ";
        ServicioProfesional trabajador =new ServicioProfesional(nombre=" ", puesto=" ", salario=0 , meses_Contrato= 0);
        PlazaFija personal= new PlazaFija(nombre=" ", puesto=" ",salario=0 , extension=0);

        do{
            mainMenu();
            opc= scan.nextInt(); scan.nextLine();
            switch (opc){
                case 1:
                        System.out.println("Nombre: ");
                        nombre= scan.nextLine();
                        System.out.println("Puesto: ");
                        puesto= scan.nextLine();
                        if(puesto.equalsIgnoreCase("Servicio profesional")){
                            System.out.println("Salario: ");
                            salario= scan.nextDouble(); scan.nextLine();
                            if(salario<=0)
                                throw new SalarioIncorrectoException("SALARIO INCORRECTO(no puede ser 0 o menor a 0");
                            System.out.println("Meses de contrato: ");
                            meses_Contrato= scan.nextInt();scan.nextLine();
                        } else{
                            System.out.println("Salario: ");
                            salario= scan.nextDouble();
                            if(salario<=0)
                                throw new SalarioIncorrectoException("SALARIO INCORRECTO(no puede ser 0 o menor a 0");
                            System.out.println("Extension: ");
                            extension= scan.nextInt();

                        }
                case 2:
                    

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
