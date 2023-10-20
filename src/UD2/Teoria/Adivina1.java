/* Pon un enunciado al siguiente programa sin introducirlo en el Eclipse para saber que hace*/
package UD2.Teoria;
import java.util.*;
public class Adivina1 {
	public static void main(String[] args) {
		int suma=0,c=0;
		do {
			c=c+1;
			suma=suma+c;
		}while(suma<1000);
		System.out.println(c);
	}

}
