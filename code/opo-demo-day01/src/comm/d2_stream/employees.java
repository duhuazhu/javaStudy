package comm.d2_stream;

public class employees {
    private String name;
    private double salary;
    private String sex;
    private double bonus;

    public employees() {
    }

    @Override
    public String toString() {
        return "employees{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", sex='" + sex + '\'' +
                ", bonus=" + bonus +
                ", punish='" + punish + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public employees(String name, Double salary, String sex, double bonus, String punish) {
        this.name = name;
        this.salary = salary;
        this.sex = sex;
        this.bonus = bonus;
        this.punish = punish;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getPunish() {
        return punish;
    }

    public void setPunish(String punish) {
        this.punish = punish;
    }

    private  String punish;
}
