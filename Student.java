import java.security.PublicKey;
import java.util.Scanner;

class Student {
    private String name, MSV, Group, Email;
    public Student(){
        name = "Student";
        MSV = "000";
        Group = "K59CB";
        Email = "uet@vnu.edu.com";
    }
    public Student(String n, String id, String em) {
        name = n;
        MSV = id;
        Email = em;
        Group = "K59CB";
    }
    public Student(Student s){
        name = s.name;
        MSV = s.MSV;
        Email = s.Email;
        Group = s.Group;

    }

    public void SetName(String n){
        this.name =n;

    }
    public String GetName(){

        return name;
    }
    public void SetMSV(String id){
        this.MSV = id;
    }
    public String GetMSV(){
        return MSV;
    }
    public void SetGroup(String Gr){
        this.Group = Gr;
    }
    public  String GetGroup(){
        return Group;
    }
    public void SetEmail(String mail){
        this.Email = mail;
    }
    public  String GetEmail(){
        return Email;
    }
    public void GetInfor(){
        System.out.println(name);
        System.out.println(MSV);
        System.out.println(Group);
        System.out.println(Email);
    }

}