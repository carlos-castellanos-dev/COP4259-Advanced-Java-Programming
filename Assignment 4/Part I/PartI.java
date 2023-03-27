
public class PartI {
	
	public static void findAllOccurrences (Comparable[] array, Comparable target) {
		
	int start = 0;
	int end = array.length - 1;
	int mid = 0;

	while (start <= end) {
		mid = (start + end) / 2;
		if (array[mid].compareTo(target) == 0) {
			break;
			}
		else if (array[mid].compareTo(target) < 0) {
			start = mid + 1;
			}
		else {
			end = mid - 1;
			}
		}
	if (start > end) {
	System.out.println("[" + -1 + ", " + -1 + "]");
	}
	else {
		int first = mid;
		int last = mid;
		while ((first - 1) >= 0 && array[first - 1].compareTo(target) == 0) {
			first--;
			}
		while ((last + 1) < array.length && array[last + 1].compareTo(target) == 0) {
			last++;
			}
		System.out.println("[" + first + ", " + last + "]");
		}
	}
	
	public static void main(String args[]) {
		findAllOccurrences(new String[]{"apple", "banana", "banana", "banana", "banana", "banana", "banana", "kiwi", "watermelon"}, "banana");
		findAllOccurrences(new String[]{"apple", "banana", "banana", "banana", "banana", "banana", "banana", "kiwi", "watermelon"}, "apple");
		findAllOccurrences(new String[]{"apple", "banana", "banana", "banana", "banana", "banana", "banana", "kiwi", "watermelon"}, "orange");
	}

}