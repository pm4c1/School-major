public static void main(String[] args) throws IOException {
		
		int keycode;
		for(;true;) {
			keycode = System.in.read();
			System.out.println("keycode: " + keycode);
			if(keycode == 113) {
				break;
			}
		}
		System.out.println("종료");
	}
