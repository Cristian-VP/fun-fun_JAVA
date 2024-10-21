public class CONDICIONALES_IF_SWITCH {
    public static void main(String[] args) {
        //Ejercicio 1-asignatura/dia
        //Escribe un programa que pida por teclado un día de la semana y que diga qué
        //asignatura toca a primera hora ese día.
        Scanner dia = new Scanner(System.in);
        System.out.println("Ingrese el día de la semana que desea consultar");
        String diaEscolar = dia.nextString();
        switch (diaEscolar) {
            case "lunes":
                System.out.println("Tienes Mates");
                break;
                case "martes":
                    System.out.println("Tienes Lengua");
                    break;
                    case "miercoles":
                        System.out.println("Tienes Inglés");
                        break;
                        case "jueves":
                            System.out.println("Tienes Filosofía");
                            break;
                            case "viernes":
                                System.out.println("Tienes Frances");
                                break;
            default:
                System.out.println("El día intorducido no es escolar");

        }
    }
}