package sample.core.stat_case;

public class Main {

	public static void main(String[] args) {
		char grade = 'C';

		switch (grade) {
		case 'A':
			System.out.println("�������!");
			break;
		case 'B':
		case 'C':
			System.out.println("������� ���������");
			break;
		case 'D':
			System.out.println("�� ������");
		case 'F':
			System.out.println("����� ���������� �����");
			break;
		default:
			System.out.println("�������� ������");
		}
		System.out.println("���� ������ " + grade);

	}

}
