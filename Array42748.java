package programmers.test;

import java.util.Arrays;

public class Array42748 {

	public static void main(String[] args) {

		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };

		// arrCopy : array를 i번째부터 j번째까지 자른 배열 (배열의 길이: j-i+1 )
		// tempReturn : 최종리턴값이 저장될 배열 (배열의 길이: command의 길이)

		// arrReturn의 길이는 commands의 i길이
		int[] answer = new int[commands.length];

		// arrReturn에 최종 값 입력
		for (int l = 0; l < answer.length; l++) {

			// ---------------------------------------------------

//			int i = commands[l][0];
//			int j = commands[l][1];
//			int k = commands[l][2];

			int[] tempReturn = new int[commands[l][1] - commands[l][0] + 1];
			// 3 //3
			System.arraycopy(array, commands[l][0] - 1, tempReturn, 0, commands[l][1] - commands[l][0] + 1);
			// 1 4
			// 오름차순 정렬
			Arrays.sort(tempReturn);

			// ---------------------------------------------------
			answer[l] = tempReturn[commands[l][2] - 1];

		}

		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}

	}

}
