public class Student {
    private String Name;
    private String EstonianPersonalID;
    private int AdmissionYear;
    private String OriginCountry;
    private String Address;
    private int AccountNumber;
    private int PhoneNumber;
    private String CurriculumName;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEstonianPersonalID() {
        return EstonianPersonalID;
    }

    public void setEstonianPersonalID(String estonianPersonalID) {
        EstonianPersonalID = estonianPersonalID;
    }

    public int getAdmissionYear() {
        return AdmissionYear;
    }

    public void setAdmissionYear(int admissionYear) {
        AdmissionYear = admissionYear;
    }

    public String getOriginCountry() {
        return OriginCountry;
    }

    public void setOriginCountry(String originCountry) {
        OriginCountry = originCountry;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        AccountNumber = accountNumber;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getCurriculumName() {
        return CurriculumName;
    }

    public void setCurriculumName(String curriculumName) {
        CurriculumName = curriculumName;
    }

    public Student(String name, String EstonianPersonalID, int admissionYear, String OriginCountry, String Address, int AccountNumber, int PhoneNumber, String CurriculumName ) {
        Name = name;
        EstonianPersonalID= personalID;
        this.AdmissionYear = admissionYear;
        OriginCountry = country;
        Address = address;
        this.AccountNumber= accountNumber;
        this.PhoneNumber = phoneNumber;
        CurriculumName = curriculumName;
    }


    @java.lang.Override
    public java.lang.String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", EstonianPersonalID='" + EstonianPersonalID + '\'' +
                ", admissionYear=" + admissionYear + ", Country of Origin= " + OriginCountry + ", Address= " + Address + ", AccountNumber= " + accountNumber + ", PhoneNumber= " + phoneNumber
                + ", Curriculum= " + curriculumName +
                '}';
    }
}
