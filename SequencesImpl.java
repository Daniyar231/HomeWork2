public class SequencesImpl implements Sequences {
    @Override
    public void printSequenceA(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i * 2+",");
        }
    }

    @Override
    public void printSequenceB(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(i * 2 + 1+",");
        }
    }

    @Override
    public void printSequenceC(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i * i+", ");
        }
    }

    @Override
    public void printSequenceD(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i * i * i+",");
        }
    }

    @Override
    public void printSequenceE(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print("1, ");
            } else {
                System.out.print("-1, ");
            }
        }
    }

    @Override
    public void printSequenceF(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i+", ");
            } else {
                System.out.print(-i+", ");
            }
        }
    }

    @Override
    public void printSequenceG(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(-i * i+", ");
            } else {
                System.out.print(i * i+", ");
            }
        }
    }

    @Override
    public void printSequenceH(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i / 2+", ");
            } else {
                System.out.print("0, ");
            }
        }
    }

    @Override
    public void printSequenceI(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
            System.out.print(fact+", ");
        }
    }

    @Override
    public void printSequenceJ(int n) {
        int prev1 = 1;
        int prev2 = 0;
        for (int i = 1; i <= n; i++) {
            int current = prev1 + prev2;
            System.out.print(current+", ");
            prev2 = prev1;
            prev1 = current;
        }
    }
}
