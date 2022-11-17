public class Rectangle
{
    private int width;
    private int height;
    private static int count = 0;
    private static totalArea = 0;
    
    public Rectangle(int rectWidth, int rectHeight) {
        width = rectWidth;
        height = rectHeight;
        totalArea += width * height;
        count ++;
    }
    
    public int getArea() {
        return width * height;
    }
    
    public int getHeight() {
        return height;
    }
    
    public int getWidth() {
        return width;
    }
    
    public void setHeight(int newHeight) {
        totalArea -= width * height;
        height = newHeight;
        totalArea += width * height;
    }
    
    public void setWidth(int newWidth) {
        totalArea -= width * height;
        width = newWidth;
        totalArea += width * height;
    }
    
    public String toString() {
        return "Rectangle with width: " + width + " and height: " + height;
    }
}
