    public class Objects {

        public static void main(String[] args) {


            Media movie1 = new Media("daytime", "The Player", "Action", new String[]{"Bharat  Nalluri"}, "43 mints");
            Media movie2 = new Media(" nighttime", "Chosen", "Action", new String[]{"Ben Ketai"}, "44 mints");
            Media movie3 = new Media("BEATS");
            System.out.println(movie1.getDirectors());
            System.out.println(movie1.isAdvertisingAllowed());

            System.out.println(movie3.getTitle());

            Users john = new Users("john", "Smith", "j2020hn#", "J2020@gmail.com", "1233 6578 2456 5667");
            Users mark = new Users("Mark", "Anderson", "Ma20@gmail.com");

            System.out.println(mark.getEmail());

            System.out.println(john.getAnnualFee());
           john.setAnnualFee(10.00);
            john.setAnnualFee(7.00);

            System.out.println(john.getAnnualFee());
           john.AnnualFee(12,15.00);
            System.out.println(john.getAnnualFee());

        }
    }