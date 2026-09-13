package AplicaArreglos;

import Arreglo.Arreglo;
import java.util.Scanner;

public class AplicaArreglo {

static Arreglo objArreglo = new Arreglo();
static Scanner teclado = new Scanner(System.in);

public static void main(String[] args) {
menu();
}

static void menu() {
int opcion; int tam; int x; int y; int nuevo;

do {

System.out.println("");
System.out.println("MENU DE OPCIONES");
System.out.println("------------------------------");
System.out.println("1.- Crear el Arreglo");
System.out.println("2.- Ingresar Datos");
System.out.println("3.- Mostrar Datos");
System.out.println("4.- Suma de Pares");
System.out.println("5.- Eliminar un Elemento");
System.out.println("6.- Modificar un Elemento");
System.out.println("7.- Insertar un Elemento");
System.out.println("8.- Sumar todos los Elementos");
System.out.println("9.- Menor, Mayor y Promedio");
System.out.println("10.- Suma de Impares");
System.out.println("11.- Primer Elemento al Final");
System.out.println("12.- Primer Elemento Par al Final");
System.out.println("--------------------------------");
System.out.println("0.- Salir");
System.out.println("------------------------------------");

System.out.print("Ingrese una alternativa: ");
opcion = teclado.nextInt();

System.out.println("");

//OPCION 1 - CREAR ARREGLO
if (opcion == 1) {

System.out.print("Ingrese tamano del Arreglo: ");
tam = teclado.nextInt();

objArreglo.creaArreglo(tam);

System.out.println("Arreglo creado correctamente");
}

// OPCION 2 - INGRESAR DATOS
if (opcion == 2) {

objArreglo.lectura();
  }

// OPCION 3 - MOSTRAR DATOS
            
if (opcion == 3) {

objArreglo.escritura();
  }

// OPCION 4 - SUMA DE PARES
            
if (opcion == 4) {

objArreglo.sumaPares();
  }

// ACTIVIDAD 1 - PUNTO 1
// OPCION 5 - ELIMINAR ELEMENTO
            
if (opcion == 5) {

System.out.print("Ingrese elemento a eliminar: ");
x = teclado.nextInt();

objArreglo.eliminarElemento(x);
  }

// ACTIVIDAD 1 - PUNTO 2
// OPCION 6 - MODIFICAR ELEMENTO

if (opcion == 6) {

System.out.print("Ingrese elemento a modificar: ");
x = teclado.nextInt();

System.out.print("Ingrese nuevo valor: ");
nuevo = teclado.nextInt();

objArreglo.modificarElemento(x, nuevo);
  }
  
// ACTIVIDAD 1 - PUNTO 3
// OPCION 7 - INSERTAR ELEMENTO
            
if (opcion == 7) {

System.out.print("Ingrese elemento a insertar: ");
x = teclado.nextInt();

System.out.print("Ingrese posicion: ");
y = teclado.nextInt();

objArreglo.insertarElemento(x, y);
}

// ACTIVIDAD 1 - PUNTO 4
// OPCION 8 - SUMAR ELEMENTOS
            
if (opcion == 8) {

objArreglo.sumaElementos();
   }

// ACTIVIDAD 1 - PUNTO 5
// OPCION 9 - MENOR, MAYOR Y PROMEDIO
            
if (opcion == 9) {

objArreglo.menorMayorPromedio();
   }

// ACTIVIDAD 1 - PUNTO 6
// OPCION 10 - SUMA DE IMPARES
           
if (opcion == 10) {

objArreglo.sumaImpares();
   }

// ACTIVIDAD 1 - PUNTO 7
// OPCION 11 - PRIMER ELEMENTO AL FINAL
            
if (opcion == 11) {

objArreglo.primerElementoAlFinal();
   }

// ACTIVIDAD 1 - PUNTO 8
// OPCION 12 - PRIMER PAR AL FINAL
           
if (opcion == 12) {

 objArreglo.primerParAlFinal();
    }
// OPCION 0 - SALIR
           
if (opcion == 0) {

System.out.println("SALIENDO DEL PROGRAMA");
 }
        } while (opcion != 0);
    }
}
