package cn.com.scitc.consolapp;

import cn.com.scitc.consolapp.dao.StudentDao;
import cn.com.scitc.consolapp.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsolappApplication implements CommandLineRunner {
@Autowired private  StudentDao studentDao;
public static void main(String[] args) {
    SpringApplication.run(ConsolappApplication.class, args);
}
@Override
        public  void run(String... args) throws Exception{
    Iterable<Student> list = studentDao.findAll();

    System.out.println("id\tname\tmobile");
    for (Student student : list) {
        System.out.println(student.getId() + "\t" + student.getName() + "\t" + student.getMobile());
    }
}

}
