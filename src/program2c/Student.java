package program2c;
import java.util.Date;

public class Student {
    private String firstName;
    private String lastName;
    private String middleName;
    private String address;
    private Date birthDate;
    private String yearSection;

    public Student(String firstName, String lastName, String middleName, String address,  String yearSection) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.address = address;
        this.yearSection = yearSection;
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getAddress() {
        return address;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getYearSection() {
        return yearSection;
    }
    
}
