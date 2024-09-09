public class String1 {
    private String unimplemented = "UNIMPLEMENTED CODE";

    public static void main(String[] args){
        String1 s = new String1();
        System.out.println(s.helloName("Bob"));  // Expected: "Hello Bob!"
        System.out.println(s.makeAbba("Hi", "Bye")); // Expected: "HiByeByeHi"
        System.out.println(s.makeTags("i", "Yay")); // Expected: "<i>Yay</i>"
        System.out.println(s.makeOutWord("<<>>", "Yay")); // Expected: "<<Yay>>"
        System.out.println(s.extraEnd("Hello")); // Expected: "lolo"
        System.out.println(s.firstTwo("Hello")); // Expected: "He"
        System.out.println(s.withoutEnd("Hello")); // Expected: "ell"
        System.out.println(s.comboString("hi", "Hello")); // Expected: "hiHellohi"
        System.out.println(s.middleThree("Candy")); // Expected: "and"
        System.out.println(s.extraFront("Hello")); // Expected: "HeHeHe"
        System.out.println(s.left2("Hello")); // Expected: "lloHe"
        System.out.println(s.hasBad("badxx")); // Expected: true
        System.out.println(s.conCat("abc", "cat")); // Expected: "abcat"
        System.out.println(s.minCat("Hello", "Hi")); // Expected: "loHi"
        System.out.println(s.withoutX("xHix")); // Expected: "Hi"
        System.out.println(s.deFront("Hello")); // Expected: "llo"
    }

    public String1() {
    }

    // Implementations of the required methods

    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2);
    }

    public String extraEnd(String str) {
        String lastTwo = str.substring(str.length() - 2);
        return lastTwo + lastTwo + lastTwo;
    }

    public String firstTwo(String str) {
        return str.length() < 2 ? str : str.substring(0, 2);
    }

    public String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    public String comboString(String a, String b) {
        return a.length() < b.length() ? a + b + a : b + a + b;
    }

    public String middleThree(String str) {
        int mid = str.length() / 2;
        return str.substring(mid - 1, mid + 2);
    }

    public String extraFront(String str) {
        String front = str.length() < 2 ? str : str.substring(0, 2);
        return front + front + front;
    }

    public String left2(String str) {
        return str.substring(2) + str.substring(0, 2);
    }

    public boolean hasBad(String str) {
        return str.startsWith("bad") || (str.length() > 1 && str.substring(1).startsWith("bad"));
    }

    public String conCat(String a, String b) {
        if (a.length() > 0 && b.length() > 0 && a.charAt(a.length() - 1) == b.charAt(0)) {
            return a + b.substring(1);
        }
        return a + b;
    }

    public String minCat(String a, String b) {
        if (a.length() > b.length()) {
            return a.substring(a.length() - b.length()) + b;
        }
        return a + b.substring(b.length() - a.length());
    }

    public String withoutX(String str) {
        if (str.length() > 0 && str.charAt(0) == 'x') {
            str = str.substring(1);
        }
        if (str.length() > 0 && str.charAt(str.length() - 1) == 'x') {
            str = str.substring(0, str.length() - 1);
        }
        return str;
    }

    public String deFront(String str) {    
        String result = "";
        if (str.length() > 0 && str.charAt(0) == 'a') {
            result += 'a';
        }
        if (str.length() > 1 && str.charAt(1) == 'b') {
            result += 'b';
        }
        if (str.length() > 2) {
            result += str.substring(2);
        } else if (str.length() == 1) {
            result += str.charAt(0);
        }
        return result;
    }
}
