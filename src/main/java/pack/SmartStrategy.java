package pack;

import java.util.ArrayList;
import java.util.List;

public class SmartStrategy implements OrderingStrategy{

    private List<StringDrink> wanted_drinks = new ArrayList<>();
    private List<StringRecipe> wanted_recipes = new ArrayList<>();
    private List<StringBar> wanted_bars = new ArrayList<>();

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar){
        if(bar.isHappyHour())
            bar.order(drink, recipe);
        else{
            wanted_drinks.add(drink);
            wanted_recipes.add(recipe);
            wanted_bars.add(bar);
        }
    }

    @Override
    public void happyHourStarted(StringBar bar){
        for (int i = 0; i< wanted_recipes.size();i++){
            wanted_bars.get(i).order(wanted_drinks.get(i),wanted_recipes.get(i));
        }
        wanted_drinks.clear();
        wanted_bars.clear();
        wanted_recipes.clear();
    }

    @Override
    public void happyHourEnded(StringBar bar){}
}
