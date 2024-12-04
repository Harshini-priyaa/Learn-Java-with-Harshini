public class StringTest{
    static public void main(String[] args){
        String str = "KGiSL Coimbatore";
        System.out.println(str.length());
        System.out.println(str.charAt(2));
        System.out.println(str.indexOf('o'));
        System.out.println(str.lastIndexOf('o'));


        System.out.println(str.replace('o', '@'));
        System.out.println(str.replaceAll("KGiSL", "Engineering College"));

        System.out.println(str.replaceAll("[a-z]", "*")); //supports regular expression
        System.err.println(str.replace("[a-z]", "*")); //does not support RE
    }
}