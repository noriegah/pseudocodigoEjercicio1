import java.util.*;

public class Practica1 {
    public static void main(String []args){
    Scanner scanner = new Scanner (System.in);
    int N,num;
    int par=0;
    int impar=0;
    int i=0;
    System.out.println("Ingrese un número entero");
    N=scanner.nextInt();
    while (i<N){
        i++;
        num=((int)(Math.random()*100+1));
        if (num % 2==0){
            par+=1;
            System.out.println(num+" Es par");
        }else{
            impar+=1;
            System.out.println(num+" Es Impar");
        }
    }
    System.out.println("Total Pares "+par);
    System.out.println("Total Impar "+impar);
    
}
}