import java.lang.reflect.Array;
import java.util.ArrayList;

public class Week9 {
    //Destructive
    public static void Requirement1(ArrayList<String> StringArr, int num){
        int StringArrSize = StringArr.size();
        for(int i = 0; i< StringArrSize; i++){
            if(StringArr.get(i).length() < num){
                StringArr.remove(i);
                StringArrSize--;
            }
        }
    }

    //Constructive
    public static void Requirement2(ArrayList<String> StringArr, int num){
        ArrayList<String> newStringArr = new ArrayList<>();
        for(int i=0; i<StringArr.size(); i++){
            if(StringArr.get(i).length() >= num){
                newStringArr.add(StringArr.get(i));
            }
        }
    }

    public static GenericArrayList Requirement3P1(GenericArrayList GAL, Object object1, Object object2){
        //constructive
        GenericArrayList GAL2 = new GenericArrayList();
        boolean found = false;
        for(int i=0; i < GAL.size(); i++){
            if(found == false && GAL.get(i).equals(object1)){
                GAL2.add(object2);
                found = true;
            }
            else{
                GAL2.add(GAL.get(i));
            }
        }
        return GAL2;

    }

    public static GenericArrayList Requirement3P2(GenericArrayList GAL, Object object1, Object object2){
        boolean found = false;

        for(int i=0; i<GAL.size(); i++){
            if(found == false && GAL.get(i).equals(object1)){
                GAL.set(i, object2);
                found  = true;
            }
        }

        return GAL;
    }


}
