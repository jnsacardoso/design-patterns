package pack;

public class StringInverter implements StringTransformer {
    public void execute(StringDrink drink){
        StringBuilder drink_new = new StringBuilder(drink.getText());
        drink.setText(drink_new.reverse().toString());
    }

    public void undo(StringDrink drink){
        execute(drink);
    }
}
