/*
5. Ư�� ���� ������

-����
���� ���ĺ��� Ư�����ڷ� ������ ���ڿ��� �־����� ���� ���ĺ��� ������,
Ư�����ڴ� �ڱ� �ڸ��� �״�� �ִ� ���ڿ��� ����� ����ϴ� ���α׷��� �ۼ��ϼ���.

-�Է�
ù �ٿ� ���̰� 100�� ���� �ʴ� ���ڿ��� �־����ϴ�.

-���
ù �ٿ� ���ĺ��� ������ ���ڿ��� ����մϴ�.
*/

import java.util.*;
class Main {
	public String solution(String str){
		String answer = "";
		char[] s = str.toCharArray();
		int lt = 0, rt = str.length() -1;
		while(lt < rt) {
			if(!Character.isAlphabetic(s[lt])) lt++;
			else if(!Character.isAlphabetic(s[rt])) rt--;
			else{
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
		}
		answer = String.valueOf(s);

		return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(T.solution(str));
	}
}
