public class points implements Comparable<points>{

    int x;
    int y;

    points(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return '{' + "x=" + x + ", y=" + y + '}';
    }

    @Override
    public int compareTo(points other){
        int thisSum = this.x + this.y;
        int otherSum = other.x + other.y;

        return Integer.compare(otherSum,thisSum);
    }


}
