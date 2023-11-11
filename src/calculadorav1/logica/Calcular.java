package calculadorav1.logica;

public class Calcular {

    public Double operacion(String operador, String num1, String num2) {

        if (operador.equals("+")) {
            return Double.parseDouble(num1) + Double.parseDouble(num2);
        }
        if (operador.equals("-")) {
            return Double.parseDouble(num1) - Double.parseDouble(num2);
        }
        if (operador.equals("x")) {
            return Double.parseDouble(num1) * Double.parseDouble(num2);
        }
        if (operador.equals("/")) {
            return Double.parseDouble(num1) / Double.parseDouble(num2);
        }
        return 0.0;
    }

    public String validacionCero(Double total) {

        String cad = String.valueOf(total);
        String cad2 = "";

        if (cad.endsWith(".0")) {
            cad2 = cad.replace(".0", "");
            return cad2;
        }
        return cad;

    }
    
    public Double elevarAlCuadrado(String num){
        double num1 = Double.parseDouble(num);
        return Math.pow(num1, 2);
    }
    
    public Double raizCuadrada(String num){
        double num1 = Double.parseDouble(num);
        return Math.sqrt(num1);
    }
}
