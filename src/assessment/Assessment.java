package assessment;

public class Assessment {

    public static void main(String[] args) {
        Assessment as = new Assessment();
        as.permut("abc");
    }

    public void permut(String str) {
        permut("", str);
    }

    private void permut(String prefix, String str) {
        int len = str.length();
        if (len == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < len; i++) {
                permut(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, len));
            }
        }
    }
}
