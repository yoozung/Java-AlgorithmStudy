/*
1. ���� ã��

-����
�� ���� ���ڿ��� �Է¹ް�, Ư�� ���ڸ� �Է¹޾� �ش� Ư�����ڰ� �Է¹��� ���ڿ��� �� �� �����ϴ��� �˾Ƴ��� ���α׷��� �ۼ��ϼ���.
��ҹ��ڸ� �������� �ʽ��ϴ�.���ڿ��� ���̴� 100�� ���� �ʽ��ϴ�.

-�Է�
ù �ٿ� ���ڿ��� �־�����, �� ��° �ٿ� ���ڰ� �־�����.
���ڿ��� ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.

-���
ù �ٿ� �ش� ������ ������ ����Ѵ�.
*/

import java.util.*;
class  Main{
	public int solution(String str, char t){
		int answer=0;
		str = str.toUpperCase(); //.toUpperCase(): �빮�ڷ� ��ȯ
		t = Character.toUpperCase(t);
		//System.out.println(str + "" + t);

		/* for ���
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == t) answer++; //.charAt(i) �ε����� ���ڿ��� ���� 
		} */

		/*foreach ���*/
		for(char x : str.toCharArray()) { //.toCharArray(): x�� �����ϴ� ���ڹ迭 ����
		   if(x==t) answer++;
		}
		return answer;
	}


	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next(); // .next: ��ĳ�ʷ� ���ڿ� �ϳ� �о���̴� ��
		char c = kb.next().charAt(0); // .next().charAt(0): ���ڿ����� 0��° �ִ� �׸��� �����Ͷ�

		System.out.println(T.solution(str, c));
	}
}
