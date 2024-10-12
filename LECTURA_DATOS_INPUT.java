import java.text.DecimalFormat;
import java.util.Scanner;

class Scratch {

    static double convertidorEuroPeseta(double euros){
        final double valorPeseta =166.386;
        return euros*valorPeseta;
    }

    static  double convertidorPesetasEuro(double euros){
        final double valorPeseta =166.386;
        return euros/valorPeseta;
    }

    public static void main(String[] args) {
        /*
         Escribe un programa que calcule el total de una factura a partir de la base
imponible.
         */
        Scanner s = new Scanner(System.in);
        //Definir los decimales que va a tener mi float o double
        DecimalFormat formatoDecimales = new DecimalFormat("#.00");

        //Ejercicio-1 & 4-Suma-Resta-Multiplicación-División
        System.out.println("Ingrese dos números para realizar las operaciones");
        int numero1 = Integer.parseInt(String.valueOf(s.nextInt()));
        int numero2 = Integer.parseInt(String.valueOf(s.nextInt()));
        System.out.println("Su multiplicacion: "+(numero1*numero2)+" Su división es:"+(numero1/numero2)+" Su resta es:"+(numero1-numero2)+" Su suma es:"+(numero1+numero2));

        //Ejercicio2-Euros a peseta
        System.out.println("Ingres los euros que quieres convertir a pesetas:");
        double  euros = s.nextDouble();
        System.out.println("Resultado: "+formatoDecimales.format(convertidorEuroPeseta(euros)));


        //Ejercico-3-Peseta a euros
        System.out.println("Ingres las pesetas que quieres convertir a euros:");
        double  pesetas = s.nextDouble();
        System.out.println("Resultado: "+formatoDecimales.format(convertidorPesetasEuro(pesetas)));

        //Ejercicio-5-Area rectángulo
        System.out.println("Ingrese el ancho y alto del rectangulo sin decimales:");
        int ancho = s.nextInt();
        int alto = s.nextInt();
        System.out.println("Resultado: "+(ancho*alto));

        //Ejercicio-6-Área de un triangulo
        System.out.println("Ingrese el ancho y alto del trangulo sin decimales:");
        int anchoTriangulo = s.nextInt();
        int altoTriangulo = s.nextInt();
        System.out.println("Resultado: "+(anchoTriangulo * altoTriangulo)/2);

        //Ejercicio-7-Factura
        System.out.println("Ingrese la cantidad para generar una factura:");
        float cobroTrabajo1 = s.nextFloat();
        final float iva = 1.21F;
        System.out.println("Resultado de factura: "+formatoDecimales.format(cobroTrabajo1/iva));

    }
}