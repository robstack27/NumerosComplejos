/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroscomplejos;

/**
 *
 * @author labctr
 */
public class NumerosComplejos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NumeroComplejo num1 =new NumeroComplejo();
        num1.cargar("5+7i");
        System.out.println(num1.mostrar());
    }
    
    
}
