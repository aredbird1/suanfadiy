package blogsuanfa.dp;

public class NumberOfSplitsMakeStringHuiwen {

	public static void main(String[] args) {
		String str = "abcbaddj";
		System.out.println(new NumberOfSplitsMakeStringHuiwen().numberOfSplits(str));
	}

	public int numberOfSplits(String str) {
		assert (str != null);
		int[] cuts = new int[str.length()];
		for (int i = 0; i < str.length(); i++) {
			cuts[i] = i;
		}
		
		print(cuts);

		for (int i = 0; i < str.length(); i++) {
			if (isPalindrome(str, 0, i)) {
				cuts[i] = 0;
				continue;
			}
			for (int j = 1; j <= i; j++) {
				if (isPalindrome(str, j, i) && cuts[i] > cuts[j - 1] + 1) {
					cuts[i] = cuts[j - 1] + 1;
				}
			}
		}
		
		print(cuts);
		
		return cuts[str.length() - 1];
	}
	
	private void print(int[] cuts) {
		// TODO Auto-generated method stub
		for(int i=0;i<cuts.length;i++){
			System.out.print(cuts[i]+" ");
		}
		System.out.println();
	}

	public boolean isPalindrome(String str, int i, int j) {
		while (i <= j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}