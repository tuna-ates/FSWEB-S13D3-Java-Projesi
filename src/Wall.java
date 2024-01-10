public class Wall {
    double width;
    double height;

    public Wall(double widht,double height){
        this.width=widht;
        this.height=height;
    }
    public double getWidth(){
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }
    public void setWidth(double width1){
        if (width1<0){
         this.width=0;
        }
        else {
            this.width=width1;
        }
    }
    public void setHeight(double height1){
        if (height1<0){
            this.height=0;
        }
        else {
            this.height=height1;
        }
    }

    public double getArea(){
        return this.width*this.height;
    }
}
