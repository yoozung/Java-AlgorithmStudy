/*
4. �Ǻ���ġ ����

-����
1) �Ǻ���ġ ������ ����Ѵ�. �Ǻ���ġ �����̶� ���� 2���� ���� ���Ͽ� ���� ���ڰ� �Ǵ� �����̴�.
2) �Է��� �Ǻ���ġ ������ �� ���� �� �̴�. ���� 7�� �ԷµǸ� 1 1 2 3 5 8 13�� ����ϸ� �ȴ�.

-�Է�
ù �ٿ� �� �׼� N(3<=N<=45)�� �Էµȴ�.

-���
ù �ٿ� �Ǻ���ġ ������ ����մϴ�.
*/
import java.util.*;
class Main {	
	public int[] solution(int n){
		int[] answer=new int[n];
		answer[0]=1;
		answer[1]=1;
		for(int i=2; i<n; i++){
			answer[i]=answer[i-2] + answer[i-1];
		}
		return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		for(int x : T.solution(n)) System.out.print(x+" ");
	}
}
