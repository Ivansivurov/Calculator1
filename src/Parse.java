public class Parse {
    boolean rome = false;
    public int[] toInt(String[] v) throws ParseException {
        int[] r = {0, 0};
        for (int i = 0; i < r.length; i++) {
            switch (v[i]) {
                case "I":
                    r[i] = 1;
                    break;
                case "II":
                    r[i] = 2;
                    break;
                case "III":
                    r[i] = 3;
                    break;
                case "IV":
                    r[i] = 4;
                    break;
                case "V":
                    r[i] = 5;
                    break;
                case "VI":
                    r[i] = 6;
                    break;
                case "VII":
                    r[i] = 7;
                    break;
                case "VIII":
                    r[i] = 8;
                    break;
                case "IX":
                    r[i] = 9;
                    break;
                case "X":
                    r[i] = 10;
                    break;

            }
        }
        if ((r[0] == 0 && r[1] != 0) || (r[0] != 0 && r[1] == 0)) {
            throw new ParseException("Использованы одновременно арабские и римские символы");
        }else if (r[0] == 0 && r[1] == 0) {
            try {
                r[0] = Integer.parseInt(v[0]);
                r[1] = Integer.parseInt(v[1]);
            } catch (NumberFormatException e) {
                 throw new ParseException(e.getMessage());
            }
        } else{
            rome = true;
        }

        if(r[0] <11 && r[1]<11){
            return r;}
        else{
            throw new ParseException ("Использованы слишком большие числа");
        }
    }
    public String toString(int g) throws ParseException {
        String result = "";
        if (rome == true){
            switch (g){
                case 1:
                    result= "I";
                    break;
                case 2:
                    result= "II";
                    break;
                case 3:
                    result= "III";
                    break;
                case 4:
                    result= "IV";
                    break;
                case 5:
                    result= "V";
                    break;
                case 6:
                    result= "VI";
                    break;
                case 7:
                    result= "VII";
                    break;
                case 8:
                    result= "VIII";
                    break;
                case 9:
                    result= "IX";
                    break;
                case 10:
                    result= "X";
                    break;
                case 11:
                    result= "XI";
                    break;
                case 12:
                    result= "XII";
                    break;
                case 13:
                    result= "XIII";
                    break;
                case 14:
                    result= "XIV";
                    break;
                case 15:
                    result= "XV";
                    break;
                case 16:
                    result= "XVI";
                    break;
                case 17:
                    result= "XVII";
                    break;
                case 18:
                    result= "XVIII";
                    break;
                case 19:
                    result= "XIX";
                    break;
                case 20:
                    result= "XX";
                    break;
                case 21:
                    result= "XXI";
                    break;
                case 22:
                    result= "XXII";
                    break;
                case 23:
                    result= "XXIII";
                    break;
                case 24:
                    result= "XXIV";
                    break;
                case 25:
                    result= "XXV";
                    break;
                case 26:
                    result= "XXVI";
                    break;
                case 27:
                    result= "XXVII";
                    break;
                case 28:
                    result= "XXVIII";
                    break;
                case 29:
                    result= "XXIX";
                    break;
                case 30:
                    result= "XXX";
                    break;
                case 31:
                    result= "XXXI";
                    break;
                case 32:
                    result= "XXXII";
                    break;
                case 33:
                    result= "XXXIII";
                    break;
                case 34:
                    result= "XXXIV";
                    break;
                case 35:
                    result= "XXXV";
                    break;
                case 36:
                    result= "XXXVI";
                    break;
                case 37:
                    result= "XXXVII";
                    break;
                case 38:
                    result= "XXXVIII";
                    break;
                case 39:
                    result= "XXXIX";
                    break;
                case 40:
                    result= "XL";
                    break;
                case 41:
                    result= "XLI";
                    break;
                case 42:
                    result= "XLII";
                    break;
                case 43:
                    result= "XLIII";
                    break;
                case 44:
                    result= "XLIV";
                    break;
                case 45:
                    result= "XLV";
                    break;
                case 46:
                    result= "XLVI";
                    break;
                case 47:
                    result= "XLVII";
                    break;
                case 48:
                    result= "XLVIII";
                    break;
                case 49:
                    result= "XLIX";
                    break;
                case 50:
                    result= "L";
                    break;
                case 51:
                    result= "LI";
                    break;
                case 52:
                    result= "LII";
                    break;
                case 53:
                    result= "LIII";
                    break;
                case 54:
                    result= "LIV";
                    break;
                case 55:
                    result= "LV";
                    break;
                case 56:
                    result= "LVI";
                    break;
                case 57:
                    result= "LVII";
                    break;
                case 58:
                    result= "LVIII";
                    break;
                case 59:
                    result= "LIX";
                    break;
                case 60:
                    result= "LX";
                    break;
                case 61:
                    result= "LXI";
                    break;
                case 62:
                    result= "LXII";
                    break;
                case 63:
                    result= "LXIII";
                    break;
                case 64:
                    result= "LXIV";
                    break;
                case 65:
                    result= "LXV";
                    break;
                case 66:
                    result= "LXVI";
                    break;
                case 67:
                    result= "LXVII";
                    break;
                case 68:
                    result= "LXVIII";
                    break;
                case 69:
                    result= "LXIX";
                    break;
                case 70:
                    result= "LXX";
                    break;
                case 71:
                    result= "LXXI";
                    break;
                case 72:
                    result= "LXXII";
                    break;
                case 73:
                    result= "LXXIII";
                    break;
                case 74:
                    result= "LXXIV";
                    break;
                case 75:
                    result= "LXXV";
                    break;
                case 76:
                    result= "LXXVI";
                    break;
                case 77:
                    result= "LXXVII";
                    break;
                case 78:
                    result= "LXXVIII";
                    break;
                case 79:
                    result= "LXXIX";
                    break;
                case 80:
                    result= "LXXX";
                    break;
                case 81:
                    result= "LXXXI";
                    break;
                case 82:
                    result= "LXXXII";
                    break;
                case 83:
                    result= "LXXXIII";
                    break;
                case 84:
                    result= "LXXXIV";
                    break;
                case 85:
                    result= "LXXXV";
                    break;
                case 86:
                    result= "LXXXVI";
                    break;
                case 87:
                    result= "LXXXVII";
                    break;
                case 88:
                    result= "LXXXVIII";
                    break;
                case 89:
                    result= "LXXXIX";
                    break;
                case 90:
                    result= "XC";
                    break;
                case 91:
                    result= "XCI";
                    break;
                case 92:
                    result= "XCII";
                    break;
                case 93:
                    result= "XCIII";
                    break;
                case 94:
                    result= "XCIV";
                    break;
                case 95:
                    result= "XCV";
                    break;
                case 96:
                    result= "XCVI";
                    break;
                case 97:
                    result= "XCVII";
                    break;
                case 98:
                    result= "XCVIII";
                    break;
                case 99:
                    result= "XCIX";
                    break;
                case 100:
                    result= "C";
                    break;
                default:
                    throw new ParseException("Среди римских нет отрицательных чисел");

            }
        }
        else{
            result = Integer.toString(g);}
        return result;


    }

}
