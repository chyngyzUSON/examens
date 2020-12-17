public class Main {

    public static void main(String[] args) {
        Circle[] circles = new Circle[10];
            //цикл для заполнения массива
        for(int i = 0; i < circles.length; i++){
            circles[i] = Circle.generateCircle();
            circles[i] + 1;
        }
        if (Circle.getCircleArea == 3)
            Circle.getCount()++;

    }
}
