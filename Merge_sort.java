import java.util.*;
class Merge_sort {
static void perform_mergesort(int arr_1[], int arr_2[], int result[], int
n, int m) {
int i = 0, j = 0, k = 0;
while (i < n && j < m) {
if (arr_1[i] < arr_2[j]) {
result[k] = arr_1[i];
i++;
} else {
result[k] = arr_2[j];
j++;
}
k++;
}
while (i < n) {
result[k] = arr_1[i];
k++;
i++;
}
while (j < m) {
result[k] = arr_2[j];
k++;
j++;
}
}
static void print_mergearray(int result[], int size) {
System.out.println("Merged array is:");
for (int i = 0; i < size; i++) {
System.out.print(result[i] + " ");
}
System.out.println();
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter size of array 1 and 2:");
int n = sc.nextInt();
int m = sc.nextInt();
int arr_1[] = new int[n];
int arr_2[] = new int[m];
int result[] = new int[n + m];
System.out.println("Enter elements of array 1:");
for (int i = 0; i < n; i++) {
arr_1[i] = sc.nextInt();
}
System.out.println("Enter elements of array 2:");
for (int i = 0; i < m; i++) {
arr_2[i] = sc.nextInt();
}
perform_mergesort(arr_1, arr_2, result, n, m);
print_mergearray(result, n + m);
sc.close();
}
}