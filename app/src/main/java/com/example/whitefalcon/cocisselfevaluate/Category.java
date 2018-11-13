package com.example.whitefalcon.cocisselfevaluate;

public class Category {
   /* public static final int PROGRAMMING = 1;
    public static final int GEOGRAPHY = 2;
    public static final int MATH = 3;*/

    public static final int CHAP1 = 1;
    public static final int CHAP2 = 2;
    public static final int CHAP3 = 3;
    public static final int CHAP4 = 4;
    public static final int CHAP5 = 5;
    public static final int CHAP6 = 6;
    public static final int CHAP7 = 7;
    public static final int CHAP8 = 8;
    public static final int CHAP9 = 9;

    private int id;
    private String name;
    public Category() { }
    public Category(String name) {
        this.name = name; }
        public int getId() { return id; }
        public void setId(int id) {
        this.id = id; }
        public String getName() { return name; }

        public void setName(String name) {
        this.name = name; }
@Override
     public String toString(){
        return getName();
     }
}

