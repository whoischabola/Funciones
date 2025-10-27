public class Main {
    static void main() {
        mostrarLibro(" Cien años de soledad ", " Gabriel Garcia Marquez ", + 512);

        System.out.println(duracionMediaCanciones(30, 60, 90));
        System.out.println(tiempoRestanteAlquiler(6, 17));
        calcularImpuestoYDescuento(25, 15, 10);
        calcularVideojuegos(60, 42);
        }
        // Ejercicio 1: Se muestran los datos de un libro: título, autor y número de páginas para
        // mostrarlo posteriormente en la consola.
    static void mostrarLibro(String titulo, String autor, int numpags) {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Numero de paginas: " + numpags);


    }
    // Ejercicio 2: Se muestra la duración de tres canciones diferentes
    // y se hace la duración media de estas.
static double duracionMediaCanciones(int seg1, int seg2, int seg3) {
        return (double) (seg1 + seg2 + seg3) / 3;

}
// Ejercicio 3: Calculamos el tiempo restante de residencia de un alquiler mediante averiguar el número total de días que faltan para que termine el contrato
// y a esto se le restan los días ya transcurridos de residencia.
static int tiempoRestanteAlquiler(int semanasTotales, int diasTranscurridos) {
        int diasTotales = semanasTotales * 7; //Es necesario en este caso transformar las semanas que
    // han pasado a días para facilitar el cálculo
        return Math.max(0, diasTotales - diasTranscurridos); // Con esta función se evitan los resultados en números
    // decimales para poder proporcionar un resultado entero.
}
// Ejercicio 4: Mostrar el precio de un artículo con un impuesto añadido y asimismo un descuento.
    static void calcularImpuestoYDescuento(double precio, int impuesto, int descuento) {
        double precioConImpuesto=  precio + (precio * impuesto / 100) ; // Se añade el impuesto al precio original
        double precioFinal= precioConImpuesto - precioConImpuesto * descuento / 100;
        System.out.println(" Precio original: " + precio + "€");
        System.out.println(" Impuesto " + impuesto + " % ");
        System.out.println(" Con Impuesto " + precioConImpuesto + " € ");
        System.out.println(" Descuento " + descuento + " % ");
        System.out.println(" Con descuento " + precioFinal + " € ");
    }
    // Ejercicio 5:
    // Calcular el porcentaje que representan los videojuegos sobre el total de artículos propuestos.
    static double calcularVideojuegos(int juegos, int totalArtículos) {
        return (double) juegos / totalArtículos * 100;
    }
}
