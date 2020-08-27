public class Ex04 {
    public static void main(String[] args) {
        
        String crecente = "";
        int decrecente=1;
        
      
        System.out.println("(A)");   
        for(int i=0;i<10;i++){
            crecente +="* ";          
            System.out.println(crecente);
        }
        
        System.out.println("(B)");
        
        for (int i=11;i>0;i--){
            while (decrecente<i){
            System.out.print("* ");
            decrecente++;                
            }
            
            System.out.println();
            decrecente=1;
        }
        
        System.out.println("(C)");
        crecente = "";
        for(int i=0;i<10;i++){
            crecente +=" *";           
            System.out.println(crecente);
        } 
       
        System.out.println("(D)");
        decrecente = 1;
        for (int i=11;i>0;i--){
            while (decrecente<i){
            System.out.print("* ");
            decrecente++;          
            }
            
            System.out.println();
            decrecente=1;
        }
        
        
        
    }
    
}