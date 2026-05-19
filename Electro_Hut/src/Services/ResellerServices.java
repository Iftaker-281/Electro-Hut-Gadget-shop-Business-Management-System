package Services;
import Models.Reseller;
import Filehandler.filehandeler;

public class ResellerServices {

    public void addReseller(Reseller r) {
    	filehandeler.write("resellers.txt", r.toFileString());
        System.out.println("Reseller added successfully");
    }

    public void viewResellers() {
    	filehandeler.read("resellers.txt");
    }
}