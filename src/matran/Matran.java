/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matran;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Matran {

    private int m,n;
    
    private int a[][] ;
    public int getm(){
        return m;
    }
    public int getn(){
        return n;
    }
    
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so hang: ");
        m = sc.nextInt();
        System.out.println("Nhap so cot: ");
        n = sc.nextInt();
        a= new int[m][n];
        System.out.println("---Nhap vao ma tran ---");
        for(int i=0; i<m; i++){
            for(int j=0;j<n;j++){
                System.out.println("a["+(i)+"]["+(j)+"]");
                a[i][j]= sc.nextInt();
            }
        }
              
    }
    public void Output(){
        for(int i=0; i<m; i++){
            for(int j=0;j<n;j++)
                System.out.print(a[i][j]+"  ");
            
            System.out.print("\n");
            }
        
    }
    public void Congmatran(Matran ob){
        
        int c[][]=new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0;j<n;j++){  
                c[i][j] = this.a[i][j]+ ob.a[i][j];
                
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0;j<n;j++)
                System.out.print(c[i][j]+"  ");
            
            System.out.print("\n");
            }
      
        
    }
    
}
