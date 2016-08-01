package com.learzhu.java_tests;

import com.learzhu.model.User;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author Learzhu
 * @version $Rev$
 * @time 2016/8/1 20:20
 * @des ${TODO}
 * @updateAuthor $Author$
 * @updateDate $Date$  20:20
 * @updateDes ${TODO}
 */
public class SerializableTest {
    public static void main(String args[]) {
        User user = new User(0, "Lear", true);
        try {
            /*序列化*/
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("cache.txt"));
            out.writeObject(user);
            System.out.println(user.toString());
            out.close();

            /*反序列化过程*/
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("cache.txt"));
            User newUser = (User) in.readObject();
            System.out.println(newUser.toString());
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
