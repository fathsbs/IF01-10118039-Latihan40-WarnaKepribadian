
import java.util.Scanner;



/*
 * NAMA              : FATAHILLAH SATRIA BIMA SENO
 * KELAS             : IF-01
 * NIM               : 10118039
 * DESKRIPSI PROGRAM : program ini berisi program yang dapat mengidentifikasi melalui warna  
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String warnaDiri;
        String nama;
        
        Scanner masuk = new Scanner(System.in);
        Warna id = new Warna();

        System.out.printf("%sYUK %sCEK %sKEPRIBADIANMU %sDARI %sWARNA %sFavoritmu%s%n",Warna.RED,Warna.GREEN,Warna.YELLOW,Warna.CYAN,Warna.PURPLE,Warna.BLUE,Warna.RESET);
        System.out.println(Warna.BGRED+Warna.WHITE+"       MERAH       ");
        System.out.println(Warna.BGGREEN+Warna.WHITE+"       HIJAU       ");
        System.out.println(Warna.BGYELLOW+Warna.WHITE+"       KUNING      ");
        System.out.println(Warna.BGBLUE+Warna.WHITE+"       BIRU        ");
        System.out.println(Warna.BGMAGENTA+Warna.WHITE+"       UNGU        ");
        
        System.out.print(Warna.RESET+"\nPILIH WARNA FAVORITMU\t: ");
        warnaDiri = masuk.nextLine();
        
        System.out.print("NAMA KAMU\t\t: ");
        nama = masuk.nextLine();
        
        System.out.printf("\n===HASIL TEST KEPRIBADIAN %s===%n",nama.toUpperCase());
        id.warnaPribadi(warnaDiri);
    }

}
