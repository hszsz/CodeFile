package cn.com.scitc.dao;

import cn.com.scitc.model.User;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    public List<User> findAll(){
        String sql = " select * from student ";
        ResultSet rs = SqlHelper.executeQuery(sql,null);
        List<User> list = new ArrayList<>();
        try {
            while(rs.next()){
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setBirthday(rs.getDate("birthday"));
                list.add(user);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return  list;
    }

    public boolean update(User user){
        String sql = " update student set  name = ?, birthday = ? where id = ?";
        Object[] ps = new Object[3];
        ps[0] = user.getName();
        ps[1] = user.getBirthday();
        ps[2] = user.getId();
        SqlHelper.executeUpdate(sql, ps);

        return true;
    }
    public boolean insert(User user){
        String sql = " insert into student(id,name,birthday) values(?,?,?) " ;
        Object[] ps = new Object[3];
        ps[0] = user.getId();
        ps[1] = user.getName();
        ps[2] = user.getBirthday();
        SqlHelper.executeUpdate(sql,ps);

        return true;
    }
    public boolean deleteById(Integer id){
        String sql = " delete from student where id = ?";
        Object[] ps = new Object[1];
        ps[0] = id;
        SqlHelper.executeUpdate(sql,ps);

        return true;
    }

    public User findById(Integer id){
        String sql = " select *  from student where id = ?";
        String[] ps = new String[1];
        ps[0] = id.toString();
        ResultSet rs =  SqlHelper.executeQuery(sql,ps);
        User user = new User();
        try {
            rs.next();
            user.setId(rs.getInt("id"));
            user.setName(rs.getString("name"));
            user.setBirthday(rs.getDate("birthday"));
        }catch (Exception e){
            e.printStackTrace();
        }
        return user;
    }

}
