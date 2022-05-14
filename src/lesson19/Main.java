package lesson19;

public class Main {

    public static void main(String[] args) {
        CopyWithOneByte copyWithOneByte = new CopyWithOneByte();
        CopyWithNio copyWithNio = new CopyWithNio();
      //  CopyWithApapche copyWithApapche = new CopyWithApapche();

        long start1 = System.currentTimeMillis();
        copyWithOneByte.copy("C:\\Users\\sin_n\\Downloads\\idea.exe", "1.exe");
        long end1 = System.currentTimeMillis();
        System.out.println("копируем c copyWithOneByte "+ (end1-start1)+" - милисекунд");

        long start2 = System.currentTimeMillis();
        copyWithNio.copy("C:\\Users\\sin_n\\Downloads\\idea.exe", "2.exe");
        long end2 = System.currentTimeMillis();
        System.out.println("копируем c copyWithNio "+ (end2-start2)+" - милисекунд");

        long start3 = System.currentTimeMillis();
       // copyWithApapche.copy("C:\\Users\\sin_n\\Downloads\\idea.exe", "3.exe");
        long end3 = System.currentTimeMillis();
        System.out.println("копируем c copyWithApapche "+ (end3-start3)+" - милисекунд");

    }
}
