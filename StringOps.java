public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        String s = "Intro to coMPUter   sCIEnce ";
		//System.out.println(capVowelsLowRest(s));
		//System.out.println(camelCase(s));
		//allIndexOf("Hello world", 'l');
    }

    public static String capVowelsLowRest (String string) {
		String converted = "";
		for (int i = 0; i < string.length(); i++) {
			char x = (string.charAt(i) >= 65 && string.charAt(i) <= 90) ? (char) (string.charAt(i) + 32) : string.charAt(i);
			switch (x) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					x = (char) (x - 32);
			}
		converted += x;
		}
        return converted;
    }

    public static String camelCase (String string) {
        String converted = "";
		for (int i = 0; i < string.length(); i++) {
			boolean newWord = false;
			while (((char) (string.charAt(i)) == ' ') && (i != string.length() - 1)) {
				i++;
				newWord = true;
				if (i >= string.length()) {
					break;
				}
			}
			if (newWord) {
				converted += (string.charAt(i) >= 97 && string.charAt(i) <= 122) ? (char) (string.charAt(i) - 32) : string.charAt(i);
			} else {
				converted += (string.charAt(i) >= 65 && string.charAt(i) <= 90) ? (char) (string.charAt(i) + 32) : string.charAt(i);
			}
		}
        return converted;
    }

    public static int[] allIndexOf (String string, char chr) {
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == chr) {
				count++;
			}
		}
		System.out.println(count);
		int[] array = new int[count];
		int j = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == chr) {
				array[j] = i;
				j++;
			}
		}
        return array;
    }
}

