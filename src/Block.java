public class Block implements Collidable{
    private Rectangle rect;
    //constractor
    public Block(Rectangle rect){this.rect=rect;}
    @Override
    public Rectangle getCollisionRectangle() {
        return rect;

    }

    @Override
    public Velocity hit(Point collisionPoint, Velocity currentVelocity) {
        double x = collisionPoint.getX();
        double y = collisionPoint.getY();

        boolean hitLeft   = x == rect.getLeft();
        boolean hitRight  = x == rect.getRight();
        boolean hitTop    = y == rect.getTop();
        boolean hitBottom = y == rect.getBottom();

        double newDx = currentVelocity.getDx();
        double newDy = currentVelocity.getDy();

        if (hitLeft || hitRight) {
            newDx = -newDx;
        }
        if (hitTop || hitBottom) {
            newDy = -newDy;
        }

        return new Velocity(newDx, newDy);
    }
}
