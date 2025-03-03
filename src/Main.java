import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Rectangle original = new Rectangle(20, 10, 15,10);

        ArrayList<Rectangle> rectangles = new ArrayList<>();

        Random random = new Random();

        int collisionCount = 0;

        for (int i = 0; i < 1000000; i++) {
//            int x = random.nextInt(51);
//            int y = random.nextInt(51);

            int  x = (int) (Math.random() * 50);
            int y = (int) (Math.random() * 50);

            int length = (int)(Math.random() * (50-10+1) + 10);
            int width = (int)(Math.random() * (50-10+1) + 10);

//            int length = random.nextInt(41) + 10;
//            int width = random.nextInt(6) + 5;

            Rectangle newRect = new Rectangle(length, width, x, y);

            rectangles.add(newRect);


            int originalRight = original.getX() + original.getLength();
            int originalBottom = original.getY() + original.getWidth();
            int newRectRight = newRect.getX() + newRect.getLength();
            int newRectBottom = newRect.getY() + newRect.getWidth();

            boolean collision = true;

            if (originalRight <= newRect.getX() || newRectRight <= original.getX()) {
                collision = false;
            }

            if (originalBottom <= newRect.getY() || newRectBottom <= original.getY()) {
                collision = false;
            }

            if (collision) {
                collisionCount++;
            }
        }

        double collisionPercentage = (double) collisionCount / rectangles.size() * 100;
        double roundedPercentage = Math.round(collisionPercentage * 10) / 10.0;

        System.out.println("Percentage of rectangles that collide with the original: " + roundedPercentage + "%");

    }
}