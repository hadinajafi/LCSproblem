package lcsjava;

public class LCSclass {
	private String seq1;
	private String seq2;
	private String subseq;
	private int size = 0;
	private tableObject[][] table;

	LCSclass() {

	}

	public LCSclass(String text1, String text2) {
		subseq = "";
		seq1 = text1;
		seq2 = text2;
		table = new tableObject[seq1.length() + 1][seq2.length() + 1];
		lcsSize();
		getSubsequence();
		//reversing the subsequence
		StringBuilder reversed = new StringBuilder();
		reversed.append(subseq);
		reversed.reverse();

		System.out.println("The LCS is: " + reversed);
	}

	private void lcsSize() {
		for (int i = 0; i < seq2.length() + 1; i++) {
			for (int j = 0; j < seq1.length() + 1; j++) {
				if (i == 0 || j == 0) {
					table[j][i] = new tableObject(0);
				} else if (seq1.charAt(j - 1) == seq2.charAt(i - 1)) {
					table[j][i] = new tableObject(table[j - 1][i - 1].getData() + 1, "kaj");

				} else {
					if (table[j - 1][i].getData() > table[j][i - 1].getData()) {
						table[j][i] = new tableObject(table[j - 1][i].getData(), "left");
					} else {
						table[j][i] = new tableObject(table[j][i - 1].getData(), "up");
					}
				}
			}
		}

		size = table[seq1.length()][seq2.length()].getData();
		System.out.println("\n*************\nLongest size is: " + size);
		for (int k = 0; k < seq2.length() + 1; k++) {
			for (int l = 0; l < seq1.length() + 1; l++) {
				System.out.print(table[l][k].getData());
			}
			System.out.println();
		}
	}


	private void getSubsequence() {
		int i = seq2.length();
		int j = seq1.length();
		while (table[j][i].getJahat() != "zero") {
			if (table[j][i].getJahat() == "kaj") {
				subseq += seq1.charAt(j - 1);
				j--;
				i--;
			} else if (table[j][i].getJahat() == "left") {
				j--;
			} else {
				i--;
			}
		}
	}

}
