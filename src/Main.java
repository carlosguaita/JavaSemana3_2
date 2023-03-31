import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Duenio duenio = new Duenio("Carlos","1715607071");
        Motor motor = new Motor("WXZ123456",1.6,"diesel");
        Auto auto = new Auto("PDE1234","Corolla", "Toyota", motor, duenio, 4);

        auto.imprimirAttr();
        System.out.println("*******************************************************");

        Duenio duenio1 = new Duenio("Juan","0987456321");
        Motor motor1 = new Motor("XTRAS1234");
        Auto auto1 = new Auto(motor1,duenio1);

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la marca del auto: ");
        String marca = sc.next();

        System.out.println("Ingrese la placa del auto: ");
        String placa = sc.next();

        System.out.println("Ingrese la año del auto: ");
        int anio = sc.nextInt();

        System.out.println("Ingrese la modelo del auto: ");
        String modelo = sc.next();

        System.out.println("Ingrese el combustible del auto: ");
        String combustible = sc.next();

        System.out.println("Ingrese el cilindraje del auto: ");
        double cilindraje = sc.nextDouble();


        auto1.setMarca(marca);
        auto1.setPlaca(placa);
        auto1.setAnio(anio);
        auto1.setModelo(modelo);
        auto1.getMotor().setTipoCombustible(combustible);
        auto1.getMotor().setCilindraje(cilindraje);
        auto1.imprimirAttr();


    }
}