import java.util.Scanner;

public class Ex03 {
    private static String[] intevalo;
    
    public static void main(String[] args) {
    
    int[] notas = new int[20];
    int [] intervalo = new int[5]; 
    int alunos = 1;
    Scanner ler = new Scanner(System.in);
    
    for (int i=0;i<notas.length;i++){
        System.out.println("Aluno:"+alunos+" Informe a sua nota de 1 a 5 "
                + "(sendo 1 ruim e 5 excelente): ");
        notas[i] = ler.nextInt();
        alunos++;
    }
    
    for (int i = 0; i < notas.length; i++) {
          for(int j=0;j<intervalo.length;j++)  {
              if (notas[i]==1){
                intervalo[j]++;
            }
              if (notas[i]==2){
                intervalo[j]++;
            }
              if (notas[i]==3){
                intervalo[j]++;
            }
              if (notas[i]==4){
                intervalo[j]++;
            }
              if (notas[i]==5){
                intervalo[j]++;
            }
          } 
    }
     
    for (int i=0;i<intervalo.length;i++){
       int j=1;
        System.out.println("quantidade de notas"+j+":"+intervalo[i]);
        j++;
    }
    
    } 
    
}
