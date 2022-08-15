public class TopSecretInfo {
    private final static String CIPHERED_MESSAGE = "bI^I\bLM^MDGXMZ\b\u0434\u0469\u0412\u0007\u0409\u0417\u0419\b" +
            "\"\"\u0019\u0006\b\u0435\u0418\u041B\u0468\u046B\u041F\u0412\u0418\b\u001D\u001DC\bZX[\b\u0415\u0418" +
            "\bixa\b\u0000\u0419\u041D\u041F\b\u046B\u046F\u041D\u046A\u0418\b\u0469\u046A\u0468\u0410\u0414\u0410" +
            "\u0415\u041B\u0418\u0001\"\"\u001A\u0006\b\u0408\u0418\u041F\u0468\u0418\u0419\u0418\u046A\u0463\u041A" +
            "\u0418\u041D\u0414\b\u0417\u0468\u0416\u041C\u046B\u0412\u046A\u0004\b\u0412\u0416\u046A\u0416\u0468" +
            "\u0463\u0414\b\u0417\u0416\u0413\u0464\u041F\u046B\u0466\u046A\u0469\u0467\b\u0414\u0410\u0413\u0413" +
            "\u0410\u0416\u0415\u0463\b\u0413\u0466\u041C\u041D\u0411\b\u0412\u0418\u041E\u041C\u0463\u0411\b\u041C" +
            "\u041D\u0415\u0464\b\u0003\b\u0417\u0416\u0413\u0464\u041F\u046B\u041D\u0414\u0469\u0467\b\u0469\u0418" +
            "\u0414\u0410\b\uD83D\uDE6A\"\"\u001B\u0006\b\u043A\u0463\u0412\u0418\u046A\u0463\u041A\u0418\u041D\u0414" +
            "\b\u0468\u041D\u0413\u0410\u041F\u0463\b\u0412\u0418\u041E\u041C\u0463\u0411\b\u041C\u041D\u0415\u0464" +
            "\u0004\b\u0417\u0416\u0469\u046A\u0416\u0467\u0415\u0415\u0416\b\u0469\u0416\u041A\u041D\u0468\u0460" +
            "\u041D\u0415\u0469\u046A\u041A\u046B\u041D\u0414\b\u0417\u0418\u0411\u0417\u0413\u0418\u0411\u0415\b" +
            "\u0468\u0418\u041F\u0468\u0418\u0419\u0416\u046A\u0412\u0410\u0004\b\u046F\u046A\u0416\u0419\u0463\b" +
            "\u0417\u0416\u0413\u046B\u046F\u0410\u046A\u0464\b\u0465\u0415\u041C\u0416\u0468\u046C\u0410\u0415\u0463" +
            "\b\u0416\u046A\b\u0412\u0416\u0414\u0414\u0410\u046A\u0416\u041A\b\u041A\b\u0417\u0468\u0416\u041C\u041D" +
            "\"\"\u001C\u0006\b\u0408\u0418\u041F\u0468\u0418\u0419\u0418\u046A\u0463\u041A\u0418\u041D\u0414\b\u0417" +
            "\u0413\u0418\u046A\u046C\u0416\u0468\u0414\u046B\b{MZ^AKM\beM[@\u0004\b\u0417\u041D\u0468\u041D\u046D" +
            "\u0416\u041C\u0410\u0414\b\u0415\u0418\b\u0417\u0468\u0416\u041C\u041A\u0410\u0415\u046B\u046A\u046B" +
            "\u0466\b\u0414\u0410\u0412\u0468\u0416\u0469\u041D\u0468\u041A\u0410\u0469\u0415\u046B\u0466\b\u0418" +
            "\u0468\u046D\u0410\u046A\u041D\u0412\u046A\u046B\u0468\u046B\"\"\u001D\u0006\b\u043C\u041D\u0413\u0418" +
            "\u041D\u0414\b\u0434\u046B\u041F\u0463\u0412\u046B\b\u041A\b\u046A\u041D\u0413\u0410\u0412\u0418\u046D" +
            "\u0004\b\u0412\u0416\u0413\u0416\u0415\u0412\u0418\u046D\u0004\b\u046A\u041D\u0413\u041D\u046C\u0416" +
            "\u0415\u0418\u046D\u0004\b\u0410\u041B\u0468\u0416\u041A\u0463\u046D\b\u0412\u0416\u0415\u0469\u0416" +
            "\u0413\u0467\u046D\u0004\b\u0417\u0413\u0418\u0415\u0410\u0468\u046B\u041D\u0414\b\u041F\u0418\u0417" +
            "\u046B\u0469\u0412\b\u0415\u0418\b\u046B\u046A\u0466\u041B\u0418\u046D\"\"\u0435\u0418\u0417\u0410\u0460" +
            "\u0410\b\u0415\u0418\u0460\u041D\u0414\u046B\b\u0468\u041D\u0412\u0468\u046B\u046A\u041D\u0468\u046B\b" +
            "\u041A\b\u046A\u041D\u0413\u041D\u041B\u0468\u0418\u0414\bhXIZ]FG^I";
    ;


    private static class Cipher {
        private final String cipheredMessage;

        public Cipher(String cipheredMessage) {
            this.cipheredMessage = cipheredMessage;
        }

        public String uncipher(int secret) {
            return this.cipheredMessage
                    .codePoints()
                    .map(i -> i ^ secret)
                    .collect(
                            StringBuilder::new,
                            StringBuilder::appendCodePoint,
                            StringBuilder::append
                    )
                    .toString();
        }
    }

    private static int findFirstBitIndex(long n) {
        int result = 0;
        while (n > 0) {
            n >>= 1;
            result++;
        }
        return result;
    }

    public static void main(String[] args) {
        //птички напели, что ключ шифрования — индекс первого бита текущего таймстемпа
        var time = System.currentTimeMillis();
        var secret = findFirstBitIndex(time);
        var deciphered = new Cipher(CIPHERED_MESSAGE).uncipher(secret);
        System.out.println("Детали внутри:");
        System.out.println(deciphered); //вывод на русском, не забудь про кодировку
    }
}