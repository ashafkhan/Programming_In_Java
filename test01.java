import java.util.*;

public class test01{
    public static void sortTimes(String[] times){
        Arrays.sort(times);
    }

    public static int binarySearch(String[] times, String target){
        int l = 0;
        int r = times.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            int compare = times[mid].compareTo(target);
            if (compare == 0) {
                return mid;
            } else if (compare < 0) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] departTimes = {"12:30", "08:00", "06:45"};

        System.out.println("Original Departure:");
        for(String time : departTimes){
            System.out.println(time);
        }

        sortTimes(departTimes);
        System.out.println("\nSorted Departure:");
        for(String time : departTimes){
            System.out.println(time);
        }

        System.out.print("\nEnter the departure time to search: ");
        String target = sc.nextLine();

        int index = binarySearch(departTimes, target);

        if (index >= 0){
            System.out.println("Flight departing at " + target + " is scheduled.");
        } else {
            System.out.println("No flight departing at " + target);
        }

        sc.close();
    }
}
