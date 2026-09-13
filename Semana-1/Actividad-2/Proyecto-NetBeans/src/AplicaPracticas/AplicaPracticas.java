package AplicaPracticas;

import Practicas.Practicas;
import java.util.Scanner;

public class AplicaPracticas {

static Practicas objPracticas = new Practicas();
static Scanner teclado = new Scanner(System.in);

public static void main(String[] args) {

menu();
}

static void menu() {
int opcion;
int numeroPracticas;

do {

System.out.println("");
System.out.println("MENU DE OPCIONES");
System.out.println("-------------------------------");
System.out.println("1.- Crear registro de practicas");
System.out.println("2.- Ingresar notas");
System.out.println("3.- Mostrar notas");
System.out.println("4.- Calcular promedio");
System.out.println("0.- Salir");
System.out.println("-----------------------");

System.out.print("Ingrese una alternativa: ");
opcion = teclado.nextInt();

System.out.println("");

// OPCION 1
// CREAR REGISTRO DE PRACTICAS
 
if (opcion == 1) {
do {
System.out.print("Ingrese cantidad de practicas: ");
numeroPracticas = teclado.nextInt();

// Validar minimo 2 practicas
if (numeroPracticas < 2) {
System.out.println("Debe ingresar minimo 2 practicas");
 }

} while (numeroPracticas < 2);
objPracticas.crearPracticas(numeroPracticas);
 }
// OPCION 2
// INGRESAR LAS NOTAS

if (opcion == 2) {
objPracticas.ingresarNotas();
 }
// OPCION 3
// MOSTRAR LAS NOTAS

if (opcion == 3) {
objPracticas.mostrarNotas();
 }

// OPCION 4
// CALCULAR EL PROMEDIO
            
if (opcion == 4) {
objPracticas.calcularPromedio();
 }

// OPCION 0
// SALIR

if (opcion == 0) {
System.out.println("SALIENDO DEL PROGRAMA");
}
} while (opcion != 0);
   }
}