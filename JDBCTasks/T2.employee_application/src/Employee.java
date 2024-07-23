public class Employee {
    private String firstName;
    private String lastName;
    private String sex;
    private int age;
    private String address;
    private String phoneNumber;
    private int vacationBalance;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getVacationBalance() {
        return vacationBalance;
    }

    public void setVacationBalance(int vacationBalance) {
        this.vacationBalance = vacationBalance;
    }

    public Employee(String firstName, String lastName, String sex, int age, String address, String phoneNumber, int vacationBalance) {
        setFirstName(firstName);
        setLastName(lastName);
        setSex(sex);
        setAge(age);
        setAddress(address);
        setPhoneNumber(phoneNumber);
        setVacationBalance(vacationBalance);
    }

    public Employee(String firstName, String lastName, String sex, int age, String address, String phoneNumber) {
        setFirstName(firstName);
        setLastName(lastName);
        setSex(sex);
        setAge(age);
        setAddress(address);
        setPhoneNumber(phoneNumber);
        setVacationBalance(-1);
    }

    public Employee(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }
}