package School.Database;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Student DataBase")
public class StudentData {
    @Id
    @Column(name ="ID")
    @GeneratedValue
    private int id;
    @Column(name = "Student Name")
    private String name;
    @Column(name = "Sex")
    private String sex;
    @Column(name = "Email")
    private String email;
    @Column(name = "Date of Birth")
    private LocalDate dob;

    public StudentData(){}

    public StudentData(int id, String name, String sex, String email, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.email = email;
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                '}';
    }
}
