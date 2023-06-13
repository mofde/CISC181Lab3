package cisc181.lab_3;
//Cell phone that contains the owner's name, phone number, ringtone and a 'do not disturb' property.
public class CellPhone {
    private String OwnerName;
    private String PhoneNumber;
    private String RingTone;
    private boolean DoNotDisturb;
    public CellPhone(String OwnerName, String PhoneNumber) {
        this.OwnerName = OwnerName;
        this.PhoneNumber = PhoneNumber;
        this.RingTone = "beep";
        this.DoNotDisturb = false;
    }
    public CellPhone() {
        this("John Doe", "1234567890");
    }
    //getOwnerName gets the name of the current owner.
    public String getOwnerName() {
        return OwnerName;
    }
    //getPhoneNumber gets the current phone number.
    public String getPhoneNumber() {
        return PhoneNumber;
    }
    //getRingTone gets the current ring tone.
    public String getRingTone() {
        return RingTone;
    }
    //isDoNotDisturb gets the current true or false statement about Do Not Disturb.
    public boolean isDoNotDisturb() {
        return DoNotDisturb;
    }
    //setDoNotDisturb sets the corresponding DoNotDisturb attribute to the DoNotDisturb value
    // passed to the method.
    public boolean setDoNotDisturb(boolean DoNotDisturb) {
        return this.DoNotDisturb = DoNotDisturb;
    }
    //setRingTone sets the corresponding RingTone attibute to the RingTone value passed to the
    //method.
    public String setRingTone(String RingTone) {
        return this.RingTone = RingTone;
    }
    //incomingCall displays the value of the ringtone if the do not disturb property is false,
    //otherwise this method should display "shhh" representing quiet mode.
    public void incomingCall() {
        if (!DoNotDisturb) {
            System.out.print(RingTone);
        }
        else {
            System.out.print("shhh");
        }
    }
    //main creates an instance of the CellPhone class with the name 'Sue' and phone number set to
    //'888-999-0000'.
    public static void main(String[] args) {
        CellPhone phone1 = new CellPhone("Sue", "888-999-0000");
        phone1.setRingTone("Reflection");
        phone1.incomingCall();
        phone1.setDoNotDisturb(true);
        phone1.incomingCall();
        phone1.toString();
    }
    //toString adds a statement to main that prints phone1.
    public String toString() {
        return "Phone Owner : " + this.OwnerName + " , Number : " + this.PhoneNumber;
    }
}
