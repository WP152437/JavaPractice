/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *    |_Question
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 31.
 * </pre>
 *
 * @author : ajin
 * @version : 1.0
 */
public class Question {

	public static void main(String[] args) {

		String[] questions = { "가장 좋아하는 가수는? ", "가장 좋아하는 배우는? ", "가장 좋아하는 과목은? " };
		String[] answers = { "프리스틴", "최우식", "응용프로그래밍" };
		StringBuilder builder;
		Scanner scanner = new Scanner(System.in);
		String answer;

		for (int i = 0; i <= 2; i++) {
			System.out.printf("%d.%s\n", i + 1, questions[i]);
			answer = scanner.nextLine();

			if (answers[i].equals(answer)) {
				System.out.println("정답입니다!");
			}
			else {
				System.out.println("틀렸습니다!");
			}

		}

		System.out.println("<<결과출력>>");
		for (int i = 0; i <= 2; i++) {
			builder = new StringBuilder("");
			System.out.println(builder.append(questions[i]).append(answers[i]).append("입니다."));
		}

	}

}
