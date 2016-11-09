package Core.Module02.practice;

public class Factorial {
    int fact(int n) {
        int result;

        if (n == 1)
            return 1;
        result = fact(n - 1) * n;
        return result;
    }

    public static void main(String[] args) {
        Factorial f = new Factorial();
// получим число, введенное пользователем
       /* int usernumber = Integer.valueOf(editResult.getText().toString());
// вычисляем факториал и выводим результат в текстовой метке
        textViewInfo.setText("Факториал " + usernumber + " равен "
                + f.fact(usernumber));*/
    }
}
