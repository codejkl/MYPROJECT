import javax.swing.*;
import java.util.ArrayList;

public class PayrollSystem {
    private ArrayList<Employe> employeList;

    public PayrollSystem() {
        employeList = new ArrayList<>();

    }
    public  void addEmployee(Employe employe){
        employeList.add(employe);
    }

    public  void removeEmploye(int id){
        Employe EmployeToRemove = null;
         for (Employe employe: employeList){
             if(employe.getId()==id){
                 EmployeToRemove = employe;
                 System.out.println(employe);
               break;
             }
         }
         if (EmployeToRemove!=null){
             employeList.remove(EmployeToRemove);

         }


    }

    public void displayEmployes() {
        for (Employe employe : employeList) {
            System.out.println(employe);
        }
    }

}

