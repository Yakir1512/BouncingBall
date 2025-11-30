import java.util.ArrayList;
import java.util.List;

public class Rectangle  {
    Point start;
    double height;
    double width;
    List<Line> lines;
    // Create a new rectangle with location and width/height.
    public Rectangle(Point upperLeft, double width, double height) {
        start = upperLeft;
        this.height = height;
        this.width = width;
        lines = rectLines();
    }
    //add the lines of the rect to one list of lines
    List<Line> rectLines() {
        //
        List<Line> lines = new ArrayList<>();
        double x = start.getX();
        double y = start.getY();
        //top
        lines.add(new Line(x, y, x + width, y)); //upper
        //bottom
        lines.add(new Line(x, y + height, x + width, y + height)); //bottom side
        //left
        lines.add(new Line(x, y, x, y + height)); //left side
        //right
        lines.add(new Line(x + width, y, x + width, y + height)); // right side
        return lines;
    }

    // Return a (possibly empty) List of intersection points
    // with the specified line.
    public java.util.List<Point> intersectionPoints(Line line){
        List<Point> ret = new ArrayList<>();
        //loop to add intersections point.
        for(Line l : lines){
            if (line.isIntersecting(l))
                ret.add(Line.xPoint(line,l));
        }
        return ret;
    }
    //returns the lines the rect oof the Block is made of
    public List<Line> getLines() {return lines;}

    // Return the width
    public double getWidth(){return width;}
    //height of the rectangle
    public double getHeight(){return height;}

    // Returns the upper-left point of the rectangle.
    public Point getUpperLeft(){return start;}
    //return the right edge
    public double getRight(){return start.getX() + width;}
    //return the left edge
    public double getLeft(){return start.getX();}
    //returns the
    public double getTop(){return start.getY();}
    //returns the bottom value
    public double getBottom(){return start.getY() - height;}
}
