// package wadge.api;

// import static org.junit.Assert.assertTrue;

// import java.util.List;

// import org.junit.Before;
// import org.junit.Test;
// import org.springframework.beans.factory.annotation.Autowired;

// import wadge.dao.api.IRecipeDao;
// import wadge.dao.impl.JsonRecipeDao;
// import wadge.model.recipe.Recipe;
// import wadge.service.recipe.impl.RecipeService;

// public class RecipeControllerTest {
//     private RecipeController controller;

//     @Autowired private RecipeController recipeController;


//     @Before
//     public void setUp() {
//         IRecipeDao dao = new JsonRecipeDao();
//         RecipeService service = new RecipeService(dao, null, null);
//         controller = new RecipeController(service, null);
//     }

//     @Test
//     public void getRecipesTest() {
//         assertTrue(controller.getAllRecipes() instanceof List<?>);
//         assertTrue(controller.getAllRecipes().get(0) instanceof Recipe);
//     }
// }
