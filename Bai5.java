import javax.swing.JOptionPane;
public class Bai5{
    public static void main(String[] args){
        String strNum1,strNum2;
        String strSum = "Sum of two numbers: ";
        String strDifference = "Difference of two numbers: ";
        String strProduct = "Product of two numbers: ";
        String strQuotient = "Quotient of two numbers: ";
        strNum1 = JOptionPane.showInputDialog(null,"Please input the first number: ","Input the first number",JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null,"Please input the second number: ","Input the first number",JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        double sum = num1 + num2;
        strSum += String.valueOf(sum);
        double difference = num1-num2;
        strDifference +=String.valueOf(difference);
        double product= num1*num2;
        strProduct += String.valueOf(product);
        double quotient= num1/num2;
        strQuotient += String.valueOf(quotient);
        strSum+= " , "+strDifference+" , "+strProduct+" , "+strQuotient;
        JOptionPane.showMessageDialog(null,strSum,"Show caculator",JOptionPane.INFORMATION_MESSAGE); 
        

    }
}