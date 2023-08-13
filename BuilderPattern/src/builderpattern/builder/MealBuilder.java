package builderpattern.builder;

import builderpattern.Item.NonVegBurger;
import builderpattern.Item.VegBurger;
import builderpattern.Meal.Meal;

public class MealBuilder {
	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.AddItem(new VegBurger());
		return meal;
	}
	
	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.AddItem(new NonVegBurger());
		return meal;
	}
}
