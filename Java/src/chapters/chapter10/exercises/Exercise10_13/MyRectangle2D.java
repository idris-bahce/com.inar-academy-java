package chapters.chapter10.exercises.Exercise10_13;

public class MyRectangle2D {
    private double x;
    private double y;
    private double width;
    private double height;

    public MyRectangle2D() {
        this(0,0,1,1);
    }
    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return width * height;
    }
    public double getPerimeter(){
        return 2 * (width + height);
    }
    public boolean contains(double x, double y){
        if ((x <= (this.width + this.x) && (this.width - this.x)<=x)&&(y <= (this.height + this.y) && (this.height - this.y)<=y)){
            return true;
        }else
            return false;
    }
    public boolean contains(MyRectangle2D r){
        if ((r.width<=this.width)&&(r.height<=this.height)&&(((this.x - this.width / 2) <= r.getX())&&(r.getX()<=this.x +(this.width / 2)))&&
                (((this.y - this.height / 2) <= r.getY())&&(r.getY()<=this.y +(this.height / 2)))){
            return true;
        }
        return false;
    }
    public boolean overlaps(MyRectangle2D r){
        if ((this.width + r.getWidth())>=((this.x + this.width / 2) - this.x) + (r.getX() - (r.getX() - r.getWidth() / 2))){
            return true;
        } else if ((this.width + r.getWidth()) >= (this.x - (this.x - this.width / 2)) + ((r.getX() + r.getWidth() / 2) - r.getX())) {
            return true;
        } else if ((this.height + r.getHeight()) >= (this.y - (this.y - this.height / 2)) + ((r.getY() + r.getHeight() / 2) - r.getY())) {
            return true;
        } else if ((this.height + r.getHeight()) >= ((this.y + this.height / 2)) - this.y + (r.getY() - (r.getY() - r.getHeight() / 2))) {
            return true;
        }else {
            return false;
        }
    }
}
