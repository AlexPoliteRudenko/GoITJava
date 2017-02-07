package core.finalTest;

public class ToDos {
    String day;
    ToDos(String d) { day = d; }
    public boolean equals(Object o) {
        return ((ToDos)o).day == this.day;
    }
     public int hashCode() { return 9; }
}
