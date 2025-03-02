package StudentSearchSort;

import javax.swing.JOptionPane;

public class StudentInfo {
    String id;
    String name;
    char sex;
    int age;
    String major;
    float avg;
    String inputString(String str){
        return JOptionPane.showInputDialog(null, str);
    }
    void inputData(){
        id = inputString("Enter ID : ");
        name = inputString("Enter Name : ");
        sex = inputString("Enter Sex : ").charAt(0);
        age = Integer.parseInt(inputString("Enter Age : "));
        major = inputString("Enter Major : ");
        avg = Float.parseFloat(inputString("Enter Average : "));
    }
    static void outputData(StudentInfo str){
        JOptionPane.showMessageDialog(null,str);
    }
    String getResult(){
        String result =(id+"    "+name+"    "+sex+
                "     "+age+"   "+major+"    "+avg+'\n');
        return result;
    }
    static void searchByname(StudentInfo s[],String key){
        String result="";
        for(int i=0;i<s.length;i++){
            if(s[i].name.compareToIgnoreCase(key)==0){
                result+=s[i].getResult();
            }
        }
        if(result.isEmpty())
            result="Search Not found";
        JOptionPane.showMessageDialog(null,result);
    }
    public static void main(String[] args) {
        int n;
        String key;
        String result="";
        n=Integer.parseInt(JOptionPane.showInputDialog("Enter Number of Students : "));
        StudentInfo[] stu=new StudentInfo[n];
        for(int i=0;i<n;i++){
            stu[i]=new StudentInfo();
            stu[i].inputData();
        }
        key=JOptionPane.showInputDialog("Enter Name to Search : ");
        searchByname(stu,key);
    }
}

