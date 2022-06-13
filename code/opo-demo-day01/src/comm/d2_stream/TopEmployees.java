package comm.d2_stream;

public class TopEmployees {
    private String name;
    private double money;

    public String getName() {
        return name;
    }

    public TopEmployees() {
    }

    public TopEmployees(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TopEmployees{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
