package pack;

public class StringBar extends Bar{
    private boolean happyHour;

    public StringBar() {
        this.happyHour = false;
    }

    public boolean isHappyHour() {
        return this.happyHour;
    }

    public void startHappyHour() {
        this.happyHour = true;
        notifyObservers();

    }

    public void endHappyHour() {
        this.happyHour = false;
        notifyObservers();
    }

    public void order(StringDrink drink, StringRecipe recipe){
        recipe.mix(drink);
    }


}
