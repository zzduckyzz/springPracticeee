package Entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")

public class Employee {
    public Employee(int id, String fullname, int age, String salary) {
        this.id = id;
        this.fullname = fullname;
        this.age = age;
        this.salary = salary;
    }

    public Employee() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "employee{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                ", age=" + age +
                ", salary='" + salary + '\'' +
                '}';
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="full_name")
    private String fullname;

    @Column(name="age")
    private int age;

    @Column(name="salary")
    private String salary;
}
