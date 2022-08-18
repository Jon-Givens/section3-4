public class Parsing01 {
    public static void main(String[] args) {
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
        String shirtPrice = "15";
        String taxRate = ".05";
        String gibberish = "asda34390ad8e890dn";
        //Parse shirtPrice and taxRate, and print the total tax
        int tax = System.out.println(Integer.parseInt(shirtPrice * taxRate));
        System.out.println(tax);
        
        //Try to parse taxRate as an int=
        Integer.parseInt(taxRate);

        //Try to parse gibberish as an int
        Integer.parseInt(gibberish);
    }
    
}
