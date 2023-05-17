package co.edu.sena.project2687351.model.repository;

import co.edu.sena.project2687351.model.User;

import java.sql.SQLException;

public class TestUserRepositoryImpl {
    public static void main(String[] args) throws SQLException{
        Repository<User> repository=new RepositoryImpl();
       System.out.println("==========saveObj Insert==========");//insert
        User userInsert=new User();
        userInsert.setUser_firstname("Antonia");
        userInsert.setUser_lastname("Ramirez");
        userInsert.setUser_email("aar@gmail.com");
        userInsert.setUser_password("1234");
        repository.saveObj(userInsert);

        System.out.println("==========ListAllObj==========");//insert
        repository.listAllObj().forEach(System.out::println);
        System.out.println();
        System.out.println("==========byIdObj==========");//insert
        System.out.println(repository.byIdObj(1));
        System.out.println();

        System.out.println("==========saveObj==========");//insert
        User userUpdate = new User();
        userUpdate.setUser_id(2);
        userUpdate.setUser_firstname("Camilo");
        userUpdate.setUser_lastname("palacios");
        userUpdate.setUser_email("cp@gmail.com");
        userUpdate.setUser_password("125678");
        repository.saveObj(userInsert);
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("==========deleteObj==========");//insert
        repository.deleteObj(2);
        repository.listAllObj().forEach(System.out::println);
    }
}
