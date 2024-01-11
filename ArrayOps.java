public class ArrayOps {
    public static void main(String[] args) {
		int[] a1 = {1, 1, 500};
		int[] a2 = {1, 3, -4, 5};
		
		//System.out.println(findMissingInt(a));
		//System.out.println(secondMaxValue(a)); 
		//System.out.println(containsTheSameElements(a1, a2));
		System.out.println(isSorted(a1));		
    }
    
    public static int findMissingInt (int [] array) {
        int n = array.length;
		for (int i = 0; i < n; i++) {
			int j = 0;
			boolean missing = true;
			while (missing && j < n) {
				if (array[j] == i) {
					missing = false;
				}
				j++;
			}
			if (missing) {
				return i;
			}
		}
        return n;
    }

    public static int secondMaxValue(int [] array) {
        int n = array.length;
		int max;
		int secMax;
		int temp;
		if (array[0] < array[1]) {
			max = array[1];
			secMax = array[0];
		} else {
			max = array[0];
			secMax = array[1];
		}
		for (int i = 2; i < n; i++) {
			if (array[i] > secMax) {
				secMax = array[i];
				if (secMax > max) {
					temp = secMax;
					secMax = max;
					max = temp;
				}
			}
		}
        return secMax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        int n1 = array1.length;
		int n2 = array2.length;
		//checking array2 contains array1
		for (int i = 0; i < n1; i++) {
			int j = 0;
			boolean missing = true;
			while (missing && j < n2) {
				if (array2[j] == array1[i]) {
					missing = false;
				}
				j++;
			}
			if (missing) {
				return false;
			}
		}
		//checking array1 contains array2
		for (int i = 0; i < n2; i++) {
			int j = 0;
			boolean missing = true;
			while (missing && j < n1) {
				if (array2[i] == array1[j]) {
					missing = false;
				}
				j++;
			}
			if (missing) {
				return false;
			}
		}
        return true;
    }

    public static boolean isSorted(int [] array) {
        int n = array.length;
		if (n == 1) {
			return true;
		}
		for (int i = 0; i < n - 1; i++) {
			if (array[i] != array[i+1]) {
				if (array[i] <= array[i+1]) {
					for (int j = i+1; j < n-1; j++) {
						if (array[j] > array[j+1]) {
							return false;
						}
					}
					return true;
				} else {
					for (int j = i+1; j < n-1; j++) {
						if (array[j] < array[j+1]) {
							return false;
						}
					}
					return true;
				}
			}
		}
        return true;
    }

}
