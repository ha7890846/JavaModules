abstract class Hospital{
    // these are the required , which a hospital contains...
    // But these are 
    abstract void hospitalName();
    abstract void hospitalAddress();
    abstract void emergencyWard();
    abstract void doctorList();
    abstract void patientList();
    abstract void treatment();
}
class MyHospital extends Hospital{
    public void hospitalName(){
        System.out.println("Hospital Name: My Hospital");
    }
    public void hospitalAddress(){
        System.out.println("Hospital Address: 123, Main Road, New York");
    }
    public void emergencyWard(){
        System.out.println("Emergency Ward: 1st Floor");
    }
    public void doctorList(){
        System.out.println("Doctors List: Dr. A, Dr. B, Dr. C");
    }
    public void patientList(){
        System.out.println("Patients List: Patient A, Patient B, Patient C");
    }
    public void treatment(){
        System.out.println("Treatment: Surgery, Medication, Checkup");
    }
}
public class runner {
    public static void main(String[] args) {
        MyHospital obj = new MyHospital();
        obj.hospitalName();
        obj.hospitalAddress();
        obj.emergencyWard();
        obj.doctorList();
        obj.patientList();
        obj.treatment();        
    }
}
