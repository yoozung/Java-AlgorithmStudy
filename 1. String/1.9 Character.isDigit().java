/*
9. ���ڸ� ����

-����
���ڿ� ���ڰ� �����ִ� ���ڿ��� �־����� �� �� ���ڸ� �����Ͽ� �� ������� �ڿ����� ����ϴ�.
���� ��tge0a1h205er������ ���ڸ� �����ϸ� 0, 1, 2, 0, 5�̰� �̰��� �ڿ����� ����� 1205�� �˴ϴ�.
�����Ͽ� ��������� �ڿ����� 100,000,000�� ���� �ʽ��ϴ�.

-�Է�
ù �ٿ� ���ڰ� ���� ���ڿ��� �־����ϴ�. ���ڿ��� ���̴� 100�� ���� �ʽ��ϴ�.

-���
ù �ٿ� �ڿ����� ����մϴ�.

--CharacterŬ���� �̿�
*/
import java.util.*;
class Main {
	public int solution(String s){
		String answer = "";
		for(char x : s.toCharArray()){
			if(Character.isDigit(x)) answer+=x;
		}

		return Integer.parseInt(answer);  //parseInt ����ϸ� 01205�� ���ڿ����� 1205�� ���ڷ� ��ȯ��
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(T.solution(str));
	}
}
