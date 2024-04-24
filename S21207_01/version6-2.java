public static void main(String[] args) throws IOException {
		
		int keycode;
		
		while(true) {
			System.out.println("keycode?:");
			keycode = System.in.read();
			System.out.println("keycode:"+keycode);
			if(keycode == 113) {
				break;
			}
		}
		System.out.println("end");
	}
