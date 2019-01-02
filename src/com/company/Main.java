package com.company;

public class Main {

    static Clothes[] wardrobe = {new Clothes(), new Coat(), new Shirt()};

    public static void main(String[] args) {
        Clothes searchValue = new Shirt();
        Main search = new Main();
        try {
            int idx = search.linearSearch(searchValue);
            System.out.println("idx=" + idx);
        } catch (ValueNotFoundException e){
            e.printStackTrace();
        }
    }

    public int linearSearch(Clothes value) throws ValueNotFoundException{
        int result = -1;
        for (int i=0; i<wardrobe.length; i++ ){
            if (wardrobe[i].getClass().toString().equals(value.getClass().toString())) {
                return i;
            }
        }
        throw new ValueNotFoundException("Value "+ value + " not found!");
    }

    class ValueNotFoundException extends Exception{
        public ValueNotFoundException(String errorMessage){
            super(errorMessage);
        }
    }
}
