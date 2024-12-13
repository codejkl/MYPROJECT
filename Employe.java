abstract class Employe{
    private String name;

    private int id;

    public Employe(String name, int id){
     this.id=id;
     this.name=name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public abstract double CalculateSalary();

    @Override
    public String toString(){
        return "Employe[ name="+name+",id="+id+",salary="+CalculateSalary()+"]";


    }

}
