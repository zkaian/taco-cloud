package tacos;

import java.util.List;

import lombok.Data;
import tacos.Ingredient.Type;

@Data
public class Taco {
	private String name;
	
	private List<Ingredient> ingredients;
}
