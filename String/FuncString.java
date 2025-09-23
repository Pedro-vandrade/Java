package String;

public class FuncString {
    public static void main(String[] args) {
        String original = "ABCD abcd ab cd DEFG ";
        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(4);
        String s05 = original.substring(0,4);
        String s06 = original.replace('a', '7');
        String s07 = original.replace("ab", "00");
        int i = original.indexOf("cd");
        int j = original.lastIndexOf("cd");



        System.out.println("Original -"+original+"-");
        System.out.println("toLowerCase-"+ s01+"-");
        System.out.println("toUpperCase -"+ s02+"-");
        System.out.println("Trim: -"+ s03+"-");
        System.out.println("Substring: -"+ s04+"-");
        System.out.println("Substring: -"+ s05+"-");
        System.out.println("Replace: -"+ s06+"-");
        System.out.println("Replace: -"+ s07+"-");
        System.out.println("First index of : -"+ i +"-");
        System.out.println("Last index of: -"+ j +"-");

    }
}
/*
• Formatar: toLowerCase(), toUpperCase(), trim()
• Recortar: substring(inicio), substring(inicio, fim)
• Substituir: Replace(char, char), Replace(string, string)
• Buscar: IndexOf, LastIndexOf
• str.Split(" ") - Recortar string em base um separador
* */