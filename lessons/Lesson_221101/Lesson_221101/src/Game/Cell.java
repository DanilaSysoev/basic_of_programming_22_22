package Game;

public interface Cell {
    void addToCell(GameObject object);
    void removeFromCell(GameObject object);
    default void activationOnStep() { }
}
