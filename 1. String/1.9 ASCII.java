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

--Ǯ��
x >= 48 && x <= 57 (ascii code���� 48~57 = '0'~'9')
���� ���̸� �Ʒ� ����
answer = answer*10+(x-48)
	0, 1, 2, 0, 5 ����
	0: 0 = 0*10+0
	1: 1 = 0*10+1
	2: 12 = 1*10+2
	0: 120 = 12*10+0
	5: 1205 = 120*10+5
*/
import java.util.*;
class Main {
	public int solution(String s){
		int answer = 0;
		for(char x : s.toCharArray()){
			if(x >= 48 && x <= 57) answer=answer*10+(x-48);
		}

		return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(T.solution(str));
	}
}
