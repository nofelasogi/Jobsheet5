/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author 
 */
public class TryCatchFinally {
    public static void main(String[]args){
        System.out.println("Mulai");
        
        int x = 5;
        
        try{
            x=x/0;
        }
        catch(Exception a){
            a.printStackTrace();
            
        }
        finally{
            System.out.println("ArithmeticException");
            System.out.println(x);
            System.out.println("Selesai");
        }
    }
    
}
