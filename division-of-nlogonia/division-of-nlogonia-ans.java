import java.util.*;

class Main {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);

    while (in.hasNextLine()) {
      
      int queries = in.nextInt();
      if (queries==0) {break;}

      int divX = in.nextInt();
      int divY = in.nextInt();

      for (int i=0; i<queries; i++) {
        int checkX = in.nextInt();
        int checkY = in.nextInt();

        // On one of the division lines
        if (checkX==divX || checkY==divY) {
          System.out.println("divisa");
        } else {
          
          // NW
          if (checkX<divX && checkY>divY) {
            System.out.println("NO");
          }
          // NE
          else if (checkX>divX && checkY>divY) {
            System.out.println("NE");
          }
          // SW
          else if (checkX<divX && checkY<divY) {
            System.out.println("SO");
          }
          // SE
          else if (checkX>divX && checkY<divY) {
            System.out.println("SE");
          }
        }
      }
    }

    in.close();

  }
}