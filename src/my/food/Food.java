package my.food;

import java.util.List;

/**
 * @author pteyssier
 *
 */
public interface Food {
	
	public List<String> getIngredients();
	
	public String getCountryOrigin();

	/* Exercise 4 */
	public Integer getCalory();
	
}
