package cn.com.scitc.webapptest1.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
public class Course {
    private int id;
    private String name;
    private BigDecimal courseScore;
    private int courseTime;
    private String courseType;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "courseScore")
    public BigDecimal getCourseScore() {
        return courseScore;
    }

    public void setCourseScore(BigDecimal courseScore) {
        this.courseScore = courseScore;
    }

    @Basic
    @Column(name = "courseTime")
    public int getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(int courseTime) {
        this.courseTime = courseTime;
    }

    @Basic
    @Column(name = "courseType")
    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return id == course.id &&
                courseTime == course.courseTime &&
                Objects.equals(name, course.name) &&
                Objects.equals(courseScore, course.courseScore) &&
                Objects.equals(courseType, course.courseType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, courseScore, courseTime, courseType);
    }
}
