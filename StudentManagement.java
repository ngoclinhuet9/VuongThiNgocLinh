import java.util.ArrayList;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


public class StudentManagement {
    static ArrayList<Student> studentList = new ArrayList<Student>(100) ;

    static boolean sameGroup(Student s1, Student s2){
        if(s1.GetGroup().equals(s2.GetGroup()))
            return TRUE;
        else   return FALSE;


    }
    public static void main(String[] args){
        Student Stu1 = new Student();
        Student Stuex1 = new Student();
        Student Stuex2 = new Student("Linh","0861","a@gmail.com");
        Student Stuex3 = new Student(stu1);
        Student Stu2 = new Student();
        Stu1.SetName("Vuong Ngoc Linh");
        Stu1.SetGroup("K62UET");
        Stu1.SetMSV("17020861");
        Stu1.SetEmail("vuongngoclinh9@gmail.com");

        System.out.println("Ten :");
        Stu1.GetName();
        System.out.println("Thong tin : ");
        Stu1.GetInfor();

/*        Stuex1.SetName("Student");
        Stuex1.SetGroup("K59CB");
        Stuex1.SetMSV("0000");
        Stuex1.SetEmail("uet@vnu.edu.vn");
        Stuex1.GetInfor();

        Stuex2.SetGroup("K62UET");
        Stuex2.GetInfor();
        Stuex3.GetInfor();
*/
        Stu2.SetName("Vuong Ngoc Linh 1");
        Stu2.SetGroup("K62UET");
        Stu2.SetMSV("17020862");
        Stu2.SetEmail("vuongngoclinh@gmail.com");

        Student Stu = new Student("A","0861","a@gmail.com");
        Stu.SetGroup("K62UET");
        studentList.add(Stu);
        Student Stu3 = new Student("B","0862","b@gmail.com");
        Stu3.SetGroup("K59UET");
        studentList.add(Stu3);
        Student Stu4 = new Student("C","0863","c@gmail.com");
        Stu4.SetGroup("K62UET");
        studentList.add(Stu4);
        Student Stu5 = new Student("D","0864","d@gmail.com");
        Stu5.SetGroup("K63UET");
        studentList.add(Stu5);

        boolean same ;
        same = sameGroup(Stu1,Stu2);
        System.out.println("Hai sinh vien :");
        if(same == TRUE) System.out.println("Cung Group");
        else   System.out.println("Khac Group");

        same = sameGroup(Stu1,Stuex1);
        System.out.println("Hai sinh vien :");
        if(same == TRUE) System.out.println("Cung Group");
        else   System.out.println("Khac Group");

        studentsByGroup();
        removeStudent("0861");
        System.out.println("DANH SACH SINH VIEN SAU KHI DA XOA");

        for(int i = 0; i < studentList.size(); i++)
        {
            studentList.get(i).GetInfor();
        }

    }
    public static void studentsByGroup(){
        ArrayList<String> groupList = new ArrayList<String>(100);
        boolean[] checkGroup = new boolean[100];
        for(int i = 0; i <studentList.size();i++)
            groupList.add(studentList.get(i).GetGroup());
        for(int i = 0; i <studentList.size();i++)
            checkGroup[i] = false ;
        for (int i = 0; i <groupList.size();i++){
            if(checkGroup[i] == false) System.out.println("danh sach Group "+groupList.get(i));
            for(int j = i;j <groupList.size();j++){
                if((studentList.get(j).GetGroup() == studentList.get(i).GetGroup())&&(checkGroup[j] == false)){
                    System.out.println(studentList.get(j).GetName());
                    checkGroup[j] = true;
                }
            }
        }
    }
    public static void removeStudent(String id){
        for(int i = 0; i< studentList.size();i++){
            if(studentList.get(i).GetMSV() == id)
                studentList.remove(i);
        }
    }

}