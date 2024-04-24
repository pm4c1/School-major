public static void main(String[] args) {
        System.out.print("구구단을 몇단까지 할까요? : ");
        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();
        
        sc.close();
        
        for (int i = 2; i <= Num; i++) {
            System.out.println(i + "단 입니다.");
            for (int j = 1; j < 10; j++) {
                System.out.println(i + "*" + j + " = " + (i * j));
            }
            System.out.println("============");
        }
    }
