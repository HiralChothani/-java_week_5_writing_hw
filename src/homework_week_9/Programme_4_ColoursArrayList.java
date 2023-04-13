package homework_week_9;

import java.util.ArrayList;

public class Programme_4_ColoursArrayList {
    public static void main(String[] args) {
        ArrayList<String> colorList = new ArrayList<>();
        colorList.add("RED");
        colorList.add("BLUE");
        colorList.add("GREEN");
        colorList.add("YELLOW");
        colorList.add("BLACK");
        colorList.add("PURPLE");
        colorList.add("CYAN");
        colorList.add("WHITE");
        colorList.add("ORANGE");

        for (String colourList: colorList) {
            System.out.println(colourList + ", ");
        }
    }
}
