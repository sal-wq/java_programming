package ArrayLesson;

public class ArraDuplicate {
    public static void main(String[] args) {
        Integer [] ages = {22,5,8,30,20,12,32,22,20,19};
        for(int i=0;i<ages.length;i++){
            for(int j=i+1;j<ages.length-1;j++){
                if(ages[i]==ages[j]){
                    System.out.println(ages[i]);
                }
            }
        }
    }
}
