public class TriangleChecker1 {
	public String check(final int a, final int b, final int c) {// a,b,c �ﰢ�� ���� ����
		int match;

		if ((a <= 0) || (b <= 0) || (c <= 0)) {
			return "INVALID";// �� 0���� ������ �ﰢ�� �ƴ��ڳ�
		}

		match = 0; // match �� 0���� �ʱ�ȭ �ϰ�
		if (a == b) { // �� a,b ������
			match = match + 1;
		}
		if (a == c) {
			match = match + 2;
		}
		if (b == c) {
			match = match + 3;
		}
		if (match == 0) {
			if (((a + b) < c) || ((a + c) < b) || ((b + c) > a)) {// ���� �߻�����
				return "SCALENE";
			} else {
				return "INVALID";
			}
		}

		if (match > 3) {
			return "EQUILATERAL";// ���ﰢ��
		}

		if ((match == 1) && ((a + b) > c)) {
			return "ISOSCELES";// �̵ �ﰢ��
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
		System.out.println("�ﰢ�� ������ : " + type);
		type = tester.check(3, 3, 5);
		System.out.println("�ﰢ�� ������ : " + type);
		type = tester.check(3, 4, 5);
		System.out.println("�ﰢ�� ������ : " + type);
		type = tester.check(3, 3, 3);
		System.out.println("�ﰢ�� ������ : " + type);
	}
}
