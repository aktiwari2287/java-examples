package practice_program;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class NextGreaterElement {

	static void findIndex(String str) {
		List<Integer> list = Arrays.stream(str.split("")).map(x -> Integer.parseInt(x)).collect(Collectors.toList());
		int i, j = 0;
		for (i = list.size() - 1; i >= 1; i--) {
			for (j = i; j >= 1; j--) {
				if (list.get(i) > list.get(j)) {
					break;
				}
			}
			if (j != 0) {
				break;
			}
		}
		if (i == 0 && j == 0) {
			System.out.println("No next element available");
		} else {
			list.add(j, list.get(i));
			list.remove(i + 1);
			List<Integer> l1 = list.subList(j + 1, list.size());
			l1.sort(null);
			List<Integer> l2 = list.subList(0, j + 1);
			l2.addAll(l1);
			System.out.println(l2.stream().map(x -> String.valueOf(x)).collect(Collectors.joining()));
		}

	}

	public static void main(String[] args) {
		Map<String,String> map = new ConcurrentHashMap<>();
		map.put("Name", "Anand");
		map.put("fg", null);
		System.out.println(map);
	}
}
