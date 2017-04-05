/**
 * 
 */
package org.dimigo.basic;

/**
 *<pre>
 * org.dimigo.basic
 *	 |_ Operator
 *
 * 1. 개요 : 디미베네
 * 2. 작성일 : 2017. 3. 14.
 * </pre>
 *
 * @author ajin
 * @version : 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int salary = 1700000;
		int staff = 3;
		int store = 1500;
		long year = (long)salary*12*staff*store;
		
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.printf("월 평균 급여 : %,d원\n",salary);
		System.out.printf("점포 내 직원 수 : %d명\n",staff);
		System.out.printf("점포 수 : %,d개\n\n",store);
		System.out.printf("연간 인건비 : %,d원",year);
//
	}

}
