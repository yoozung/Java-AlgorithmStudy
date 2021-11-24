/*
9. 숫자만 추출

-설명
문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.
추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.

-입력
첫 줄에 숫자가 썩인 문자열이 주어집니다. 문자열의 길이는 100을 넘지 않습니다.

-출력
첫 줄에 자연수를 출력합니다.

--풀이
x >= 48 && x <= 57 (ascii code에서 48~57 = '0'~'9')
위가 참이면 아래 실행
answer = answer*10+(x-48)
	0, 1, 2, 0, 5 대입
	0: 0 = 0*10+0
	1: 1 = 0*10+1
	2: 12 = 1*10+2
	0: 120 = 12*10+0
	5: 1205 = 120*10+5
*/
import java.util.*;
class Main {
	public int solution(String s){
		int answer = 0;
		for(char x : s.toCharArray()){
			if(x >= 48 && x <= 57) answer=answer*10+(x-48);
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
