package Aula4MEstruturaWhile;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        int totalAlunos = 2;
        
        Scanner leitorScanner = new Scanner(System.in);
        
        while(totalAlunos > 0){
            
            System.out.println("Digite o nome do aluno:");
            String nomeAluno = leitorScanner.nextLine();
            
            System.out.println("Digite a idade do aluno:");
            int idadeAluno = leitorScanner.nextInt();
            
            System.out.println("O nome do aluno �: " + nomeAluno + 
            " e sua idade �: " + idadeAluno);
            
            totalAlunos = totalAlunos - 1;
        }
    }
}
