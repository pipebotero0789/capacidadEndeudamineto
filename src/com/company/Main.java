package com.company;

import clases.CapacidadEndedudamiento;
import clases.Constant;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    //Recuerda que aca empieza todo
    public static void main(String[] args) {
        //Con este objeto de la clase Scanner puedes capturar informacion por consola cada ves que lo uses
        // recuerda cerrar el flujo de consulta cada ves lo uses sobre para que los uses in.close()
        CapacidadEndedudamiento ce = new CapacidadEndedudamiento();
        Constant constantes = new Constant();
        Scanner in = new Scanner(System.in);
        String entrada = "SI";
        double ingresosMensuales = 0;
        double gastosFijos = 0;
        double gastosVariables = 0;

        while (entrada.equals("SI")) {
            System.out.print(constantes.INDEX);
            while (ingresosMensuales == 0){
                System.out.println("Ingresos mensuales");
                ingresosMensuales = isNumeric(in.nextLine());
            }
            ce.setIngresosTotales((int) ingresosMensuales);
            while (gastosFijos == 0){
                System.out.println("Ingrese sus gastos fijos");
                gastosFijos = isNumeric(in.nextLine());
            }
            ce.setGastosFijos((int) gastosFijos);
            while (gastosVariables == 0){
                System.out.println("Ingrese sus gastos variables");
                gastosVariables = isNumeric(in.nextLine());
            }
            ce.setGastoVaribales((int) gastosVariables);
            ce.Data();
            ce.capacidadEndeudamiento(ce.getIngresosTotales(), ce.getGastosFijos() + ce.getGastoVaribales());
            entrada = opciones(constantes.ERR_NUMBER);
            //Esto te dara la primera entrada al proceso de solicitar los datos para instanciar nuestro objeto
            //Valida las entradas de los usuarios que no vayas a convertir una "A" numero y el calculo no te funcione
            //Utiliza el metodo isNumeric para cada entrada de ser necesarios
        }
        System.out.println(constantes.FINALY);
    }

    public static double isNumeric(String value){
        // implementa un bloque try catch aca
        double bandera;
        try {
            bandera = Double.parseDouble(value);
        }catch (NumberFormatException ex){
            bandera = 0;
            System.out.println("No es valido el dato ingresado");
        }catch (InputMismatchException err){
            bandera = 0;
            System.out.println("No se aceptan letras deben ser numeros");
        }
        return bandera;
    }

    public static String opciones(String msj){
        String opc = "SI";
        String ret = "";
        while (opc == "SI") {
            Scanner in = new Scanner(System.in);
            System.out.println("¿Desaa volver hacer otro calculo?");
            System.out.println("1. SI");
            System.out.println("2. NO");
            try {
                switch (in.nextInt()){
                    case 1:
                        opc = "NO";
                        ret = "SI";
                        break;
                    case 2:
                        opc = "NO";
                        ret = "NO";
                        break;
                }
            }catch (InputMismatchException ex){
                System.out.println("\n");
                System.out.println("-------//------------//----------------//-------");
                System.out.println(msj + ex);
                System.out.println("-------//------------//----------------//-------");
                System.out.println("\n");
            }
        }
        return ret;
    }
}
