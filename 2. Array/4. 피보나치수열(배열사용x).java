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
	public void solution(int n){
		int a=1, b=1, c;
		System.out.print(a+" "+b+" ");
		for(int i=2; i<n; i++){
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		T.solution(n);
	}
}
