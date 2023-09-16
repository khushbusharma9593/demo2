
public class StringPractice {
    static StringPractice stringPractice = new StringPractice();//non static//
    static String one = "PHP Excercises and";
    static String two = "Python Excercises";
    static String three = one.concat(" " + two);
    static String a = "Stephen Edwin King";
    static String b = "Walter Winchell";
    static String c = "Red is favourite color";
    static String d = "Orange is also my favorite color";
    static String e = "The quick brown fox jumps over the lazy dog";
    static String f = "Rajesh Moradia";

    public void name() {
        System.out.println('1'+". "  + three);
    }
    public static void main(String[] args) {
        stringPractice.name();
        System.out.println('2'+"."+" Specified sequence of char values:and " + three.contains("and"));

        stringPractice.price3();
        System.out.println('5'+"."+" Python Exercises"+  " ends with " +" se "+" ? "+
                two.endsWith("se"));
        System.out.println("   Python Exercise" +" ends with "  +" se "+" ? "+
                two.endsWith("es"));

        System.out.println("6" +"." + " Stephen Edwin King" +" equals " +" Walter Winchell" +" ? "+ a.equals(b)
        );
        System.out.println("   Stephen Edwin King" +" equals " + " stephen edwin king " + " ? " + a.equals(a)
        );

        String input = "Rajesh34 patel45 2345988 London";
        String digits = input.replaceAll("[^0-9.]","");
        System.out.println('7'+"."+ " Old :" + "Rajesh34 patel45 2345988 London");
        System.out.println( "   NEW:" +digits) ;

        String str= "example.com";
        int len = str.length();
        System.out.println('8'+"."+" The string length of 'example.com' is: 11");

        System.out.println('9'+"."+" Red is favorite color. starts with Red"+" ? "+c.startsWith("Red"));
        System.out.println("   Orange is also my favorite color. starts with Red"+" ? "+d.startsWith("Red"));


        System.out.println("10"+"."+" OLD:"+" The quick brown fox jumps over the lazy dog");
        System.out.println("    NEW: "+ e.substring(10,26));

        System.out.println("11"+"."+" Old : Rajesh Moradia");
        System.out.println("   NEW: " + f.replace('a','T'));


    }
 String  price1= "$30.00";
    String price2 = "$20.00";
    public void price3(){
        System.out.println('3'+"."+" OLD:" +" "+ price1 +" are not equal to "+ price2);
        System.out.println('4'+"."+" NEW:" +" "+ price1.replaceAll("[$,]", "" )+ " are not equal to "+ price2.replaceAll("[$,]", ""));
    }

}




