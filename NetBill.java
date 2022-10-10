import javax.swing.JOptionPane;

public class PizzaParlor {
    public static void main(String[]args){

        // Variable Declaration
        double grossBill, amountGiven, netBill, change, serviceCharge, salesTax;
        String dialog1, dialog2, msg;

        // User Input Dialog
        dialog1=JOptionPane.showInputDialog("Input the GrossBill ");
        dialog2=JOptionPane.showInputDialog("Input the amount Given by the Costumer");

        // Converting From String to Double
        grossBill = Double.parseDouble(dialog1);
        amountGiven = Double.parseDouble(dialog2);

        // Formula
        salesTax = 0.07 * grossBill;
        serviceCharge = 0.12 * grossBill;
        netBill = grossBill + (salesTax + serviceCharge);
        change = amountGiven - netBill;

        //Message Box
        msg = "The Net Bill is : " + netBill + " The Change is : " + change;
        JOptionPane.showMessageDialog(null,msg);
    }
}
