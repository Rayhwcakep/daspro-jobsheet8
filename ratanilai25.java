import java.util.Scanner;

public class ratanilai25 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int nilaiMhs=0, j=1, i=1;
        double totalNilai=0, ratanilai=0;
        
        while (i<=5) {
            System.out.println("input mahasiswa ke-" + i);
            totalNilai=0;
            for (j=1; j<=5; j++) {
                System.out.print("nilai ke-" + j + "=");
                nilaiMhs = input.nextInt();
                totalNilai += nilaiMhs;
            }
            ratanilai=totalNilai/5;
            System.out.println("rata-rata nilai mahasiswa ke" + i + " adalah: " + ratanilai);
            i++;
    }
    
}
}
