/*
7. ȸ�� ���ڿ�

-����
�տ��� ���� ���� �ڿ��� ���� ���� ���� ���ڿ��� ȸ�� ���ڿ��̶�� �մϴ�.
���ڿ��� �ԷµǸ� �ش� ���ڿ��� ȸ�� ���ڿ��̸� "YES", ȸ�� ���ڿ��� �ƴϸ� ��NO"�� ����ϴ� ���α׷��� �ۼ��ϼ���.
�� ȸ���� �˻��� �� ��ҹ��ڸ� �������� �ʽ��ϴ�.

-�Է�
ù �ٿ� ���� 100�� ���� �ʴ� ������ ���� ���ڿ��� �־����ϴ�.

-���
ù ��° �ٿ� ȸ�� ���ڿ������� ����� YES �Ǵ� NO�� ����մϴ�.
*/

import java.util.*;
class Main {
	public String solution(String str){
		String answer = "YES";
		str = str.toUpperCase();
		 int len = str.length();
		 for(int i =0; i < len/2; i++){
			 if(str.charAt(i) != str.charAt(len-i-1)) return "NO";
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
