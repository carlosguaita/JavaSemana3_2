public class Auto {

    String placa;
    String modelo;
    int anio;
    String marca;

    Motor motor;

    Duenio duenio;

    int numRuedas;


    double velocidad(int a){
        double velocidadKmh=0;
        switch (a){
            case 2:
                velocidadKmh= motor.torque()*a*2;
                break;
            case 4:
                velocidadKmh= motor.torque()*a*3;
                break;
            case 6:
                velocidadKmh= motor.torque()*a*5;
                break;
        }
        return velocidadKmh;
    }


}
