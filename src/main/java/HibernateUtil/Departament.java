package HibernateUtil;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "departments")
public class Departament {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String departament;
    @Column(name = "max_salary")
    private int maxSalary;
    @Column(name = "min_salary")
    private int minSalary;
    @OneToMany(mappedBy = "departament", cascade = CascadeType.ALL)
    private List<Employees> employeey;

    public Departament() {
    }

    public Departament(String departament, int maxSalary, int minSalary) {
        this.departament = departament;
        this.maxSalary = maxSalary;
        this.minSalary = minSalary;
    }

    public void setEmployeeyToDepartement(Employees emp){
        if(employeey == null){
            employeey = new ArrayList<>();
        }
        employeey.add(emp);
        emp.setDepartament(this);
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public int getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
    }

    public int getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(int minSalary) {
        this.minSalary = minSalary;
    }

    public List<Employees> getEmployeey() {
        return employeey;
    }

    public void setEmployeey(List<Employees> employeey) {
        this.employeey = employeey;
    }

    @Override
    public String toString() {
        return "Departament{" +
                "id=" + id +
                ", departament='" + departament + '\'' +
                ", maxSalary=" + maxSalary +
                ", minSalary=" + minSalary +
                '}';
    }
}
