package pack;

public class StringReplacer implements StringTransformer{

    char original;
    char swap;

    public StringReplacer(char original, char swap) {
        this.original = original;
        this.swap = swap;
    }

    public void execute(StringDrink drink){
        String drink_new = "";
        for(int i = 0; i<drink.getText().length();i++){
            if(drink.getText().charAt(i) == original){
                drink_new += swap;
            }else {
                drink_new += drink.getText().charAt(i);
            }
        }
        drink.setText(drink_new);
    }

    public void undo(StringDrink drink){
        String drink_new = "";
        for(int i = 0; i<drink.getText().length();i++){
            if(drink.getText().charAt(i) == swap){
                drink_new += original;
            }else {
                drink_new += drink.getText().charAt(i);
            }
        }
        drink.setText(drink_new);
    }
}
