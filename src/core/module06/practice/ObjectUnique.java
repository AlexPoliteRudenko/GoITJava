package core.module06.practice;

public class ObjectUnique extends View{
    private boolean isHide;
    private static boolean isHideAll;

    @Override
    void show() {
        if (this.isHide()) {
            System.out.println("I'm Unique object and I show myself");
            this.setHide(false);
        } else {
            System.out.println("I'm Unique object and I can't show myself, because i've alredy done this'");
        }
    }

    @Override
    void hide() {
        if (!this.isHide()) {
            System.out.println("I'm Unique object and I hide myself");
            this.setHide(true);
        } else {
            System.out.println("I'm Unique object and I can't hide myself, because i've alredy done this'");
        }

    }

    public boolean isHide() {
        return this.isHide;
    }

    public void setHide(boolean hide) {
        this.isHide = hide;
    }

    public static boolean isHideAll() {
        return isHideAll;
    }

    public static void setIsHideAll(boolean isHideAll) {
        ObjectUnique.isHideAll = isHideAll;
    }
}
