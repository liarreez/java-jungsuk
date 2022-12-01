public class Main {

    static Variable variable = new Variable();
    static VariableType variableType = new VariableType();

    public static void main(String[] args) {
        variable.variableUse();
        variable.variableChange();
        variableType.stringPlus();
        variableType.scannerInput();
    }
}