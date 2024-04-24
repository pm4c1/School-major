package S21207_java90;

class Data_1{
	int value;  // compile 시 class 파일에 자동 생성
}
class Data_2{
	int value;
	
	// 기본 생성자 없으면 error
	Data_2(int x){ // 매개변수가 있는 생성자
		value = x;
	}
}

public class Ex06_11 {
	public static void main(String[] args) {
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2(0); // compile error발생
	}
}
