package DAO;

import java.util.List;

public interface FurnitureDao2 {

	/*
	 * A standard practice used in application development
	 * is to code to interfaces. This means create an
	 * interface with all the methods you plan to implement.
	 * Then create a class the implements that interface.
	 * 
	 * You should create an interface and an implementation
	 * for EACH model. This layer of the application is
	 * called the DAO - Data Access Object. And that's
	 * exactly what we are creating: an Object to
	 * access our data.
	 * 
	 * The methods you are looking to create are what are
	 * called the CRUD operations for your model. This
	 * stands for Create, Read, Update, and Delete.
	 * 
	 * Below are some typical methods you might want for
	 * the case of the Furniture model.
	 * 
	 * Once you create this, look to the FurnitureDAOImpl file.
	 */

	public boolean createFurniture(Furniture p);
	
	public Furniture getFurniture(int id);
	
	public List<Furniture> getAllFurnitures();
	
	public boolean updateFurniture(Furniture change);
	
	public boolean deleteFurniture(int id);

}
