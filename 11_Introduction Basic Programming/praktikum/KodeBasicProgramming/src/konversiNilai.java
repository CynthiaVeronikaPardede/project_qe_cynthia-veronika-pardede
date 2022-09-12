public class konversiNilai {
    public static void main (String[] args)  {
        //    nilai
        int studentScore = 80;

        //    Process: Your Solution Code Here
        if (studentScore>=80&&studentScore<=100){
            System.out.println("Nilai A");
        }
        else if (studentScore>=65&&studentScore<=79){
            System.out.println("Nilai B+");
        }
        else if (studentScore>=50&&studentScore<=64){
            System.out.println("Nilai B");
        }
        else if (studentScore>=35&&studentScore<=49){
            System.out.println("Nilai C");
        }
        else {
            System.out.println("Nilai D");
        }

        //    Output
        //    Nilai A
    }
}
