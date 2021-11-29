/*
1. ū �� ����ϱ�

-����
N���� ������ �Է¹޾�, �ڽ��� �ٷ� �� ������ ū ���� ����ϴ� ���α׷��� �ۼ��ϼ���.
(ù ��° ���� ������ ����Ѵ�)

-�Է�
ù �ٿ� �ڿ��� N(1<=N<=100)�� �־�����, �� ���� �ٿ� N���� ������ �Էµȴ�.

-���
�ڽ��� �ٷ� �� ������ ū ���� �� �ٷ� ����Ѵ�.
*/

import java.util.*;
class Main {	
	public ArrayList<Integer> solution(int n, int[] arr){
		ArrayList<Integer> answer = new ArrayList<>();
		answer.add(arr[0]);  //0���� ������ ����̴ϱ� 0�߰�
		for(int i=1; i<n; i++){
			if(arr[i]>arr[i-1]) answer.add(arr[i]);
		}
		return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int[] arr=new int[n]; //nũ���� �����迭
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}
		for(int x : T.solution(n, arr)){
			System.out.print(x+" ");
		}
	}
}


