import java.util.LinkedList;
import java.util.List;

public class GameEnvironment {
    private List<Collidable> gameObj;
    //ocnstractor
    public GameEnvironment(){
         this.gameObj = new LinkedList<Collidable>();
    }
    // add the given collidable to the environment.
    public void addCollidable(Collidable c){
        gameObj.add(c);
    }

    // Assume an object moving from line.start() to line.end().
    // If this object will not collide with any of the collidables
    // in this collection, return null. Else, return the information
    // about the closest collision that is going to occur.
    public CollisionInfo getClosestCollision(Line trajectory){
        Point start =trajectory.start();
        //the point to be returned
        Point p=null;
        //the collidable obj to treturn
        Collidable c=null;
        //fined the closest object of the game environment objects
        for (Collidable col :gameObj){
            Point temp = trajectory.closestIntersectionToStartOfLine(col.getCollisionRectangle());
            if (start.distance(temp) < start.distance(p))
            p = temp;
            c =col;
        }

        CollisionInfo colinf = new CollisionInfo(p,c);
        return colinf;

    }
//hjgyugfyg
}
