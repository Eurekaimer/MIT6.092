class Marathon {

    public static void main (String[] arguments) {
        String[] names = {
            "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
            "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
            "Aaron", "Kate"
        };

        int[] times = {
            341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
            343, 317, 265
        };

        System.out.println("--- All Runners and Their Times ---");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + times[i] + " minutes");
        }
        //devide two parts
        System.out.println("-----------------------------------\n");

        int fastestRunnerIndex = findMinTimeIndex(times);

        if (fastestRunnerIndex != -1) {
            System.out.println("Fastest Runner:");
            System.out.println("Name: " + names[fastestRunnerIndex]);
            System.out.println("Time: " + times[fastestRunnerIndex] + " minutes\n");
        } else {
            System.out.println("Could not determine the fastest runner.\n");
        }

        int secondFastestRunnerIndex = findSecondMinTimeIndex(times);

        if (secondFastestRunnerIndex != -1) {
            System.out.println("Second Fastest Runner:");
            System.out.println("Name: " + names[secondFastestRunnerIndex]);
            System.out.println("Time: " + times[secondFastestRunnerIndex] + " minutes\n");
        } else {
            System.out.println("Could not determine the second fastest runner (or there isn't one).\n");
        }
    }

    public static int findMinTimeIndex(int[] times) {
        if (times == null || times.length == 0) {
            return -1;
        }

        int minTime = times[0];
        int minIndex = 0;

        for (int i = 1; i < times.length; i++) {
            if (times[i] < minTime) {
                minTime = times[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    //Optional part
    public static int findSecondMinTimeIndex(int[] times) {
        if (times == null || times.length < 2) {
            return -1;
        }

        int fastestRunnerIndex = findMinTimeIndex(times);
        if (fastestRunnerIndex == -1) {
            return -1;
        }
        int fastestTime = times[fastestRunnerIndex];

        int secondMinTime = Integer.MAX_VALUE;
        int secondMinIndex = -1;

        for (int i = 0; i < times.length; i++) {
            if (times[i] != fastestTime && times[i] < secondMinTime) {
                secondMinTime = times[i];
                secondMinIndex = i;
            }
        }
        
        return secondMinIndex;
    }
}