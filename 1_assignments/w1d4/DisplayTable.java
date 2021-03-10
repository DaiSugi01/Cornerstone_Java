public class DisplayTable {
  
  public static void main(String[] args) {

    System.out.println("      Multiplication Table");
    System.out.println("    1  2  3  4  5  6  7  8  9");
    System.out.println("-".repeat(30));

    final int MAX_NUM = 9;
    for (int i = 1; i <= MAX_NUM; i++) {
        System.out.print(i + " |");
        for (int j = 1; j <= MAX_NUM; j++) {
            System.out.printf("%2d ",i*j);
            if (j == MAX_NUM) {
                System.out.print("\n");
            }
        }
    }
  }

}
