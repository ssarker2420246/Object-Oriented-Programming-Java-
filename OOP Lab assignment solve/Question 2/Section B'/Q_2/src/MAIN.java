
import java.util.ArrayList;
import java.util.Collections;

public class MAIN {

    public static void main(String[] args) {

        ArrayList<points> points = new ArrayList<>();

        points.add(new points(2,3));
        points.add(new points(4,3));
        points.add(new points(3,6));

        Collections.sort(points);

        System.out.println(points);

    }
}
