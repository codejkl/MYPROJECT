public class FullTimeEmployee extends Employe{

    private double monthlySalary;


    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double CalculateSalary(){
        return monthlySalary;

    }

    }
