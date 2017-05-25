/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *	 |_ DBTest
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 25.
 * </pre>
 *
 * @author user
 * @version : 1.0
 */
public class DBTest {
	public static void main(String[] args) {
		System.out.println("<<변경 전>>");
		IDBManager db = IDBManager.getDBObject(IDBManager.ORACLE_DATABASE);
		crud(db);
		
		System.out.println("<<변경 후>>");
		db = IDBManager.getDBObject(IDBManager.SYBASE_DATABASE);
		crud(db);
	}
	
	private static void crud(IDBManager db){
		db.insert();
		db.update();
		db.search();
		db.delete();
		
		
	}

}
