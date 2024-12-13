public class PartTimeEmployee extends Employe{
    private int  hoursWork;

    private double HourlyRate;

    public PartTimeEmployee(String name, int id, int hoursWork, double HourlyRate) {
        super(name, id);
        this.hoursWork = hoursWork;
        this.HourlyRate= HourlyRate;
    }
    @Override
    public double CalculateSalary(){
        return hoursWork * HourlyRate;

    }


}