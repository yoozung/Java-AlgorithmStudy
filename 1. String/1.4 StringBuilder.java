/*
4. �ܾ� ������

-����
N���� �ܾ �־����� �� �ܾ ������ ����ϴ� ���α׷��� �ۼ��ϼ���.

-�Է�
ù �ٿ� �ڿ��� N(3<=N<=20)�� �־����ϴ�.
�� ��° �ٺ��� N���� �ܾ �� �ٿ� �ϳ��� �־����ϴ�. �ܾ�� ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.

-���
N���� �ܾ �Էµ� ������� �� �ٿ� �ϳ��� ����� ����մϴ�.
*/

import java.util.*;
class Main {	
	public ArrayList<String> solution(int n, String[] str){
		ArrayList<String> answer = new ArrayList<>(); 
		for(String x : str){
			//StringBuilder(���ڿ��� �ٷ�� Ŭ����)�� �̿��� ������
			String tmp = new StringBuilder(x).reverse().toString();
			answer.add(tmp);
		}
		return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();  //�ܾ� �� �� �������� ����
		String[] str=new String[n]; //string�迭 ����, n���� ũ�� ����
		for(int i=0; i < n; i++){  //�迭�� �ܾ� �ϳ��� ����
			str[i] = kb.next(); 
		}
		for(String x : T.solution(n, str)){
			System.out.println(x);
		}
	}
}

