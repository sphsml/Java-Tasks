public class GenericArrayList<E> {
    private E[] genericArray;
    public GenericArrayList(){
        this.genericArray = (E[])(new Object[0]);
    }

    //Arraylists have .size .remove .get .set .add

    public int size(){
        return genericArray.length;
    }

    public void remove(E object) {
        E[] newArray = (E[]) (new Object[genericArray.length - 1]);
        for (int i = 0; i < genericArray.length; i++) {
            for (int j = 0; i < newArray.length; i++) {
                if (!genericArray[i].equals(object)) {
                    newArray[j] = genericArray[i];
                }
            }
        }
        genericArray = newArray;
    }

    public E get(int index){
        return genericArray[index];
    }

    public void set(int index, E object){
        genericArray[index] = object;
    }

    public void add(E object){
        E[] newArray = (E[]) (new Object[genericArray.length + 1]);
        for(int i=0; i< genericArray.length; i++){
            newArray[i] = genericArray[i];
        }
        newArray[genericArray.length] = object;
    }
}
