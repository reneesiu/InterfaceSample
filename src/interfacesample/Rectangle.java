package interfacesample;


class Rectangle implements Shape {
    int length, width;
    Rectangle(int length, int width) {
        this.length=length;
        this.width=width;
    }
    
    @Override
    public void PrintName() {
        System.out.println("You instance a Rectangle");
    }
    public double area() {
        return (double)length*width;
    }
}
