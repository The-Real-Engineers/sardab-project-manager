package code;

public class Employee {
    int e_id;
    String first_name;
    String last_name;
    int salary_per_month;
    String profession;

    public Employee(int e_id, String first_name, String last_name, int salary_per_month, String profession) {
        this.e_id = e_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.salary_per_month = salary_per_month;
        this.profession = profession;
    }

    @Override
    public String toString() {
        return  e_id + first_name + '\''
                + last_name + '\''
                 + salary_per_month
                + profession + '\'' +
                '}';
    }

    public int getE_id() {
        return e_id;
    }

    public void setE_id(int e_id) {
        this.e_id = e_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getSalary_per_month() {
        return salary_per_month;
    }

    public void setSalary_per_month(int salary_per_month) {
        this.salary_per_month = salary_per_month;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }


}
