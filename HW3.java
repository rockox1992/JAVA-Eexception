public class HW3 {
    public static void main(String[] args) {
        Presenter<View> prog = new Presenter<View>(new ConsoleView());
        prog.start();
    }
}