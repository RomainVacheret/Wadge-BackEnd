package wadge.model.fridge;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Map;
import java.util.UUID;

import org.junit.Before;
import org.junit.Test;

public class FridgeFoodTest {
    private FridgeFood food;
    private UUID id;
    private UUID elementId = UUID.randomUUID();
    private FoodElement foodElement = new FoodElement(elementId, "date 1", "date 2", 42);

    @Before
    public void setUp() {
        id = UUID.randomUUID();
        food = new FridgeFood(id, "Food", Map.of(elementId, foodElement));
    }

    @Test
    public void getterSetterTest() {
        String result = String.format("FridgeFood [id=%s, name=Food, products={%s=FoodElement [id=%s, insertionDate=date 1, peremptionDate=date 2, quantity=42]}]", id ,elementId, elementId);
        assertEquals(result, food.toString());
        UUID f1Id = UUID.randomUUID();
        UUID f3Id = UUID.randomUUID();
        FridgeFood f1 = new FridgeFood("Food", Map.of(f1Id, new FoodElement(f1Id, "date 1", "date 2", 42)));
        FridgeFood f3 = new FridgeFood("Name", Map.of(f3Id, new FoodElement(f3Id, "d1", "d2", 42)));
        assertEquals(foodElement, food.getProducts().get(0));
        assertEquals("Food", food.getName());
        assertNotEquals(f1, food); 
        assertNotEquals(f3, food); 
    }
}
