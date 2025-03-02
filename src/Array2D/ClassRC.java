package Array2D;



public class ClassRC {
    public static void main(String[] args) {
        String [][] names = {
                {},
                {"Roth","Wining","Chou"},
                {"Visal","Khemrak","Rotha"},
                {"Chheang Pheak"},
                {"That Virak"}
        };
        for(int i=0;i<names.length;i++){
            System.out.print("Row: " + (i+1) + " | ");
            for(int j=0;j< names[i].length;j++){
                System.out.print(names[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
