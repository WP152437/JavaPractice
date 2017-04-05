/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.basic
 *	 |_ Loop
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 16.
 * </pre>
 *
 * @author ajin
 * @version : 1.0
 */
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int choice=0,sum=100;
		int _class_index = 0;
		String[] _class = {"마법사","영주","기사","농민"};
		
		do{
			
		System.out.println("--------------------");
		System.out.println("<<게임 메뉴>>\n");
		System.out.println("1. 공격력 증가\n");
		System.out.println("2. 공격력 감소\n");
		System.out.println("3. 캐릭터 설정\n");
		System.out.println("9. 종료\n");
		System.out.println("--------------------");
		
		choice = scanner.nextInt();
		
		switch (choice){
		case 1 :
			System.out.println("메뉴 입력 => 1\n");
			sum+=10;
			System.out.printf("공격력이 증가되었습니다. 현재 공격력 : %d\n",sum);break;
		
		case 2 :
			System.out.println("메뉴 입력 => 2\n");
			sum-=10;
			System.out.printf("공격력이 감소되었습니다. 현재 공격력 : %d\n",sum);break;
			
		case 3 :
			_class_index = new Random().nextInt(4);
			System.out.println("메뉴 입력 => 3\n");
			System.out.println(_class[_class_index]+"(으)로 설정되었습니다.\n");break;
			
		case 9 :
			System.out.println("메뉴 입력 => 9\n");
			System.out.println("이제 공부하세요!\n");break;
			
		default :
			System.out.printf("메뉴 입력 = > %d\n",choice);
			System.out.println("없는 메뉴 입니다!!\n");
			
		}
		}while(choice !=9);
		
		

	}

}
