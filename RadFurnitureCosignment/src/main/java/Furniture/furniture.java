package Furniture;

public class furniture {

	/*
	 * This class is in the model layer of the application.
	 * This comes from the M in MVC, which is something
	 * we will talk about later. For now, what you need
	 * to know is that this class will be a Java Object
	 * representation of a table in your database.
	 * 
	 * There should be a model for each and every table.
	 * So if you made a pizza store web site, you might
	 * need a pizza table, an orders table, a users table,
	 * etc.
	 * 
	 * The fields in this model represent fields (columns)
	 * that you plan to put in your database.
	 * 
	 * After you finish the Model, go into the db package
	 * and look at the FakeDB class.
	 */
	String name;
	//All tables will have some key that is unique.
	//A typical solution is to give the model an ID.
	int id;
	String color;
	int price;
	
	//Fill out your model with Constructors, getters,
	//setters, and a toString. I recommend generating them.
	public furniture() {
		super();
	}

	public furniture(String name, int id, String color, int price) {
		super();
		this.name = name;
		this.id = id;
		this.color = color;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "furniture [name=" + name + ", id=" + id + ", color=" + color + ", price=" + price + "]";
	}
}
