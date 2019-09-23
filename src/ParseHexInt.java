public class ParseHexInt {

	public static int parseHexInt(String str) {
		if (str == null) {
			throw new IllegalArgumentException("Invalid string");
		}
		if (str.trim().equals("")) {
			return 0;
		}

		int value = 0;
		for(int i = str.length() - 1, j = -1; i >= 0; i--, j++) {
			int ascii = str.charAt(i) - 48;
			int hex = 0;
			if (ascii >= 0 && ascii <= 9) {
				hex = ascii;
			} else if(ascii >= 17 && ascii <= 22) {
				hex = ascii - 7;
			} else if(ascii >= 49 && ascii <= 54) {
				hex = ascii - 39;
			} else {
				throw new IllegalArgumentException("Invalid hexadecimal number");
			}
			if (j < 0) {
				value += hex;
			} else {
				value += hex * 16 << (4 * j);
			}
		}
		return value;
	}

	public static void main(String []args){
		System.out.println(parseHexInt("1F"));
		System.out.println(parseHexInt("A"));
		System.out.println(parseHexInt("0"));
		System.out.println(parseHexInt(""));
	}
}
