package com.example.eje2;
import java.util.Scanner;
/**
 * realizar un software en java en el cual digiten las
 * notas que obtubieron en cada una de las asignaciones y al final
 * les muestra el resultado del promedio total de la materia en base a los criterios de evaluacion.
 * criterios de evaluacion
 * examen(2)=25%, investigacion(5)=5%, telleres(3)=20%, tareas(5)=20%, proyecto final(1)=30%
 */

public class eje2 {
    public static void main(String[]  args) {
        Scanner scan = new Scanner (System.in);
        double examen1;
        double examen2;
        double examenprom;
        double inv1;
        double inv2;
        double inv3;
        double inv4;
        double inv5;
        double invprom;
        double taller1;
        double taller2;
        double taller3;
        double tallerprom;
        double tarea1;
        double tarea2;
        double tarea3;
        double tarea4;
        double tarea5;
        double tareaprom;
        double proyectof;
        double total;

        System.out.println("introduzca las notasde los examenes");
        examen1 = scan.nextDouble();
        examen2 = scan.nextDouble();
        examenprom = ((examen1 + examen2)/2)*0.25;


        System.out.println("introduzca las notas de las investigaciones");
        inv1 = scan.nextDouble();
        inv2 = scan.nextDouble();
        inv3 = scan.nextDouble();
        inv4 = scan.nextDouble();
        inv5 = scan.nextDouble();
        invprom = ((inv1 + inv2 + inv3 + inv4 + inv5)/5)*0.5;


        System.out.println("introduzca las notas de los talleres");
        taller1 = scan.nextDouble();
        taller2 = scan.nextDouble();
        taller3 = scan.nextDouble();
        tallerprom = ((taller1 + taller2 + taller3)/3)*0.20;


        System.out.println("introduzca las notas de las tareas");
        tarea1 = scan.nextDouble();
        tarea2 = scan.nextDouble();
        tarea3 = scan.nextDouble();
        tarea4 = scan.nextDouble();
        tarea5 = scan.nextDouble();
        tareaprom = ((tarea1 + tarea2 + tarea3 + tarea4 + tarea5)/5)*0.20;


        System.out.println("introduzca la nota del proyecto final");
        proyectof = scan.nextDouble();
        proyectof = proyectof*0.30;

        total = examenprom + invprom + tallerprom + tareaprom + proyectof;
        System.out.println("la nota final de las materia es: " + total );



    }
}
