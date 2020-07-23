package main;

import box.*;

import java.util.Random;

public class Application {

    public static void main(String[] args) {
        SmallBox box = new SmallBox();
        BigBox bigBox = new BigBox();

        System.out.println(testBox(box));
        System.out.println(testBox(bigBox));
    }

    public static Boolean testBox(Box box) {
        if (box.getClass().equals(SmallBox.class)) {

            SmallBox smallBox = (SmallBox)box;
            Integer value = new Random().nextInt();
            smallBox.setValue(value);
            return smallBox.getValue() == value;

        } else {

            BigBox bigBox = (BigBox)box;
            Integer valueOne = new Random().nextInt();
            Integer valueTwo = new Random().nextInt();
            bigBox.setValueOne(valueOne);
            bigBox.setValueTwo(valueTwo);
            return bigBox.getValueOne() == valueOne && bigBox.getValueTwo() == valueTwo;
        }
    }
}
