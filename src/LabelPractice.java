public class LabelPractice {
    static public void main(String[] args) {
//        outter:
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                if (i == 0 && j == 2)
//                    break outter;
//                System.out.println(i + ", " + j);
//
//            }
//        }

        outter:
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++) {
                if (i == 0 && k == 2) continue outter;
                System.out.println(i + ", " + k);
            }
        }
    }
}
