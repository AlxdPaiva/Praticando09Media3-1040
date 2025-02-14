/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praticando09media3.pkg1040;
import java.util.Scanner;

/**
 *
 * @author alxdr
 */
public class Praticando09Media31040 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner (System.in);
        
        float N1 = teclado.nextFloat();
        float N2 = teclado.nextFloat();
        float N3 = teclado.nextFloat();
        float N4 = teclado.nextFloat();
        
        float media = (N1*2+N2*3+N3*4+N4*1)/(2+3+4+1);
        
        System.out.println(String.format("Media: %.1f", media));
        
        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");
            float exame = teclado.nextFloat();
            System.out.println(String.format("Nota do exame: %.1f", exame));
            float mfinal = (exame+media)/2;
            if (mfinal >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.println(String.format("Media final: %.1f", mfinal));
        }                
    }
    
}
