package university.schedule.core;

import java.util.ArrayList;
import java.util.List;

public class EntityCollection<T> {
    private final List<T> entities;

    public EntityCollection() {
        entities = new ArrayList<>();
    }

    public void clear() {
        entities.clear();
    }

    public int size() {
        return entities.size();
    }

    public void add(T entity) {
        if(!entities.contains(entity))
            entities.add(entity);
    }

    public boolean contains(T entity) {
        return entities.contains(entity);
    }
}
