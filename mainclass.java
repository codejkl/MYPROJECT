public class mainclass {
    public static void main(String[] args) {
        PayrollSystem PayrollSystem = new PayrollSystem();
        FullTimeEmployee Emp1 = new FullTimeEmployee("ankit", 11, 10000.0);
        PartTimeEmployee Emp2 = new PartTimeEmployee("vikas", 12, 14, 100.0);
        PartTimeEmployee emp3 = new PartTimeEmployee("harsh", 12, 1,12 );
        PartTimeEmployee emp5 = new PartTimeEmployee("jkl", 14, 1,16 );
        PartTimeEmployee emp6 = new PartTimeEmployee("hghi", 22, 1,15 );
        PartTimeEmployee emp7 = new PartTimeEmployee("abcd", 52, 4,12 );
        FullTimeEmployee Emp8 = new FullTimeEmployee("Raam", 67, 1045);
        FullTimeEmployee Emp9 = new FullTimeEmployee("Mohan", 56, 10056);
        PayrollSystem.addEmployee(Emp1);
        PayrollSystem.addEmployee(Emp2);
        PayrollSystem.addEmployee(emp3);
        PayrollSystem.addEmployee(emp5);
        PayrollSystem.addEmployee(emp6);
        PayrollSystem.addEmployee(emp7);
        PayrollSystem.addEmployee(Emp8);
        PayrollSystem.addEmployee(Emp9);


        System.out.println("inital employe detail:");
        PayrollSystem.displayEmployes();
        System.out.println("Removing Employee"  );
        PayrollSystem.removeEmploye(11);

        System.out.println("Remaining Employee");
        PayrollSystem.displayEmployes();

    }
}
