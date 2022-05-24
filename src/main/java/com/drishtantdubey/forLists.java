package com.drishtantdubey;

import java.util.ArrayList;
import java.util.List;

public class forLists {
    public static void main(String[] args) {
        //List Declaration
        //List<string> colors = ArrayList();
        //In general you can do without data type but for data type <datatype> required
        //new ArrayList Object can is a General list object
        // It Can Be LinkedList(); or e.t.c for specific use
        List<String> colors = new ArrayList();
        colors.add("Blue");
        colors.add("Black");
        colors.add("Brown");
        //Instead of all this we can all this
        {/*
        List<String> colors = List.of(
            "blue",
            "black",
            "brown"
        )
        */};
        {/* List<String> colorsUnmodifiable = List.of(
                                                "blue",
                                                "black",
                                                "brown"
                                            )
           The Part Unmodifiable added to object name make object immutable to and add or remove operations
        */}
        System.out.println(colors);
        //Loop Return Of List
        //String Object mapping for loop
        for (String color : colors) {
            System.out.println(color);
        }
        //one line list print for loop
        colors.forEach(System.out::println);
        //Common for i iterations for loop
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i) + "\n");
        }
        //Returns Boolean
        System.out.println(colors.contains("Brown"));
        //removes all the elements from the lists which equates to the parameter
        colors.removeAll(colors);
        //Shows Removed
        System.out.println(colors.contains("Brown"));
    }
}

