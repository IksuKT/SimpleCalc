import java.util.*;
public class ArithOper {
    String op;
    int op1;
    int op2;
    boolean romaDigits = false;
    ArithOper(String op, String op1, String op2) {
        this.op = op;
        if (isRomaDigits(op1, op2)) {
            convertRomaToArab(op1, op2);
            romaDigits = true;
        } else {
            this.op1 = Integer.parseInt(op1);
            this.op2 = Integer.parseInt(op2);
        }

    }

    public int getResult() {
        int res = 0;
        switch (this.op) {
            case "+": res = this.op1 + this.op2; break;
            case "-": res = this.op1 - this.op2; break;
            case "*": res = this.op1 * this.op2; break;
            case "/": res = this.op1 / this.op2; break;

        }
        return res;
    }

    public  boolean isRomaDigits(String op1, String op2) {
        String rd = "(I|II|III|IV|V|VI|VII|VIII|IX|X)";
        if (op1.matches(rd)&&op2.matches(rd)) return true;
        return false;
    }

    public  boolean isArabDigits(String op1, String op2) {
        String ad = "([1-9]|10)";
        if (op1.matches(ad)&&op2.matches(ad)) return true;
        return false;
    }

    public void convertRomaToArab(String o1, String o2) {
        switch (o1) {
            case "I":  this.op1 = 1; break;
            case "II":  this.op1 = 2; break;
            case "III":  this.op1 = 3; break;
            case "IV":  this.op1 = 4; break;
            case "V":  this.op1 = 5; break;
            case "VI":  this.op1 = 6; break;
            case "VII":  this.op1 = 7; break;
            case "VIII":  this.op1 = 8; break;
            case "IX":  this.op1 = 9; break;
            case "X":  this.op1 = 10; break;
        }

        switch (o2) {
            case "I":  this.op2 = 1; break;
            case "II":  this.op2 = 2; break;
            case "III":  this.op2 = 3; break;
            case "IV":  this.op2 = 4; break;
            case "V":  this.op2 = 5; break;
            case "VI":  this.op2 = 6; break;
            case "VII":  this.op2 = 7; break;
            case "VIII":  this.op2 = 8; break;
            case "IX":  this.op2 = 9; break;
            case "X":  this.op2 = 10; break;
        }

    }

    public String convertArabToRoma(int num) {
        String str = "";
        switch (num) {
            case 1: str = "I";
            case 2: str = "II";
            case 3: str = "III";
            case 4: str = "IV";
            case 5: str = "V";
            case 6: str = "VI";
            case 7: str = "VII";
            case 8: str = "VIII";
            case 9: str = "IX";
            case 10: str = "X";
        }
        return str;
    }

    private static final NavigableMap<Integer, String> units;
    static {
        NavigableMap<Integer, String> initMap = new TreeMap<>();
        initMap.put(100, "C");
        initMap.put(90, "XC");
        initMap.put(50, "L");
        initMap.put(40, "XL");
        initMap.put(10, "X");
        initMap.put(9, "IX");
        initMap.put(5, "V");
        initMap.put(4, "IV");
        initMap.put(1, "I");
        units = Collections.unmodifiableNavigableMap(initMap);
    }
    public String intToRoman(int number) {
        if (number >= 4000 || number <= 0)
            return null;
        StringBuilder result = new StringBuilder();
        for(Integer key : units.descendingKeySet()) {
            while (number >= key) {
                number -= key;
                result.append(units.get(key));
            }
        }
        return result.toString();
    }




}
