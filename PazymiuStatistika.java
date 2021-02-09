public class PazymiuStatistika {
    public static void main(String[] args) {
        System.out.println("Penkių pažymių skaitymas:");
        int[] pazymiai = Metodai.readGrades(5);
        Metodai.printGrades(pazymiai);
        System.out.println("\r\nDešimt atsitiktinių pažymių generacija ir atspausdinimas:");
        int[] grades = Metodai.randomGrades(10);
        Metodai.printGrades(grades);
        System.out.println("\r\nŠių pažymių vidurkis, mediana, didžiausias ir mažiausias pažymiai:");
        System.out.printf("%.2f %.2f %d %d%n", Metodai.getAvg(grades), Metodai.getMediana(grades), Metodai.getMax(grades), Metodai.getMin(grades));
        System.out.println("Teigiamų pažymių procentas:\r\n" + Metodai.getPercentage(grades));
        System.out.println("Šių pažymių histograma:");
        Metodai.printHistogram(grades);
    }
}