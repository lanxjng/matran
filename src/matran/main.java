/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matran;

/**
 *
 * @author admin
 */
public class main {
    public static void main(String[] args) {
        Matran ob= new Matran();
        Matran ob1=new Matran();
        ob.Input();
        ob.Output();
        ob1.Input();
        ob1.Output();
        System.out.println("Sau khi cong la: ");       
        ob.Congmatran(ob1);
        
        
    }
}
