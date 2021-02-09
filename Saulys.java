import java.util.Scanner;

public class Saulys {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);;
        System.out.print("Kiek kartų šaus šaulys?: ");
        int n = rd.nextInt();
        
        //gauna ir patalpina o koord. i masyva.  
        System.out.print("Įveskite taikinio centro kordinates xo ir yo (atskirta tarpu): ");
        rd.nextLine();
        String tmp = rd.nextLine();
        String[] tmp2 = tmp.split(" ");
        int[] o = new int[2];
        for(int i = 0; i<2; i++) {
            o[i] = Integer.parseInt(tmp2[i]);
        }


        //gauna ir patalpina i du atskirus masyvus visus x ir y.
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i<n; i++) {
            System.out.print((i + 1) + "-ojo šūvio kordinatės x ir y (atskirta tarpu): ");
            tmp = rd.nextLine();
            tmp2 = tmp.split("\\s+");
            x[i] = Integer.parseInt(tmp2[0]);
            y[i] = Integer.parseInt(tmp2[1]);
        }
        rd.close();

        //apskaiciuoja taskus
        int points = 0;
        for(int i=0; i<n; i++) {
            double dist = Metodai.pyth(x[i]-o[0], y[i]-o[1]);
            if(dist < 5) {
                points += 10;
            } else if (dist < 11) {
                points += 5;
            }
        }

        System.out.printf("Šaulys gaus %d taškus(-ų)", points);
    }
}
