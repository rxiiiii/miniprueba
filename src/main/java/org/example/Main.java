package org.example;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;


// Un colegio quiere administrar a sus estudiantes y despues le gustaria que se mostraran todos y si ella busca uno le gustaria que salgan !

 class Main {
    static void main() {
        ArrayList<String>nombres = new ArrayList<String>();
        Scanner agregarNombre = new Scanner(System.in);
        Scanner buscarNombre = new Scanner(System.in);
        Scanner borrarNombre = new Scanner(System.in);
        Scanner salir = new Scanner(System.in);
        Scanner op = new Scanner(System.in);

        while(true){
            System.out.println("Agregue un Alumno ! ");
            System.out.println("");
            System.out.println("");
            System.out.println("Eliga una opcion : ");
            System.out.println("1-agregar Alumno : ");
            System.out.println("2-Ver Alumnos Agregados ");
            System.out.println("3-borrar Alumnos");
            System.out.println("4-Salir del Gestor De alumnos ! ");
            System.out.println("");
            System.out.println("");
            int opciones = op.nextInt();
            boolean alumno = false;
            switch (opciones){
                case 1:
                    while(true){
                        boolean punto = false;
                        boolean valor = false;
                        boolean numero = false;


                        System.out.println("Agregue el nombre del alumno ! ");
                        System.out.println("");
                        String alumno1 = agregarNombre.nextLine();

                        if(alumno1.contains(".")){
                            System.out.println("No debe de contener punto");
                            punto = true;
                        }else if(alumno1.isBlank() || alumno1 == null){
                            System.out.println("Error: no debe ser un valor nulo ");
                            valor = true;
                        }else{
                            System.out.println("Se agrego Correctamente El Alumno ! ");
                            nombres.add(alumno1);
                            alumno = true;
                            System.out.println("");
                            System.out.println("Quiere agregar Mas Alumnos ? 1/2");
                            int salirse = salir.nextInt();
                            if(salirse == 1) {
                                System.out.println("Se salio ");
                                break;
                            }

                        }




                    } case 2:
                        if(alumno == false){
                            System.out.println("Error: tienes que tener agregado a un estudiante");

                        }
                        while(alumno == true){
                            System.out.println("Ponga el nombre para ver el alumno ! ");
                            System.out.println("");
                            String alumnoBuscar = buscarNombre.nextLine();
                            for(String buscar : nombres){
                                System.out.println(buscar);
                            }

                        }

            }
















        }

    }
}
