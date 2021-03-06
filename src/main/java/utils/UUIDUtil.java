package utils;

import java.util.UUID;

/**
 * @Author jinlei
 * @Description
 * @Date 2019-08-28
 **/
public class UUIDUtil {

    private static char[] charDigits = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    public UUIDUtil() {
    }

    public static String getID() {
        UUID uuid = UUID.randomUUID();
        return convertToHashStr(uuid.getMostSignificantBits(), 5) + convertToHashStr(uuid.getLeastSignificantBits(), 5);
    }

    public static String convertID(String uuidStr) {
        UUID uuid = UUID.fromString(uuidStr);
        return convertToHashStr(uuid.getMostSignificantBits(), 5) + convertToHashStr(uuid.getLeastSignificantBits(), 5);
    }

    private static String convertToHashStr(long hid, int len) {
        StringBuffer sb = new StringBuffer();

        for(int i = 0; i < len; ++i) {
            char c = charDigits[(int)((hid & 255L) % (long)charDigits.length)];
            sb.append(c);
            hid >>= 6;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(UUIDUtil.getID());
        }
    }
}
