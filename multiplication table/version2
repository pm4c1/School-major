import java.util.*;

public static void main(String[] args) {

        int x, y;
        
        Random r = new Random();
        
        if (args.length == 0){
            x = Math.abs(r.nextInt() % 9) + 1;
        }else{
            x = Integer.parseInt(args[0]);
        }
        
        y = Math.abs(r.nextInt() % 9) + 1;
        
        int num = x * y;

        System.out.println();
        
        System.out.println("* 구구단 " + x + "단에 대한 문제입니다");
        System.out.println();
        
        System.out.print(x + " * " + y + " = ");
        
        Scanner sc = new Scanner(System.in);
        
        int result = sc.nextInt();

        if (result == num){
            System.out.println("맞았습니다!");
        }else{
            System.out.println("틀렸습니다. \n정답은\"" + num + "\"입니다.");
        }
        
        sc.close();
    }
