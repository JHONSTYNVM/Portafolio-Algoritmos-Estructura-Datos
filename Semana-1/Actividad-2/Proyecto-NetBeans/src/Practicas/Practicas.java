package Practicas;

import java.util.Scanner;

public class Practicas {

static int[] notas;
static int cantidad = 0;

static Scanner teclado = new Scanner(System.in);

// Constructor
public Practicas() {
}
// CREAR EL ARREGLO DE NOTAS

public void crearPracticas(int numeroPracticas) {

notas = new int[numeroPracticas];
cantidad = numeroPracticas;

System.out.println("Registro de practicas creado");
 }
// INGRESAR Y VALIDAR LAS NOTAS

 public void ingresarNotas() {
 if (notas == null) {

 System.out.println("Primero debe crear el registro de practicas");
   
 return;
}

int nota;
for (int i = 0; i < cantidad; i++) {
do {

System.out.print("Ingrese nota de la practica "
+ (i + 1) + ": ");
nota = teclado.nextInt();
// Validar que la nota sea de 0 a 20

if (nota < 0 || nota > 20) {
System.out.println("Nota incorrecta. Ingrese una nota de 0 a 20");
   }

 } while (nota < 0 || nota > 20);

   notas[i] = nota;
        
}

System.out.println("Notas registradas correctamente");
    
}
// MOSTRAR LAS NOTAS INGRESADAS
    
public void mostrarNotas() {

if (notas == null) {
System.out.println("No existen notas registradas");
 return;
}

System.out.println("");
System.out.println("LISTA DE NOTAS");
System.out.println("-------------------");

for (int i = 0; i < cantidad; i++) {

System.out.println("Practica " + (i + 1)
 + ": " + notas[i]);
   }
}
// BUSCAR LA NOTA MAS BAJA
   
public int notaMenor() {

int menor = notas[0];

for (int i = 1; i < cantidad; i++) {

if (notas[i] < menor) {
menor = notas[i];
    
     }
}

return menor;
}

// CALCULAR EL PROMEDIO
// ELIMINANDO LA NOTA MAS BAJA

public void calcularPromedio() {

if (notas == null) {
System.out.println("No existen notas registradas");
return;
}

if (cantidad < 2) {
System.out.println("Se necesitan minimo 2 practicas");
return;
}

int suma = 0;
int menor = notaMenor();
// Sumar todas las notas
for (int i = 0; i < cantidad; i++) {
suma = suma + notas[i];
}

// Restar una vez la nota mas baja
suma = suma - menor;

// Calcular promedio sin la nota mas baja
double promedio = (double) suma / (cantidad - 1);

// Redondear el promedio
long promedioRedondeado = Math.round(promedio);

System.out.println("");
System.out.println("Nota mas baja eliminada: " + menor);
System.out.println("Promedio: " + promedio);
System.out.println("Promedio redondeado: " + promedioRedondeado);
    }
}