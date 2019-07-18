package cn.scitc.crud1.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "basicinformationclass2_en", schema = "NamingDB", catalog = "")
public class Basicinformationclass2EnEntity {
    private String name;
    private String sex;
    private String id;
    private String clazz;
    private String age;

    @Basic
    @Column(name = "Name", nullable = true, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "Sex", nullable = true, length = 255)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Id
    @Column(name = "ID", nullable = false, length = 255)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Class", nullable = true, length = 255)
    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    @Basic
    @Column(name = "Age", nullable = true, length = 255)
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basicinformationclass2EnEntity that = (Basicinformationclass2EnEntity) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(sex, that.sex) &&
                Objects.equals(id, that.id) &&
                Objects.equals(clazz, that.clazz) &&
                Objects.equals(age, that.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, id, clazz, age);
    }
}
