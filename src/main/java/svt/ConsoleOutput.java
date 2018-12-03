package svt;

public class ConsoleOutput implements Output {
    @Override
    public void showResult(String result) {
        System.out.printf("Результат: "+ result);
    }
}
