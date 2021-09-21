package core;

public class Professor extends Human {
    private int profID;

    public Professor(int profID, String lname, String fname) {
        super(lname, fname);
        this.profID = profID;
    }

    public Professor() {
    }

    public int getProfID() {
        return profID;
    }

    public void setProfID(int profID) {
        this.profID = profID;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "profID=" + profID +
                "} " + super.toString();
    }
}
