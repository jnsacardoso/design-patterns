package pack;

public class StringCaseChanger implements StringTransformer{

    public void execute(StringDrink drink){
        String drink_new = "";
        for(int i = 0; i<drink.getText().length();i++){
            if(Character.isLowerCase(drink.getText().charAt(i))){
                drink_new += Character.toUpperCase(drink.getText().charAt(i));
            }else {
                drink_new += Character.toLowerCase(drink.getText().charAt(i));
            }
        }
        drink.setText(drink_new);
    }

    public void undo(StringDrink drink){
        execute(drink);
    }
}

