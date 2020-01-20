package Serialize;

import java.io.Serializable;

class User implements Serializable{
    private String name;
    private transient String password; // �н������ ���Ȼ� ������ ����ȭ���� ����
    public int age;
    
    public User(String name,String password, int age) {
        this.name=name;
        this.password=password;
        this.age=age;
    }
    
    public String toString() {
        return "("+name+", "+password+", "+age+")";
    }
    
}