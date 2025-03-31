package NivelBasico;

public class Array {
    public static void main(String[] args) {
        String[] ninja = new String[3];
        ninja[0] = "Naruto";
        ninja[1] = "Sasuke";
        ninja[2] = "Sakura";

        //Reescrevendo o Array
        /*

        Quando a gente reescreve um Array, o Array anterior que tinhamos é descartado da memoria
        então fazendo com que o array que está sendo escrito a partir de agora, sobreescreva o
        array anterior.

         */

    ninja = new String[7];
        ninja[0] = "Hashirama Senju";
        ninja[1] = "Tobirama Senju";
        ninja[2] = "Hiruzen Sarutobi";
        ninja[3] = "Minato Namikaze";
        ninja[4] = "Tsunade";
        ninja[5] = "Kakashi Hatake";
        ninja[6] = "Naruto Uzumaki";
        System.out.println(ninja[3]);

        for (int i = 0; i < 7 ; i++) {
            System.out.println(ninja[i]);
        }

        //Reescrevendo a variavel String
        String Ninja = "Naruto Uzumaki"; //Terminal = Ninja = Naruto Uzumaki...
        Ninja = "Sasuke Uchiha"; //Terminal = Ninja agora valerá "Sasuke Uchiha"...


    }
}
