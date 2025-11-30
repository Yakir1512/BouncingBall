public class Wall implements Collidable{
    private Rectangle rect;

    //constractor
    public Wall(Rectangle rect){this.rect=rect;}
    @Override
    public Rectangle getCollisionRectangle() {
        return null;
    }

    @Override
    public Velocity hit(Point collisionPoint, Velocity currentVelocity) {
        return null;
    }
}
