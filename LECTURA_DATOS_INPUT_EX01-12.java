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

    static int conversorMbKb(int numero ){
        return numero * 1024;
    }
    static int conversorKbMb(int numero ){
        return numero / 1024;
    }

    public static void main(String[] args) {
        /*
         Escribe un programa que calcule el salario semanal de un empleado en base a
las horas trabajadas, a razón de 12 euros la hora.
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

        System.out.println("Ingrese la cantidad de horas trabajadas:");
        final float precioHora = 12;
        float horasTrabajadas = s.nextFloat();
        System.out.printf("Tu salario a 12 €/h es: %.2f €\n", precioHora*horasTrabajadas );

        //Ejercicio-9-Volumen cono
        System.out.println("Ingrese la altura y radio del cono par calcular su volumen:");
        float altura = s.nextFloat();
        float radio = s.nextFloat();
        double pi = Math.PI;
        float  tercio = (float) 1/3;
        System.out.printf("El volumen del cono es: %.2f\n",tercio*(pi*(Math.pow(radio,2)*altura)));

        //Ejercicio-10 & 11-Mb a Kb
        System.out.println("Introduce primero los Mb a convertir a Kb, posteriormente los kb a convertir a Mb: ");
        int mb = s.nextInt();
        int kb = s.nextInt();
        System.out.printf("Tienes kb:%d \n",conversorMbKb(mb));
        System.out.printf("Tienes Mb:%d \n",conversorKbMb(kb));

        //Ejercicio 12

        System.out.print("Cual fue tu nota del primer examen");
        float notaUno = s.nextFloat();
        System.out.print("Que media quieres obtener");
        float media = s.nextFloat();
        double notaDos = (media-(notaUno*0.4))/0.6;
        System.out.printf("Tienes que sacar %.2f para alcanzar tu media", notaDos);

    }
}