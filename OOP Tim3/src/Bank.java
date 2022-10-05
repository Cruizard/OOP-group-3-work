import javax.swing.*;

public class Bank {

    public static void main(String[] args) {
        String clientname = JOptionPane.showInputDialog("insert client name: ");
        String typecard = JOptionPane.showInputDialog("Insert his/her card type(silver/gold/plat): ");
        cardtype clientcard=null;
        switch(typecard) {
            case "silver":
                clientcard = new silvercard(clientname);
                break;
            case "gold":
                clientcard = new goldcard(clientname);
                break;
            case "plat":
                clientcard = new platcard(clientname);
                break;
            default:
                System.out.println("card type is invalid! >:(");
                return;
        }
        clientcard.info();

    }
}
