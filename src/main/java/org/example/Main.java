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


        for(int i = 0; i < 2 ; ++i){
            System.out.println("Agregue al Alumno");
            String agregarName = agregarNombre.nextLine();
            nombres.add(agregarName);
        }

        while(true){
            System.out.println("ponga el nombre del alumno a buscar ! ");
            String buscarName = buscarNombre.nextLine();
            for(String buscador2: nombres){
                if(buscarName.equals(buscador2)){
                    System.out.println("Su alumno : " +buscarName + " fue encontrado Correctamente");
                    break;
                }else if(!buscarName.equals(buscador2)){
                    System.out.println("Alumno No registrado ! ");
                }
            }
                break;
        }

        System.out.println("ponga el nombre del alumno que quiera borrar ! ");
        System.out.println("");
        String borrarAlumno = borrarNombre.nextLine();
        for (String almB : nombres){
            if(borrarAlumno.equals(almB)){
                nombres.remove(borrarAlumno);
                System.out.println("Se borro correctamente el Alumno :  " +borrarAlumno);
            }else{
                System.out.println("Alumno No encontrado ");
            }

        }






    }
















 }


