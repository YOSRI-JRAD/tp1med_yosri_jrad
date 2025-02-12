//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            ExpressionParenthesee expr = new ExpressionParenthesee("(a + b) - (c + d)");
            System.out.println("Expression correcte : " + expr.getString());
        }
        catch (ParentheseException e) {
            System.out.println("Erreur de parenthèse : " + e.getMessage());
        }
    }
}