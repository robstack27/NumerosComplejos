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
public class NumeroComplejo {
    private int real=0;
    private Integer img=0;
    public void cargar(String numero) {
        int r=5,i=7;
       
        this.real=r;
        this.img=i;
    }
    public String mostrar(){
        
        return (this.real+""+this.img.toString()+"i");
    }
    public String suma(NumeroComplejo num){
        
        
        return "";
    }
}
