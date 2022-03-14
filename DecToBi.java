//import java.util.Scanner;

import javafx.beans.binding.StringBinding;

public class DecToBi
{   
     public static void main(String[] args) 
    {
        int idade= 20;
        int vetor[] = new int[15];
        int cont=0;

        while(idade >= 2)
        {
            vetor[cont] = idade%2;
            cont++;
            idade = idade/2;

        }
        vetor[cont]= idade;
        for(int indice = cont ; indice >= 0 ; indice--)
        {
            System.out.println(vetor[indice]);
        }
    }
}