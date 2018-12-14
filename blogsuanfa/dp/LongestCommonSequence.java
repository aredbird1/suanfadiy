package blogsuanfa.dp;

public class LongestCommonSequence {

	/**
	 * @param args
	 */
	public static int[][] LCS(String str1, String str2) {
		int[][] opt = new int[str2.length() + 1][str1.length() + 1];

		for (int i = 0; i <= str2.length(); i++) {
			opt[i][0] = 0;
		}

		for (int j = 0; j <= str1.length(); j++) {
			opt[0][j] = 0;
		}

		for (int j = 1; j <= str1.length(); j++) {
			for (int i = 1; i <= str2.length(); i++) {
				if (str2.charAt(i - 1) == str1.charAt(j - 1)) {
					opt[i][j] = opt[i - 1][j - 1] + 1;
				} else {
					opt[i][j] = (opt[i - 1][j] >= opt[i][j - 1] ? opt[i - 1][j]
							: opt[i][j - 1]);
				}
			}
		}

		return opt;
	}

	public static void print(int[][] opt, String X, String Y, int i, int j) {

		if (i == 0 || j == 0) {
			return;
		}

		if (X.charAt(i - 1) == Y.charAt(j - 1)) {
			System.out.print(X.charAt(i - 1));
			print(opt, X, Y, i - 1, j - 1); // don't put this line before the
											// upper line. Otherwise, the order
											// is wrong.
		} else if (opt[i - 1][j] >= opt[i][j]) {
			print(opt, X, Y, i - 1, j);
		} else {
			print(opt, X, Y, i, j - 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="acehmnlxyz";
		String s2="aijkmnlz";
		
		int[][] arr=LongestCommonSequence.LCS(s1, s2);
		LongestCommonSequence.print(arr, s1, s2, s1.length(), s2.length());

	}

}
