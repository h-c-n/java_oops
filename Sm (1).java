class Sm {
    String text;

    Sm(String get_text) {
        this.text = get_text;
    }

    void manipulations(){
        String value = this.text;
        System.out.println( "String Length is : " + value.length());
        System.out.println("String concatination : " +value.concat(""));
        System.out.println("Index of character 's': " + value.indexOf('s'));
        System.out.println("Character at position 5: " + value.charAt(5));
        System.out.println("Compare To 'cn': " + value.compareTo("cn"));
        System.out.println("Contains sequence 'ome': " + value.contains("ha"));
        System.out.println("EndsWith character 'r': " + value.endsWith("r"));
        System.out.println("Replace 'cn' with 'words': " + value.replace("text", "words"));
        System.out.println("Convert to LowerCase: " + value.toLowerCase());
        System.out.println("Convert to UpperCase: " + value.toUpperCase());
    }

    public static void main(String []args) {
    Sm object = new Sm("harsha cn");
    object.manipulations();
    }
}