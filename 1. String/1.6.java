/*
6. �ߺ���������

-����
�ҹ��ڷ� �� �Ѱ��� ���ڿ��� �ԷµǸ� �ߺ��� ���ڸ� �����ϰ� ����ϴ� ���α׷��� �ۼ��ϼ���.
�ߺ��� ���ŵ� ���ڿ��� �� ���ڴ� ���� ���ڿ��� ������ �����մϴ�.

-�Է�
ù �ٿ� ���ڿ��� �Էµ˴ϴ�. ���ڿ��� ���̴� 100�� ���� �ʴ´�.

-���
ù �ٿ� �ߺ����ڰ� ���ŵ� ���ڿ��� ����մϴ�.
*/

import java.util.*;
class Main {
	public String solution(String str){
		String answer = "";
		 for(int i = 0; i < str.length(); i++){
			 //System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
			if(str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);
		
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
