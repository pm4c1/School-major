public static void main(String[] args) {
		String name = "홍길동";
		String schoolNum = "21200";
		
		int kor = 98;
		int eng = 91;
		int mat = 100;
		// int total = kor + eng + mat;
		// double ave = total / 3.;
		
		System.out.println(" 성명  학번     국어  영어  수학  총점  평균");
		System.out.println("-------------------------------------");
		System.out.printf("%s %-6s %4d %4d %4d %4d %5.1f \n", 
				name, schoolNum, kor, eng, mat,(kor+eng+mat), (double)(kor+eng+mat)/3);
		name = "차이점";
		schoolNum = "21299";
		kor = 100;
		eng = 99;
		mat = 96;
		System.out.printf("%s %6s %-4d %4d %-4d %-4d %-5.1f \n", 
				name, schoolNum, kor, eng, mat,(kor+eng+mat), (double)(kor+eng+mat)/3);
	}
