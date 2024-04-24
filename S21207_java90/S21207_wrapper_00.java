package S21207_java90;

public class S21207_wrapper_00 {
	public static void main(String[] args) {
		int i1 = 126;
		int i2 = 126;
		
		System.out.println("--기본 타입 int--------------------");
		System.out.println("기본 값 i1: " + i1 + " HashCode: " + System.identityHashCode(i1));
		System.out.println("기본 값 i2: " + i2 + " HashCode: " + System.identityHashCode(i2));
		
		Integer is1 = new Integer(126);
		Integer is2 = new Integer(126);
		System.out.println("--기본 박싱 Integer----------------");
		System.out.println("is1: " + is1 + " HashCode: " + System.identityHashCode(is1));
		System.out.println("is2: " + is2 + " HashCode: " + System.identityHashCode(is2));
		is2 = is2 + is1;
		System.out.println("+is2: " + is2 + " HashCode: " + System.identityHashCode(is2));
		
		is2 = new Integer(126);
		int si1 = is1.intValue();
		int si2 = is1.intValue();
		System.out.println("--기본 언박싱 Integer---------------");
		System.out.println(" si1: " + si1 + " HashCode: " + System.identityHashCode(si1));
		System.out.println(" si2: " + si2 + " HashCode: " + System.identityHashCode(si2));
		
		si2 = si2 + si1;
		System.out.println("+si2: " + si2 + " HashCode: " + System.identityHashCode(si2));
	}
}

