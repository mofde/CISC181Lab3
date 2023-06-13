package cisc181.lab_3;
//CellPhoneCase extends Case and inherits all the fields and methods from Case.
public class CellPhoneCase extends Case {
    private CellPhone phone;
    public CellPhoneCase(String OwnerName, String Color, String PhoneNumber) {
       super(OwnerName, Color);
       this.phone = new CellPhone(OwnerName, PhoneNumber);
    }
    //getCellPhone gets the current phone.
    public CellPhone getCellPhone() {
        return phone;
    }
    //quietPhone sets the do not disturb property of the phone in Case to true.
    public boolean quietPhone() {
        return this.phone.setDoNotDisturb(true);
    }
    //swapPhones swaps the CellPhones that are in the CellPhoneCases.
    public static void swapPhones(CellPhoneCase case1, CellPhoneCase case2) {
        CellPhone temp = case1.phone;
        case1.phone = case2.phone;
        case2.phone = temp;
    }
    //toString adds a statement to main that prints phone1 and phone2 before and after they were
    //swapped.
    public String toString() {
        return super.toString() + " , " + phone.toString();
    }
    //main creates two instances of the CellPhoneCase class; one with the owner named 'Tim', color
    //set to 'black' and phone number to '111-222-3333' and the second with the owner named 'Neena',
    //color set to 'blue' and phone number set to '444-555-6666'.
    public static void main(String[] args) {
        CellPhoneCase phone1 = new CellPhoneCase("Tim","black", "111-222-3333");
        CellPhoneCase phone2 = new CellPhoneCase("Neena", "blue", "444-555-6666");
        phone1.toString();
        phone2.toString();
        CellPhoneCase.swapPhones(phone1, phone2);
        phone1.toString();
        phone2.toString();
    }
}
