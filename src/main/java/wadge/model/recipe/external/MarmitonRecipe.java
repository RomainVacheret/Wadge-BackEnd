package wadge.model.recipe.external;

import java.util.List;

import wadge.model.recipe.Ingredient;

public class MarmitonRecipe {
	private String link ;
	private String name ;
	private String ratingfract;
	private String opinion;
	private List<String> steps;
	private String preparation;
	private String servings;
	private String difficulty;
	private List<Ingredient> ingredients;
	private String rating;
	public MarmitonRecipe() {}

	public MarmitonRecipe(String link,String name, List<String> steps, String servings, String duration, String difficulty, String opinion, String ratingfract,String rating, List<Ingredient> ingredients) {
		this.name = name;
		this.steps = steps;
		this.servings = servings;
		this.preparation = duration;
		this.difficulty = difficulty;
		this.link = link;
		this.ingredients = ingredients;
		this.opinion=opinion;
		this.ratingfract=ratingfract;
		this.rating=rating;
	}

	public String getServings() {
		return servings;
	}
	
	public void setServings(String servings) {
		this.servings = servings;
	}
	public String getRating() {
		return rating;
	}
	
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getDifficulty() {
		return difficulty;
	}
	
	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}
	
	public List<Ingredient> getIngredients() {
		return ingredients;
	}
	
	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}
	
	public String getLink() {
		return link;
	}
	
	public void setLink(String link) {
		this.link = link;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String  getRatingfract() {
		return ratingfract;
	}
	
	public void setRatingfract(String  ratingfract) {
		this.ratingfract = ratingfract;
	}
	
	public String getOpinion() {
		return opinion;
	}

	public void setOpinion(String opinion) {
		this.opinion = opinion;
	}
	
	public List<String> getSteps() {
		return steps;
	}
	
	public void setSteps (List<String> steps) {
		this.steps = steps;
	}
	
	public String getPreparation() {
		return preparation;
	}
	public void setPreparation(String duration) {
		this.preparation = duration;
	}

	@Override
	public String toString() {
		return "MarmitonRecipe [difficulty=" + difficulty + ", ingredients=" + ingredients + ", link=" + link
				+ ", name=" + name + ", opinion=" + opinion + ", preparation=" + preparation + ", rating=" + rating
				+ ", ratingfract=" + ratingfract + ", servings=" + servings + ", steps=" + steps + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((difficulty == null) ? 0 : difficulty.hashCode());
		result = prime * result + ((ingredients == null) ? 0 : ingredients.hashCode());
		result = prime * result + ((link == null) ? 0 : link.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((opinion == null) ? 0 : opinion.hashCode());
		result = prime * result + ((preparation == null) ? 0 : preparation.hashCode());
		result = prime * result + ((rating == null) ? 0 : rating.hashCode());
		result = prime * result + ((ratingfract == null) ? 0 : ratingfract.hashCode());
		result = prime * result + ((servings == null) ? 0 : servings.hashCode());
		result = prime * result + ((steps == null) ? 0 : steps.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MarmitonRecipe other = (MarmitonRecipe) obj;
		if (difficulty == null) {
			if (other.difficulty != null)
				return false;
		} else if (!difficulty.equals(other.difficulty))
			return false;
		if (ingredients == null) {
			if (other.ingredients != null)
				return false;
		} else if (!ingredients.equals(other.ingredients))
			return false;
		if (link == null) {
			if (other.link != null)
				return false;
		} else if (!link.equals(other.link))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (opinion == null) {
			if (other.opinion != null)
				return false;
		} else if (!opinion.equals(other.opinion))
			return false;
		if (preparation == null) {
			if (other.preparation != null)
				return false;
		} else if (!preparation.equals(other.preparation))
			return false;
		if (rating == null) {
			if (other.rating != null)
				return false;
		} else if (!rating.equals(other.rating))
			return false;
		if (ratingfract == null) {
			if (other.ratingfract != null)
				return false;
		} else if (!ratingfract.equals(other.ratingfract))
			return false;
		if (servings == null) {
			if (other.servings != null)
				return false;
		} else if (!servings.equals(other.servings))
			return false;
		if (steps == null) {
			if (other.steps != null)
				return false;
		} else if (!steps.equals(other.steps))
			return false;
		return true;
	}
	
}
