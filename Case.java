package cisc181.lab_3;
//Case represents a small bookbag/handbag.
public class Case {
    protected String OwnerName;
    protected String Color;
    public Case(String OwnerName, String Color) {
        this.OwnerName = OwnerName;
        this.Color = Color;
    }
    //getOwnerName gets the name of the current owner.
    public String getOwnerName() {
        return OwnerName;
    }
    //getColor gets the current color.
    public String getColor() {
        return Color;
    }
    //main creates an instance of the Case class with the owner's name set to 'Joy' and color set
    //to 'Green'.
    public static void main(String[] args) {
        Case case1 = new Case("Joy", "Green");
        case1.toString();
    }
    //toString adds a statement that prints case1.
    public String toString() {
        return "Case Owner : " + this.OwnerName + " , Color : " + this.Color;
    }
}
