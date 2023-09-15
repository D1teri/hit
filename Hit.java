import java.util.*;
public class Hit{
    
    public void run(){
        Scanner scan = new Scanner(System.in);
        String[][] grad = {
        {"0","0","8"},
        {"0","5","0"},
        {"0","0","3"},
        };
        
        int i = 0;
        int q = 0;
        boolean win = false;
        boolean turn = false;
        
        while (win == false){
            while(i < 3){
                while(q < 3){
                    System.out.print(grad[i][q] + " ");
                    q++;
                }
                System.out.println("");
                i++;
                q = 0;
            }
            System.out.println("");
            System.out.println("================");
            System.out.println("");
            while(turn == false){
                System.out.println("Red Turn:");
                System.out.println("Text your x coordinate:");
                int x = scan.nextInt();
                System.out.println(x);
                System.out.println("Text your y coordinate:");
                int y = scan.nextInt();
                System.out.println(y); 
                grad[x][y] = "1";
                turn = !turn;
            }
            i = 0;
            System.out.println("");
            System.out.println("================");
            System.out.println("");
        }   
    }
    public static void main (String[] args){
        Hit sp = new Hit();
        sp.run();
    }
}