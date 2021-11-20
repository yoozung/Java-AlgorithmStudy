/*
4. 단어 뒤집기

-설명
N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.

-입력
첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.

-출력
N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.
*/

import java.util.*;
class Main {	
	public ArrayList<String> solution(int n, String[] str){
		ArrayList<String> answer = new ArrayList<>(); 
		for(String x : str){
			//StringBuilder(문자열을 다루는 클래스)를 이용한 뒤집기
			String tmp = new StringBuilder(x).reverse().toString();
			answer.add(tmp);
		}
		return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();  //단어 몇 개 들어오는지 읽음
		String[] str=new String[n]; //string배열 만듬, n개로 크기 동적
		for(int i=0; i < n; i++){  //배열에 단어 하나씩 담음
			str[i] = kb.next(); 
		}
		for(String x : T.solution(n, str)){
			System.out.println(x);
		}
	}
}

