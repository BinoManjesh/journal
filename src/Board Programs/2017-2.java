import java.util.Scanner;

class QuizScorer {

    int n, highestScore;
    char[][] answers;
    char[] answerKey;
    int[] scores;

    // Returns true if the input is valid
    boolean accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        n = sc.nextInt();
        if (3 < n && n < 11) {
            answers = new char[n][5];
            answerKey = new char[5];
            scores = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Participant " + (i + 1) + " ");
                for (int j = 0; j < 5; j++) {
                    answers[i][j] = sc.next().charAt(0);
                }
            }
            System.out.print("Key: ");
            for (int i = 0; i < 5; i++) {
                answerKey[i] = sc.next().charAt(0);
            }
            return true;
        } else {
            System.out.println("INPUT SIZE OUT OF RANGE.");
            return false;
        }
    }

    void calculateScores() {
        highestScore = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < 5; ++j) {
                if (answerKey[j] == answers[i][j]) {
                    scores[i]++;
                }
            }
            highestScore = Math.max(highestScore, scores[i]);
        }
    }

    void display() {
        System.out.println("Scores:");
        for (int i = 0; i < n; ++i) {
            System.out.println("Participant " + (i + 1) + " = " + scores[i]);
        }

        System.out.print("Highest score: ");
        boolean shouldSpace = false;
        for (int i = 0; i < n; ++i) {
            if (scores[i] == highestScore) {
                if (shouldSpace) {
                    System.out.print("\t\t\t   ");
                } else {
                    shouldSpace = true;
                }
                System.out.println("Participant " + (i + 1));
            }
        }
    }

    public static void main(String[] args) {
        QuizScorer obj = new QuizScorer();
        if (obj.accept()) {
            obj.calculateScores();
            obj.display();
        }
    }
}
