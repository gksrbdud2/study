package Serialize;

import java.io.Serializable;

class User implements Serializable{
    private String name;
    private transient String password; // 패스워드는 보안상 문제로 직렬화하지 않음
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