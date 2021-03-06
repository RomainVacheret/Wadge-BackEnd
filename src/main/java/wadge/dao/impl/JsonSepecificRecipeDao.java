package wadge.dao.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;
import wadge.dao.api.ISpecificRecipeDao;
import wadge.model.recipe.Recipe;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@Repository("jsonSepecificRecipeDao")

public class JsonSepecificRecipeDao implements ISpecificRecipeDao {
	private final ObjectMapper mapper;
	private final Map<String, Recipe> doneRecipes;
	static final String FILE_DONE_RECIPE="done_recipe.json";
	private final Map<String,Recipe> favorites;
	static final String FILE_FAVORITE="favorites.json";
	private static Logger logger = Logger.getLogger(JsonSepecificRecipeDao.class.getName());
	private final List<Recipe> recipes;
	private final List<Recipe> recipesDone;
	public JsonSepecificRecipeDao(){
		mapper=new ObjectMapper();
		favorites=new HashMap<>();
		recipes = new ArrayList<>();
		doneRecipes=new HashMap<>();
		recipesDone = new ArrayList<>();
		
		try {
			recipes.addAll(Arrays.asList(mapper.readValue(Paths.get(FILE_FAVORITE).toFile(), Recipe[].class)));
			addRecipeFavorite(recipes);
			recipesDone.addAll(Arrays.asList(mapper.readValue(Paths.get(FILE_DONE_RECIPE).toFile(), Recipe[].class)));
			addRecipeDone(recipesDone);
		} catch (IOException e) {
			logger.log(Level.FINE, e.getMessage(), e);
		}
	}
	@Override
	public void addRecipeFavorite(List<Recipe> recipes){
		recipes.stream().forEach(recipe -> favorites.put(recipe.getLink(),recipe));
	}
	@Override
	public void addRecipeDone(List<Recipe> recipes){
		recipesDone.stream().forEach(recipe -> doneRecipes.put(recipe.getLink(),recipe));
	}
	@Override
	public List<Recipe> getFavoritesRecipes() {
		return favorites.values().stream().collect(Collectors.toList());
	}
	@Override
	public List<Recipe> getDoneRecipes() {
		return doneRecipes.values().stream().collect(Collectors.toList());
	}
	
	@Override
	public void writeFavoriteRecipe(Recipe recipe) {
		favorites.put(recipe.getLink(),recipe);
		try {
			mapper.writeValue(Paths.get(FILE_FAVORITE).toFile(),favorites.values());
		}
		catch (IOException e){logger.log(Level.FINE, e.getMessage(), e);}
	}
	@Override
	public void writeDoneRecipe(Recipe recipe) {
		doneRecipes.put(recipe.getLink(),recipe);
		try {
			mapper.writeValue(Paths.get(FILE_DONE_RECIPE).toFile(),doneRecipes.values());
		}
		catch (IOException e){logger.log(Level.FINE, e.getMessage(), e);}
	}
	
	@Override
	public void deleteFavoriteRecipe(String link) {
		favorites.remove(link);
		try {
			mapper.writeValue(Paths.get(FILE_FAVORITE).toFile(),favorites.values());
		}
		catch (IOException e){logger.log(Level.FINE, e.getMessage(), e);}
	}
}

