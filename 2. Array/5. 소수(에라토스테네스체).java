/*5. �Ҽ�(�����佺�׳׽� ü)

-����
�ڿ��� N�� �ԷµǸ� 1���� N������ �Ҽ��� ������ ����ϴ� ���α׷��� �ۼ��ϼ���.
���� 20�� �ԷµǸ� 1���� 20������ �Ҽ��� 2, 3, 5, 7, 11, 13, 17, 19�� �� 8���Դϴ�.

-�Է�
ù �ٿ� �ڿ����� ���� N(2<=N<=200,000)�� �־����ϴ�.

-���
ù �ٿ� �Ҽ��� ������ ����մϴ�.
*/
import java.util.*;
class Main {	
	public int solution(int n){
		int cnt=0;
		int[] ch = new int[n+1];
		for(int i=2; i<=n; i++){
			if(ch[i]==0){
				cnt++;
				for(int j=i; j<=n; j=j+i) ch[j]=1;
			}
		}
		return cnt;
	}
	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		System.out.println(T.solution(n));
	}
}