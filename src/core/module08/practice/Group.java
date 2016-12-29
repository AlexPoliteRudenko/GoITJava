package core.module08.practice;

import java.util.ArrayList;
import java.util.List;

public class Group  {
    private List<Shape> list;

    public Group() {
        this.list = new ArrayList<>();
    }

    public void add(Shape shape) {
        list.add(shape);
    }

    public List<Shape> getAll() {
        return list;
    }


}
