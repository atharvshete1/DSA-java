import java.util.*;

public class ArraysList {
    public static void sum(ArrayList<Integer> list, int target) {

        int i = 0;
        int j = list.size() - 1;

        while (i < j) {
            int L1 = list.get(i);
            int L2 = list.get(j);
            int sum = L1 + L2;

            if (sum == target) {
                System.out.print("The Target is Find at : " + i + " , " + j);
                return;
            }

            else {
                if (sum < target) {
                    i++;
                } else {
                    j--;
                }
            }
        }
        System.out.println(">> Not Found <<");

    }

    public static int pivot(ArrayList<Integer> list) {
        int i = 0;
        int j = i + 1;
        while (j < list.size() - 1) {
            if (list.get(i) < list.get(j)) {
                i++;
                j++;
            } else {
                return j;
            }
        }

        return -1;

    }

    public static void sum1(ArrayList<Integer> list, int target) {
        int start = pivot(list);
        int end = start - 1;

        while (start != end) {
            int sum = list.get(start) + list.get(end);

            if (sum == target) {
                System.out.println("Index Of Target Sum is :" + start + "," + end);
                return;
            } else {
                if (sum < target) {
                    start++;
                    if (start == list.size() - 1) {
                        start = 0;
                    }
                } else {
                    end--;
                    if (end == -1) {
                        end = list.size() - 1;
                    }
                }
            }
        }
        System.out.println(">> Not Found <<");
    }

    public static void containwater(ArrayList<Integer> list1) {
        int i = 0;
        int j = list1.size() - 1;
        int max = 0;
        while (i < j) {
            int L1 = list1.get(i);
            int L2 = list1.get(j);
            int height = Math.min(L1, L2);
            int width = j - i;
            int waterLevel = height * width;
            max = Math.max(waterLevel, max);

            if (L2 < L1) {
                j--;
            } else {
                i++;
            }
        }

        System.out.print("The Max-Output of Water containg Tanker is : " + max);
    }

    public static boolean orderCheck(ArrayList<Integer> list) {
        int i = 0;
        int j = 1;
        int I1 = list.get(i);
        int I2 = list.get(j);

        if (I1 == I2) {
            i++;
            j++;
        }

        if (list.get(i) < list.get(j)) {
            i++;
            j++;
            while (i < list.size() - 1 && j < list.size()) {
                if (list.get(i) <= list.get(j)) {
                    i++;
                    j++;

                } else {
                    return false;
                }
            }
            return true;
        }

        else {
            i++;
            j++;
            while (i < list.size() - 1 && j < list.size()) {
                if (list.get(i) >= list.get(j)) {
                    i++;
                    j++;
                } else {
                    return false;
                }
            }
        }

        return true;
    }

    public static void lonely(ArrayList<Integer> list)

    {
        ArrayList<Integer> temp = new ArrayList<>();
        int i = 0;

        Collections.sort(list);

        while (i < list.size()) {
            int currnum = list.get(i);

            if (i < list.size() - 1 && currnum == list.get(i + 1) || currnum + 1 == list.get(i + 1)) {
                i = i + 2;
                continue;
            }
            if (i > 0 && currnum == list.get(i - 1) || currnum - 1 == list.get(i - 1)) {
                i++;
                continue;
            } else {
                temp.add(currnum);
                i++;
            }
        }

        System.out.print(temp);

    }

    public static void followingKey(ArrayList<Integer> list, int key) {
        HashMap<Integer, Integer> Values = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            int currNum = list.get(i);
            if (currNum == key) {
                int follower = list.get(i + 1);
                int count = Values.getOrDefault(follower, 0) + 1;
                Values.put(follower, count);
            }
        }
        int max = 0;
        int maxkey = 0;
        for (int key1 : Values.keySet()) {
            if (Values.get(key1) > max) {
                max = Values.get(key1);
                maxkey = key1;
            }
        }

        System.out.println(maxkey);

    }

    public static void beautiful(int n) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            nums.add(i);
        }

        int i = 0;
        int j = nums.size() - 1;

        Boolean check = false;
        while (i != j - 1) {
            check = false ;  
            int N1 = nums.get(i);
            int N2 = nums.get(j);
            int avrg = (N1 + N2) / 2;
            int k = i + 1;

            while (k < j) {
                int temp = 0;
                if (avrg == nums.get(k)) {
                    int index = ((k - i) < (j - k)) ? i : j;
                    // swap
                    temp = nums.get(index);
                    nums.set(index, nums.get(k));
                    nums.set(k, temp);
                    check = true;
                    break;
                }
                k++;
            }

            if (!check) {
                i++;
            }
        }

        System.out.print(nums);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        beautiful(5);
    }
}
