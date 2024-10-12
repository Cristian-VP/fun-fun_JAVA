class Scratch {
    static double convertidorPesetasEuro(double euros){
        double valorPeseta =166.386;
        return euros*valorPeseta;
    }

    public static void main(String[] args) {
        /*
         Ejercicos de 1 - 8
         */

        int x;
        int y;
        x = 144;
        y = 999;
        String nombre;
        nombre = "Esto es un string con mi nombre. Cris";
        double dineroEuros = 10;
        char cChar = 'c';
        String myString = "Letra c";
        char aChar = 'a';
        char bChar = 'b';
        char cChar2 = 'c';
        char dChar = 'd';
        char eChar = 'e';

        //Hay que añadir un string vacío antes de la cadena de concatenación
        String concatChar = ""+aChar+bChar+cChar2+dChar+eChar;

        System.out.println("Esto es una concatenación de carácteres char:"+concatChar);
        System.out.printf("Voy a intentar mostrar en terminal una variable char:%s y una variable String:%s\n", cChar, myString);
        System.out.printf("%s euros en pesetas son: %8.3f\n", "Diez", convertidorPesetasEuro(dineroEuros));
        System.out.printf("Suma: %d ; Resta: %d ; Multiplicación: %d ; División: %d", x+y, y-x,x*y, y/x );
        System.out.printf("%-5s World!\n", "Hello");
        System.out.printf("%-4s %4s I have %d years ols\n", "I Am", "Tian", 15);
        System.out.printf("My phone number: %d \uD83D\uDE18\n", 5489745);
        System.out.printf("\uD83C\uDF77 My adress %4s number %d", "tree \uD83C\uDF77", 4);
    }
}