/*
8. ��ȿ�� �Ӹ����

-����
�տ��� ���� ���� �ڿ��� ���� ���� ���� ���ڿ��� �Ӹ�����̶�� �մϴ�.
���ڿ��� �ԷµǸ� �ش� ���ڿ��� �Ӹ�����̸� "YES", �ƴϸ� ��NO"�� ����ϴ� ���α׷��� �ۼ��ϼ���.
�� ȸ���� �˻��� �� ���ĺ��� ������ ȸ���� �˻��ϸ�, ��ҹ��ڸ� �������� �ʽ��ϴ�.
���ĺ� �̿��� ���ڵ��� �����մϴ�.

-�Է�
ù �ٿ� ���� 100�� ���� �ʴ� ������ ���� ���ڿ��� �־����ϴ�.

-���
ù ��° �ٿ� �Ӹ���������� ����� YES �Ǵ� NO�� ����մϴ�.
*/
import java.util.*;
class Main {
	public String solution(String s){
		String answer = "NO";
		s = s.toUpperCase().replaceAll("[^A-Z]", "");  //^=����, [^A-Z]: �빮��A���� Z������ �ƴ� �͵�
		String tmp = new StringBuilder(s).reverse().toString();
		if(s.equals(tmp)) answer = "YES";
		return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(T.solution(str));
	}
}
