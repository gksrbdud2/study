package Serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
	
	public static void doSerializable() {
		try {
		  FileOutputStream fos = new FileOutputStream("user");
		  ObjectOutputStream oos = new ObjectOutputStream(fos);
		  
		  User user=new User("name","1234",20);
		  
		  oos.writeObject(user);//usr 객체 직렬화
		  
		  System.out.println("직렬화 수행!");
		  oos.close();
		}catch(Exception ex)
		{
		ex.printStackTrace();
		}
	}
	
	public static Object undoSerializable() throws IOException, ClassNotFoundException{
	    
        FileInputStream fis = new FileInputStream("user");
        ObjectInputStream in=new ObjectInputStream(fis);
        
        User user=(User)in.readObject();//객체 역직렬화
        
        System.out.println(user.toString());//출력
        in.close();
        return user;
    
	}

	public static void main(String[] args) throws ClassNotFoundException, IOException {   
        doSerializable();
        undoSerializable();
    
    }

}
