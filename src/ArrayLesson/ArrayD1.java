package ArrayLesson;

public class ArrayD1 {
    public static void main(String[] args) {
        String [] name = {"Visal","Visal","Roth","Rak","Chhieng","Rak"};
        for(int i=0;i<name.length;i++){
            for(int j=i+1;j<name.length;j++){
                if(name[i].equals(name[j])){
                    System.out.println(name[i]);
                }
            }
        }
    }
}
