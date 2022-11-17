public class Rectangle
{
    private int width;
    private int height;
    private static int count = 0;
    
    public Rectangle(int rectWidth, int rectHeight) {
        width = rectWidth;
        height = rectHeight;
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
        height = newHeight;
    }
    
    public void setWidth(int newWidth) {
        width = newWidth;
    }
    
    public String toString() {
        return "Rectangle with width: " + width + " and height: " + height;
    }
}
