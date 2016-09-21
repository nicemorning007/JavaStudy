package javast;
//78127398127
import java.util.*;
import java.util.Map.*;

class MyComparator implements Comparator<String> {

	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}

}

public class C07_Q03 {
	public static void main(String[] args) {
		TreeMap<String, String> treeMap = new TreeMap<String, String>(new MyComparator());
		treeMap.put("1", "Lucy");
		treeMap.put("2", "John");
		treeMap.put("3", "Smith");
		treeMap.put("4", "Aimee");
		treeMap.put("5", "Amanda");
		Set<Entry<String, String>> eSet = treeMap.entrySet();// 获取键集合
		Iterator<Entry<String, String>> iterator = eSet.iterator();// 获取Iterator对象
		System.out.print("排序后： ");
		while (iterator.hasNext()) {
			Map.Entry<String, String> entry = (Map.Entry<String, String>) (iterator.next());// 强制转换
			Object key = entry.getKey();
			System.out.print(treeMap.get(key) + " ");
		}

	}
}
