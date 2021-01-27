package javaPractice;

public class Pattern {

	public static void main(String[] args) {

		rearrange(8);

	}

	public static void rearrange(int num) {

		for (int i = num; i > 0; i--) {

			for (int j = num; j >= i; j--) {

				System.out.print(" ");
			}

			for (int k = 0; k <= (i * 1 - 1); k++) {
				System.out.print("* ");
			}

			System.out.println();

		}

		for (int i = 0; i < num; i++) {

			for (int j = num - i; j >= 1; j--) {

				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++) {

				System.out.print("* ");
			}

			System.out.println();

		}

	}

}
