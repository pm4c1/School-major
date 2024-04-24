public static void main(String[] args) {
		int even = 0;
		int odd = 0;
		
		for(int cnt = 1; cnt < 11; cnt++) {
			if(cnt % 2 == 0) {
				even += cnt;
			}else {
				odd += cnt;
			}
			System.out.println("Cnt:" + cnt + "  Sum:" + (even+odd) + "  Even:" + even + "  Odd:" + odd);
		}
		System.out.println("SUM : " + (even+odd));
	}
