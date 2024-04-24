package S21207_java90;

import java.util.Random;
import java.util.Scanner;

public class S21207_Gugudan_Game {
	public static void main(String[] args) {
        
		int x,y;
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
         
        x = 0;
        
        // args에 값이 있을 때
        if (args.length > 0) 
            x = new Integer(args[0]);
        
        // 값이 없을 때
        else {
            System.out.print("?단을 선택하세요.");
            x = new Integer(sc.nextLine());
        }
        
        y = r.nextInt(1, 10);
        
        int num = x * y;
        
        System.out.print(x + " * " + y + " =  ");
        
        int temp = sc.nextInt();
        
        String result = " ";
        
        if(temp == num){
        	System.out.println("맞았습니다!");
        }else if(num == 3) {
        	System.out.println("삼이네?");
        }else {
        	System.out.println("틀렸습니다. 정답은 " + num + "입니다.");
        }
        System.out.println(result);
        
        sc.close();
    }
}
