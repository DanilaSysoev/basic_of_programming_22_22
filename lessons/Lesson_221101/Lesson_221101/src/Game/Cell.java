package Game;

import Visual.Drawable;

public interface Cell extends Drawable {
    void addToCell(GameObject object);
    void removeFromCell(GameObject object);
    boolean isPassable();
    default void activationOnStep(World world) { }
}
