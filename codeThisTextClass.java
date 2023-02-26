public class codeThisTextClass {
    public String coder(String str){
        String result = "";
        String[] strings = new String[str.split(" ").length];
        for(int i = 0; i < strings.length; i++){
            strings[i] = str.split(" ")[i];
        }
        for(int i = 0; i < strings.length; i++){
            result += coderOnlyThis(strings[i].toCharArray()) + " ";
        }
        return result;
    }
    private static String coderOnlyThis(char[] chs){
        String result = "";
        int[] ints = new int[chs.length];
        for(int i = 0; i < ints.length; i++){
            ints[i] = (int)chs[i];
        }
        for(int i = 0; i < ints.length; i++){
            result += Integer.toBinaryString(ints[i]) + " ";
        }
        return result;
    }
    public String decoder(String str) {
        String result = "";
        char[] chars = new char[str.split(" ").length];
        for(int i = 0; i < chars.length; i++){
            try {
                chars[i] = (char)Long.parseLong(str.split(" ")[i].trim(), 2);
            }catch (NumberFormatException ex){
                continue;
            }
        }
        for(int i = 0; i < chars.length; i++){
            result += chars[i] + " ";
        }
        return result;
    }
}
