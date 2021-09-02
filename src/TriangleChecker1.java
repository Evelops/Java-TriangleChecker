public class TriangleChecker1 {
	public String check(final int a, final int b, final int c) {// a,b,c 삼각형 변의 길이
		int match;

		if ((a <= 0) || (b <= 0) || (c <= 0)) {
			return "INVALID";// 다 0보다 작으면 삼각형 아니자나
		}

		match = 0; // match 를 0으로 초기화 하고
		if (a == b) { // 변 a,b 같으면
			match = match + 1;
		}
		if (a == c) {
			match = match + 2;
		}
		if (b == c) {
			match = match + 3;
		}
		if (match == 0) {
			if (((a + b) < c) || ((a + c) < b) || ((b + c) > a)) {// 오류 발생지점
				return "SCALENE";
			} else {
				return "INVALID";
			}
		}

		if (match > 3) {
			return "EQUILATERAL";// 정삼각형
		}

		if ((match == 1) && ((a + b) > c)) {
			return "ISOSCELES";// 이등변 삼각형
		} else if ((match == 2) && ((a + c) > b)) {
			return "ISOSCELES";
		} else if ((match == 3) && ((b + c) > a)) {
			return "ISOSCELES";
		}

		return "INVALID";
	}

	public static void main(String[] args) {
		String type = "";
		TriangleChecker1 tester = new TriangleChecker1();
		type = tester.check(1, 3, 4);
		System.out.println("삼각형 유형은 : " + type);
		type = tester.check(3, 3, 5);
		System.out.println("삼각형 유형은 : " + type);
		type = tester.check(3, 4, 5);
		System.out.println("삼각형 유형은 : " + type);
		type = tester.check(3, 3, 3);
		System.out.println("삼각형 유형은 : " + type);
	}
}
