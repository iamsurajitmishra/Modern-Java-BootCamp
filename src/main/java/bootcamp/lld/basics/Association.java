package bootcamp.lld.basics;

public class Association {
    public static void main(String[] args) {
        DOB dob = new DOB();
        dob.setDay(10);
        dob.setMon(12);
        dob.setYear(1992);
        Customer c1 = new Customer();
        c1.setDob(dob);
        c1.setId(100000000);
        c1.setAccountNo("1234567890");
        c1.setFirstName("Surajit");
        c1.setSecondName("Mishra");


        System.out.println(c1);

    }


}



class Customer {
    private Long id;
    private String firstName;
    private String secondName;

    private String accountNo;
    private DOB dob;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public DOB getDob() {
        return dob;
    }

    public void setDob(DOB dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", accountNo='" + accountNo + '\'' +
                ", dob=" + dob +
                '}';
    }
}


class DOB{
    private int day;
    private int mon;
    private int year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMon() {
        return mon;
    }

    public void setMon(int mon) {
        this.mon = mon;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "DOB{" +
                "day=" + day +
                ", mon=" + mon +
                ", year=" + year +
                '}';
    }
}