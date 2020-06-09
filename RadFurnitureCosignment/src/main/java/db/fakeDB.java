package db;

import java.util.HashMap;
import java.util.Map;

import Furniture.furniture;

public class fakeDB {

	/*
	 * This class will eventually be replaced. This will be a way of storing
	 * information for your models. This information will be lost when you terminate
	 * your application. After we learn SQL and JDBC we will replace this with a
	 * connection to a real database to persist your information.
	 * 
	 * When you finish here look at the dao package next.
	 * Look at the furnitureDAO interface first.
	 */

	public static Map<Integer, furniture> furnitures = new HashMap<Integer, furniture>();

	// static block is code that executes the very 
	// first time a class is loaded. Therefore this
	// will be pre-populated furnitures. For testing purposes.
	static {
		furniture p1 = new furniture("Chair", 1, "Chair/Wicker/Blue", 10);
		furniture p2 = new furniture("Table", 2, "Table/Wood/Birch", 10);
		furniture p3 = new furniture("Sideboard", 3, "Sideboard/Veener/Walnut/Large/Formal", 8);

		furnitures.put(1, p1);
		furnitures.put(2, p2);
		furnitures.put(3, p3);
	}
