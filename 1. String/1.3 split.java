/*
3. ���� �� �ܾ�

-����
�� ���� ������ �־����� �� ���� �ӿ��� ���� �� �ܾ ����ϴ� ���α׷��� �ۼ��ϼ���.
������� �� �ܾ�� �������� ���е˴ϴ�.

-�Է�
ù �ٿ� ���̰� 100�� ���� �ʴ� �� ���� ������ �־����ϴ�. ������ ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.

-���
ù �ٿ� ���� �� �ܾ ����Ѵ�. 
���� ���̰� �� �ܾ �������� ��� ����ӿ��� ���� ���ʿ� ��ġ�� �ܾ ������ �մϴ�.
*/

import java.util.*;
class Main {
	public String solution(String str){
		String answer = "";
		int m = Integer.MIN_VALUE; //���� ���� ������ �ʱ�ȭ
		String[] s = str.split(" ");
		for(String x : s) {
			int len = x.length();
			if(len > m) {
				m = len;
				answer = x;
			}
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
