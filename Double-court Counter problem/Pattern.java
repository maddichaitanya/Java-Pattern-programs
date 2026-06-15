class Pattern {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 0; i < n; i++) {

            // spaces
            for (int s = 0; s < i; s++) {
                System.out.print("   ");
            }

            for (int j = i; j < n; j++) {

                char ch1 = (char) ('A' + i + j);
                char ch2 = (char) ('O' - j + i);

                System.out.print("" + ch1 + ch2 + " ");
            }

            System.out.println();
        }
    }
}