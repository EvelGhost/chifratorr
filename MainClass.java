public class MainClass {
    public static void main(String[] args){
        codeThisTextClass cttc = new codeThisTextClass();
        String plainText = "Hello world!";
        String codered = cttc.coder(plainText);
        System.out.println(codered);
        System.out.println("-----------------------");
        System.out.println(cttc.decoder(codered));
    }
}
