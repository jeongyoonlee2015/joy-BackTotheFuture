public class Circle extends Shape{
    private int x, y, r;

    public Circle(int x, int y, int r){
        super();
        this.x = x;
        this.y = y;
        this.r = r;
    }
    public int getX(){
        return x;
    }   
    public int setX(int x){
        this.x = x;
    }
    public int getY(){
        return y;
    }   
    public int setY(int y){
        this.y = y;
    }   
    public int getR(){
        return r;
    }   
    public int setR(int r){
        this.r = r;
    }

    public Circle copy()throws CloneNotSupportedException{
        Circle circle = (Circle) clone();
        circle.x = x + 1;
        circle.y = y + 1;  
        return circle;
    } 
}