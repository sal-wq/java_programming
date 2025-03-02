package Array2D;

public class ColorValue {
    public static void main (String[] args) {
        Character [][] colorValue =
                {
                        {'A','B'},
                        {'C','D'},
                        {'E','F','G','H'}
                };
        for(int i=0;i<colorValue.length;i++){
            for(int j=0;j<colorValue[i].length;j++){
                if(j==0){
                    System.out.print("| ");
                }
                System.out.print(colorValue[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
