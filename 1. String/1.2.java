/*
2. ��ҹ��� ��ȯ

-����
�빮�ڿ� �ҹ��ڰ� ���� �����ϴ� ���ڿ��� �Է¹޾� �빮�ڴ� �ҹ��ڷ� �ҹ��ڴ� �빮�ڷ� ��ȯ�Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���.

-�Է�
ù �ٿ� ���ڿ��� �Էµȴ�. ���ڿ��� ���̴� 100�� ���� �ʽ��ϴ�.
���ڿ��� ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.

-���
ù �ٿ� �빮�ڴ� �ҹ��ڷ�, �ҹ��ڴ� �빮�ڷ� ��ȯ�� ���ڿ��� ����մϴ�.
*/

import java.util.*;
class Main {
	public String solution(String str){
		String answer = "";
		for(char x : str.toCharArray()){
			//.isLowerCase(X): �ҹ������� Ȯ�� / Character.toUpperCase(x): �빮�ڷιٲ�
			if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x);  
			else answer+=Character.toLowerCase(x);

			/* ASCII CODE
			if(x >= 97 && x <= 122) answer += (char)(x-32);
			else answer += (char)(x+32);
			*/
		}
		return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
