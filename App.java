import javax.swing.JOptionPane;

public class App {
    @SuppressWarnings("unused")
    public static void main(String[] args) throws Exception {
    int fn = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number"));
    int sn = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number"));
    int answer = fn + sn;
    JOptionPane.showMessageDialog(null,"The answer is "+answer);

    }
}
