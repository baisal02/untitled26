package entities;

public class Load {
    private double height;
    private double width;
    private double weight;

    public Load(double height, double width, double wight) {
        this.height = height;
        this.width = width;
        this.weight = wight;
    }
    public Load(){

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWeight() {
        return weight;
    }

    public void setWight(double weight) {
        this.weight = weight;
    }
}
