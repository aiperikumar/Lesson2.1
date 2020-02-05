package com.company;

public final class Rex extends Dog {
    private String name;
    private Color color;




    public String getName() {
        return name;
    }

    public Rex(int age, String breed , Shelter shelter, String name) {
        super(age, breed, shelter);
        this.name = name;
    }

    @Override
    public void playwith(String toy, int time){
        System.out.println("This Rex play with" + toy + "at this " + time );

    }
}
