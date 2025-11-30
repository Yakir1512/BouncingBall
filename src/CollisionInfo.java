public class CollisionInfo {
    Point collisioPoint;
    Collidable collidable;

    public CollisionInfo(Point p ,Collidable c){
        this.collisioPoint = p;
        this.collidable =c;
    }
    // the point at which the collision occurs.
    public Point collisionPoint(){return collisioPoint;}

    // the collidable object involved in the collision.
    public Collidable collisionObject(){return collidable;}
}
