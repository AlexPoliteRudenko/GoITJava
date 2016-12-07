package core.module06.practice;

public class ObjectRegular extends View{
    private int counter = 1;


    @Override
    final void show() {
        System.out.println("I am Regular Object and I show myself " + getCounter() + " time");
        this.setCounter(this.getCounter()+ 1);
    }

    @Override
    final  void hide() {
        for (int i = 0; i <= this.getCounter(); i++) {
            System.out.println("I am Regular Object and I hide myself " + (i + 1) + " time");
            this.setCounter(this.getCounter() - 1);
        }
    }

    private int getCounter() {
        return this.counter;
    }

    private void setCounter(int counter) {
        this.counter = counter;
    }
}
