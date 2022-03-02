package code07;

import code06.Rectangle;

import java.util.Arrays;
import java.util.Random;

public class Test08 {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[5];
        Random random = new Random();
        for (int i = 0; i < rectangles.length; i++) {
            Rectangle rectangle = new Rectangle();
            rectangle.setLength(random.nextInt(9) + 1);
            rectangle.setWidth(random.nextInt(9) + 1);
            rectangles[i] = rectangle;
        }

        System.out.println("Arrays.toString(rectangles) = " + Arrays.toString(rectangles));

        for (int i = 0; i < rectangles.length - 1; i++) {
            for (int j = 0; j < rectangles.length - 1 - i; j++) {
                if (rectangles[j].getArea(rectangles[j].getLength(), rectangles[j].getWidth()) > rectangles[j + 1].getArea(rectangles[j + 1].getLength(), rectangles[j + 1].getWidth())) {
                    Rectangle rectangle = rectangles[j];
                    rectangles[j] = rectangles[j + 1];
                    rectangles[j + 1] = rectangle;
                }

            }
        }

        System.out.println("Arrays.toString(rectangles) = " + Arrays.toString(rectangles));
    }
}
