package Arreglo;

import java.util.Scanner;

public class Arreglo {

static int[] numerito;
static int tope = 0;

static Scanner teclado = new Scanner(System.in);

// Constructor
public Arreglo() {

}

// Crear el arreglo
public void creaArreglo(int valor) {
numerito = new int[valor];
tope = 0;
    }

// Ingresar datos al arreglo
public void lectura() {

if (numerito == null) {
System.out.println("Primero debe crear el arreglo");
return;
}

if (tope < numerito.length) {
numerito[tope] = getNumero();
tope++;
  } 
else {
  
System.out.println("El arreglo esta lleno");

        }
    }

// Pedir un numero
public int getNumero() {

int valor;

System.out.print("Ingrese un Numero: ");
valor = teclado.nextInt();
return valor;
}

// Mostrar los elementos
 
public void escritura() {

  System.out.println("\tLISTADO");
  System.out.println("\t---------");

   if (tope > 0) {

   for (int i = 0; i < tope; i++) {
   System.out.print(numerito[i] + "\t");
   }

  } else {
  System.out.println("No existen elementos");
   }

  System.out.println("\n");
    }

    // Sumar numeros pares
    public void sumaPares() {

    int suma = 0;

   for (int i = 0; i < tope; i++) {

   if (numerito[i] % 2 == 0) {
       
   suma = suma + numerito[i];
            }
        }

   System.out.println("La suma de Pares es: " + suma);
   
    }

    // ACTIVIDAD 1 - PUNTO 1
    // Eliminar un elemento "x"
    
    public void eliminarElemento(int x) {

   for (int i = 0; i < tope; i++) {

    if (numerito[i] == x) {

    // Mover elementos hacia la izquierda
    for (int j = i; j < tope - 1; j++) {
    numerito[j] = numerito[j + 1];
    }

    tope--;

    System.out.println("Elemento eliminado");
    return;
       }
   }

   System.out.println("Elemento no encontrado");
    }
    // ACTIVIDAD 1 - PUNTO 2
    // Modificar un elemento "x"
    
    public void modificarElemento(int x, int nuevo) {

    for (int i = 0; i < tope; i++) {

    if (numerito[i] == x) {

    numerito[i] = nuevo;

    System.out.println("Elemento modificado");
    return;
       }
   }

    System.out.println("Elemento no encontrado");
    }

    // ACTIVIDAD 1 - PUNTO 3
    // Insertar un elemento "x"
    // en una posicion "y"

    public void insertarElemento(int x, int y) {

    if (y < 1 || y > tope + 1) {
    System.out.println("Posicion incorrecta");
    return;
   }

  // Crear un nuevo arreglo con un espacio mas
   int[] nuevoArreglo = new int[numerito.length + 1];

  // Copiar los elementos anteriores
   for (int i = 0; i < y - 1; i++) {
    nuevoArreglo[i] = numerito[i];
   }

   // Insertar el nuevo elemento
    nuevoArreglo[y - 1] = x;

   // Copiar los elementos restantes
    for (int i = y - 1; i < tope; i++) {
    nuevoArreglo[i + 1] = numerito[i];
   }

   numerito = nuevoArreglo;
   tope++;

    System.out.println("Elemento insertado");
    }

    // ACTIVIDAD 1 - PUNTO 4
    // Sumar todos los elementos del arreglo
    
  public void sumaElementos() {

   int suma = 0;

   for (int i = 0; i < tope; i++) {
   suma = suma + numerito[i];
   }

  System.out.println("La suma de los elementos es: " + suma);
    }
    
    // ACTIVIDAD 1 - PUNTO 5
    // Hallar numero menor, mayor y promedio

   public void menorMayorPromedio() {

   if (tope == 0) {
   System.out.println("No existen elementos");
   return;
    }
int menor = numerito[0];
int mayor = numerito[0];
int suma = 0;

for (int i = 0; i < tope; i++) {

if (numerito[i] < menor) {
menor = numerito[i];
  }

 if (numerito[i] > mayor) {
  mayor = numerito[i];
   }

  suma = suma + numerito[i];
  }

   double promedio = (double) suma / tope;

   System.out.println("Numero menor: " + menor);
   System.out.println("Numero mayor: " + mayor);
   System.out.println("Promedio: " + promedio);
    
   }

    // ACTIVIDAD 1 - PUNTO 6
    // Sumar los elementos impares

    public void sumaImpares() {

    int suma = 0;

    for (int i = 0; i < tope; i++) {

    if (numerito[i] % 2 != 0) {
    suma = suma + numerito[i];
     }
   }

    System.out.println("La suma de Impares es: " + suma);
    }

    // ACTIVIDAD 1 - PUNTO 7
    // Mover el primer elemento
    // a la ultima posicion
    
    public void primerElementoAlFinal() {

   if (tope == 0) {
   System.out.println("No existen elementos");
   return;
   }

   int aux = numerito[0];

   // Mover los elementos hacia la izquierda
   for (int i = 0; i < tope - 1; i++) {
    numerito[i] = numerito[i + 1];
   }

   numerito[tope - 1] = aux;
   System.out.println("Primer elemento movido al final");
    }

    // ACTIVIDAD 1 - PUNTO 8
    // Mover el primer elemento par
    // al final del arreglo
    
    public void primerParAlFinal() {

   for (int i = 0; i < tope; i++) {

    // Encontrar el primer numero par
    if (numerito[i] % 2 == 0) {

    int aux = numerito[i];

    // Mover los elementos hacia la izquierda
    for (int j = i; j < tope - 1; j++) {
    numerito[j] = numerito[j + 1];
    }

    numerito[tope - 1] = aux;

    System.out.println("Primer elemento par movido al final");
    return;
       }
   }

    System.out.println("No existen numeros pares");
    }
}