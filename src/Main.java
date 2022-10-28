public class Main {
    public static void main(String[] argv) {
    System.out.println("\u27a1"+"\u263B"+"\u2763");
        StringBuffer str = new StringBuffer("HeLLo WOrLd");
        System.out.println("Початковий рядок:" + str);
        int ln = str.length();
        for (int i = 0; i < ln; i++) {
            Character st = str.charAt(i);
            str.replace(i, i + 1, Character.toLowerCase(st) + "");
        }
        System.out.println("Змінений регістр: " + str.replace(0, 1, "H"));
    }
}
