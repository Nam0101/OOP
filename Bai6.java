import javax.swing.JOptionPane;
public class Bai6{
    public static void main(String[] args){
        String strChoise;
        String strCMD= "Nhập lựa chọn của bạn: "+"\n"+"1. Giải pt bậc nhất 1 ẩn"+"\n"+"2.Giải hệ pt bậc nhất 2 ẩn"+"\n"+"3.Giải pt bậc 2";
        strChoise = JOptionPane.showInputDialog(null,strCMD,"Input number",JOptionPane.INFORMATION_MESSAGE);
        int choise = Integer.parseInt(strChoise);
        switch(choise){
            case 1:
                String strA,strB;
                strA= JOptionPane.showInputDialog(null,"Nhập số thứ nhất","Giải pt bậc nhất 1 ẩn",JOptionPane.INFORMATION_MESSAGE);
                strB = JOptionPane.showInputDialog(null,"Nhập số thứ hai","Giải pt bậc nhất 1 ẩn",JOptionPane.INFORMATION_MESSAGE);
                double numA= Double.parseDouble(strA);
                double numB = Double.parseDouble(strB);
                if (numA==0.0){
                    if (numB==0){
                        JOptionPane.showMessageDialog(null,"PT có vô số nghiệm");
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"PT vô nghiệm");
                    }
                }
                else{
                    double result = (-numB)/(numA);
                    JOptionPane.showMessageDialog(null,"PT có nghiệm: "+String.valueOf(result));
                }
                break;
            case 2:
                String Mes="Nhập lần lượt các hệ số a1,b1,c1,a2,b2,c2: ";
                String stra1= JOptionPane.showInputDialog(null,"Nhập a1:","Giải hệ pt bậc nhất 2 ẩn",JOptionPane.INFORMATION_MESSAGE);
                String strb1= JOptionPane.showInputDialog(null,"Nhập b1:","Giải hệ pt bậc nhất 2 ẩn",JOptionPane.INFORMATION_MESSAGE);
                String strc1= JOptionPane.showInputDialog(null,"Nhập c1:","Giải hệ pt bậc nhất 2 ẩn",JOptionPane.INFORMATION_MESSAGE);
                String stra2= JOptionPane.showInputDialog(null,"Nhập a2:","Giải hệ pt bậc nhất 2 ẩn",JOptionPane.INFORMATION_MESSAGE);
                String strb2= JOptionPane.showInputDialog(null,"Nhập b2:","Giải hệ pt bậc nhất 2 ẩn",JOptionPane.INFORMATION_MESSAGE);
                String strc2= JOptionPane.showInputDialog(null,"Nhập c2:","Giải hệ pt bậc nhất 2 ẩn",JOptionPane.INFORMATION_MESSAGE);
                double a1= Double.parseDouble(stra1);
                double a2= Double.parseDouble(stra2);
                double b1= Double.parseDouble(strb1);
                double b2= Double.parseDouble(strb2);
                double c1= Double.parseDouble(strc1);
                double c2= Double.parseDouble(strc2);
                double D=a1*b2-a2*b1;
                double Dx=c1*b2-c2*b1;
                double Dy=a1*c2-a2*c1;
                if(D==0){
                    if(Dx==0 && Dy==0){
                        JOptionPane.showMessageDialog(null,"Hệ PT có vô số nghiệm");
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Hệ PT vô nghiệm");

                    }
                }
                else{
                    double x=Dx/D;
                    double y=Dy/D;
                    JOptionPane.showMessageDialog(null,"Hệ PT có nghiệm: "+String.valueOf(x)+" và "+String.valueOf(y));

                }
                break;
            case 3:
                
            default:
                System.exit(0);
        }
    }
}