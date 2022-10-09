package pack;

import java.util.List;

public class StringTransformerGroup implements StringTransformer{

    List<StringTransformer> list;

    public StringTransformerGroup(List<StringTransformer> list){
        this.list = list;
    }

    public void execute(StringDrink drink){
        for (int i = 0; i<list.size();i++){
            list.get(i).execute(drink);
        }
    }


    public void undo(StringDrink drink){
        for (int i = (list.size()-1); i<=0;i--){
            list.get(i).undo(drink);
        }
    }
}
