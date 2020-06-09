package DAO;

import java.util.ArrayList;

public class FurnitureDAOImpl implements FurnitureDao {
	/*
	 * Now we must implement these methods.
	 * The benefit to coding to an interface means that
	 * when we replace these implementations with
	 * real database accesses, then are can just swap
	 * out which implementation we use.
	 * 
	 * Our methods will call to our fake DB.
	 * 
	 * After this, you should have a working model. The
	 * only problem is that methods in an interface
	 * cannot be static, which means that these methods
	 * can only used if you instantiate a FurnitureDAOImpl
	 * Object. I like to make a service package (layer)
	 * for my application that instantiates the FurnitureDAOImpl
	 * Object and will make a static version of each method.
	 * Each method looks exactly the same only adding the
	 * static keyword to the method signature. The
	 * implementation is to simply call/return the 
	 * corresponding method you see below.
	 */
	public boolean createFurniture(Furniture p) {
		FakeDB.Furnitures.put(p.getId(), p);
		//returning true just means success.
		return true;
	}

	public Furniture getFurniture(int id) {
		return FakeDB.Furnitures.get(id);
	}

	public List<Furniture> getAllFurnitures() {
		//This one is tricky because we have a Map.
		//This wont be complicated when we convert to
		//using real databases.
		List<Furniture> FurnitureList = new ArrayList<Furniture>();
		Set<Integer> keys = FakeDB.Furnitures.keySet();
		for(Integer k : keys)
			FurnitureList.add(FakeDB.Furnitures.get(k));
		
		return FurnitureList;
	}

	public boolean updateFurniture(Furniture change) {
		//We are going to assume you aren't changing
		//id of the Furniture, just its info.
		
		FakeDB.Furnitures.replace(change.getId(), change);
		return true;
	}

	public boolean deleteFurniture(int id) {
		FakeDB.Furnitures.remove(id);
		return true;
	}

}
