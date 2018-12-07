package svt;

public class ConsoleOutput implements Output {
    @Override
    public void showResult(int result) {
        System.out.printf("Результат: "+ result);
    }
}
