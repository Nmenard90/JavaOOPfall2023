// Class to represent a household with specific attributes
public class HouseHold {
    private int id;
    private double income;
    private int members;
    private String state;

    // Constructor to initialize household attributes
    public HouseHold(int id, double income, int members, String state) {
        this.id = id;
        this.income = income;
        this.members = members;
        this.state = state;
    }

    // Getter methods for household attributes
    public int getId() {
        return id;
    }

    public double getIncome() {
        return income;
    }

    public int getMembers() {
        return members;
    }

    public String getState() {
        return state;
    }
}
