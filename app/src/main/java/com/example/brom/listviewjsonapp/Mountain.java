package com.example.brom.listviewjsonapp;

public class Mountain {
    //Member variables
    private String name;
    private String location;
    private int height;

    //default constructor
    public Mountain(){
        name = "Saknar namn";
        location = "Saknar plats";
        height=-1;
    }

    //en constructor som skapar ett nytt mountain
    public Mountain(String inName, String inLocation, int inHeight){
        name = inName;
        location = inLocation;
        height = inHeight;
    }

    public  Mountain(String inName){
        name = inName;
        location = "nowhere";
        height = -1;
    }

    //Member methods
    public String toString(){
        return name;
    }
    public String info(){
        String str=name;
        str+=" is located in ";
        str+=location;
        str+=" and has a height of ";
        str+=Integer.toString(height);
        str+="m.";
        return str;
    }

    public void setHeight(int newHeight) {
        height=newHeight;
    }

    public String getName(){
        return name;
    }
    public String getLocation() {return location;}
    public int getHeight() {return height;}
}
