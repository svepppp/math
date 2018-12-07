package svt;

public class Main {
    public static void main(String[] args) {
        Operation operation=new Operation();
        ConsoleInput consoleInput=new ConsoleInput();
        ConsoleOutput consoleOutput=new ConsoleOutput();
        String[] values=consoleInput.getValues();
        int result=operation.add(values[0],values[1]);
        consoleOutput.showResult(result);
    }
}
