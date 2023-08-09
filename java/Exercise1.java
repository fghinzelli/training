class Exercise1 {
    public int solution(int number) {
        int total = 0;
        for (int i=0; i<number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                total += i;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        if (new Exercise1().solution(10) == 23) { 
            System.out.println("Test Passed");
        } else {
            System.out.println("Failed");
        }
    }
}