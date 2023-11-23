package numeroscomplejos;

public class NumeroComplejo {
    private double real;
    private double imaginario;

    public void cargar(String numero) {
        // Separar la cadena en partes real e imaginaria
        String[] partes = numero.split("\\+");
        this.real = Double.parseDouble(partes[0]);
        this.imaginario = Double.parseDouble(partes[1].replace("i", ""));
    }

    public String mostrar() {
        // Formatear la salida
        return String.format("%.2f + %.2fi", this.real, this.imaginario);
    }

    public NumeroComplejo suma(NumeroComplejo num) {
        NumeroComplejo resultado = new NumeroComplejo();
        resultado.real = this.real + num.real;
        resultado.imaginario = this.imaginario + num.imaginario;
        return resultado;
    }

    public NumeroComplejo resta(NumeroComplejo num) {
        NumeroComplejo resultado = new NumeroComplejo();
        resultado.real = this.real - num.real;
        resultado.imaginario = this.imaginario - num.imaginario;
        return resultado;
    }

    public static void main(String[] args) {
        NumeroComplejo num1 = new NumeroComplejo();
        num1.cargar("7+4i");

        NumeroComplejo num2 = new NumeroComplejo();
        num2.cargar("120+50i");

        System.out.println("Número 1: " + num1.mostrar());
        System.out.println("Número 2: " + num2.mostrar());

        NumeroComplejo suma = num1.suma(num2);
        System.out.println("Suma: " + suma.mostrar());

        NumeroComplejo resta = num1.resta(num2);
        System.out.println("Resta: " + resta.mostrar());
    }
}
