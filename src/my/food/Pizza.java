package my.food;

import java.util.ArrayList;
import java.util.List;

/* 
 * Class Food sample Pizza : 
 * do not modify! 
 * do not feed after midnight! 
 * */
public class Pizza implements Food {
	
	List<String> ingredients = new ArrayList<String>();
	
	public Pizza() {
	 ingredients.add("ham");
	 ingredients.add("mozzarella");
	 ingredients.add("tomato");
	}
	
	@Override
	public List<String> getIngredients() {
		return ingredients;
	}

	@Override
	public String getCountryOrigin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getCalory() {
		// TODO Auto-generated method stub
		return null;
	}

}
