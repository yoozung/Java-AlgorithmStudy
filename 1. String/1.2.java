/*
2. 대소문자 변환

-설명
대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.

-입력
첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
문자열은 영어 알파벳으로만 구성되어 있습니다.

-출력
첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.
*/

import java.util.*;
class Main {
	public String solution(String str){
		String answer = "";
		for(char x : str.toCharArray()){
			//.isLowerCase(X): 소문자인지 확인 / Character.toUpperCase(x): 대문자로바꿈
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
