package tutorial4;

public class RecipeComponent {
    private float amount;
    private Ingredients ingredient;

    public RecipeComponent() {
        this.amount = 0;
        this.ingredient = null;
    }

    public RecipeComponent(float amount, Ingredients ingredient) {
        this.amount = amount;
        this.ingredient = ingredient;
    }


    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Ingredients getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredients ingredient) {
        this.ingredient = ingredient;
    }

    @Override
    public String toString() {
        return "RecipeComponent{" +
                "amount=" + amount +
                ", ingredient=" + ingredient +
                '}';
    }


}
