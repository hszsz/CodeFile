package cn.com.scitc.consolapp1;

import cn.com.scitc.consolapp1.dao.StudentDao;
import cn.com.scitc.consolapp1.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Consolapp1Application implements CommandLineRunner {
@Autowired private StudentDao studentDao;
    public static void main(String[] args) {
        SpringApplication.run(Consolapp1Application.class, args);
        SpringApplication.run(Consolapp1Application.class,args);
    }
    @Override
    public void run(String... args) throws  Exception{
        Iterable<Student> list = studentDao.findAll();
        System.out.println("id\tname\tmobile");
        for(Student student : list){
            System.out.println(student.getId() + "\t" + student.getName());
        }
    }

}
