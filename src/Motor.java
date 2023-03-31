public class Motor {

    String serie;
    double cilindraje;
    String tipoCombustible;

    public Motor(){

    }

    public Motor(String serie, double cilindraje, String tipoCombustible) {
        this.serie = serie;
        this.cilindraje = cilindraje;
        this.tipoCombustible = tipoCombustible;
    }


    double torque(){
        double torqueNm=0;
        if(tipoCombustible.equals("gasolina")){
            torqueNm=cilindraje*2;
        }else if (tipoCombustible.equals("diesel")){
            torqueNm=cilindraje*4;
        }
        return torqueNm;
    }


}
