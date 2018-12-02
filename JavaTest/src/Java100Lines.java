import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Java100Lines {

	public static void main(String[] args) {
		
		// java代码说来说去，就是下面这几个数据的编辑。
		// 数据类型的含义你自己查一下吧，用法基本就是下面我写的这些，就够了。
		// 在空白处右键鼠标，选择「debug as」ーー＞「java application」
		// 打断点应该会吧，F6走下一步，F8跳到下个断点
		
		int a = 1; // 基本数据类型：int
		float b = 1; // 基本数据类型：float
		double c = 1.0; // 基本数据类型：double
		String d = "a,b,c,d,e"; // 基本数据类型：String
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		// 基本数据类型：数组(初期化方法1)
		String[] e = new String[5];
		e[0] = "a"; // 数组初期化
		e[1] = "b"; // 数组初期化
		e[2] = "c"; // 数组初期化
		e[3] = "d"; // 数组初期化
		e[4] = "e"; // 数组初期化
		// 数组循环打到控制台
		for (int i=0; i < e.length; i++) {
			System.out.println(e[i]);
		}

		// 基本数据类型：数组(初期化方法2)
		String[] f = d.split(",");
		// 数组循环打到控制台
		for (int i=0; i < f.length; i++) {
			System.out.println(f[i]);
		}
		
		// 基本数据类型：map
		Map<String, String> g = new HashMap<String, String>();
		g.put("key1", "value1");
		g.put("key2", "value2");
		g.put("key3", "value3");
		g.put("key4", "value4");
		g.put("key5", "value5");
		// 数组循环打到控制台
		for (String key : g.keySet()) {
			System.out.println("key:" + key + " , value:" + g.get(key));
		}
		// 指定key的value值获得
		System.out.println(g.get("key3"));

		// 基本数据类型：list
		List<String> h = new ArrayList<String>();
		h.add("a");
		h.add("b");
		h.add("c");
		h.add("d");
		h.add("e");
		// 循环的写法1
		for (int i=0; i < h.size(); i++) {
			System.out.println(h.get(i));
		}
		// 循环的写法2
		for (String val : h) {
			System.out.println(val);
		}
		// 指定index的值
		System.out.println(h.get(3));
		
		// 基本数据类型：bean
		//　学生bean,就是一个学生的信息。
		StudentBean bean = new StudentBean();
		bean.setId("1");
		bean.setName("zhangsan");
		bean.setSex("girl");
		System.out.println(bean.getId());
		System.out.println(bean.getName());
		System.out.println(bean.getSex());
		
		// 学生bean的list，就是所有学生的信息
		List<StudentBean> listBean = new ArrayList<StudentBean>();
		// 学生1的信息放到list里
		StudentBean stuBean = new StudentBean();
		stuBean.setId("1");
		stuBean.setName("zhangsan");
		stuBean.setSex("girl");
		listBean.add(stuBean);
		// 学生2的信息放到list里
		stuBean = new StudentBean();
		stuBean.setId("2");
		stuBean.setName("lisi");
		stuBean.setSex("boy");
		listBean.add(stuBean);
		// 循环输出每个学生的信息
		for (StudentBean stu : listBean) {
			System.out.println(stu.getId());
			System.out.println(stu.getName());
			System.out.println(stu.getSex());
		}
		
		// 学生map的list，就是所有学生的信息
		List<Map<String, String>> listMap = new ArrayList<Map<String, String>>();
		// 学生1的信息放到list里
		Map<String, String> map = new HashMap<String, String>();
		map.put("id", "1");
		map.put("name", "zhangsan");
		map.put("sex", "girl");
		listMap.add(map);
		// 学生2的信息放到list里
		map = new HashMap<String, String>();
		map.put("id", "2");
		map.put("name", "lisi");
		map.put("sex", "boy");
		listMap.add(map);
		// 学生2的信息放到list里
		map = new HashMap<String, String>();
		map.put("id", "3");
		map.put("name", "wangwu");
		map.put("sex", "boy");
		listMap.add(map);
		// 循环输出每个学生的信息
		// 这种不用学生bean的写法，不便于后期维护，因为key值全是字符串，不适合1改全改
		// 忘了if这个语法了，这里加个计数器，式样是只需要输出两个同学的信息，在输出两个人的信息后，退出
		int cnt = 0;
		for (Map<String, String> m : listMap) {
			cnt = cnt + 1;
			if (cnt > 2) {
				System.out.println("够两个人了");
				break;
			} else {
				System.out.println("不够两个人");
			}
			System.out.println(m.get("id"));
			System.out.println(m.get("name"));
			System.out.println(m.get("sex"));
		}
	}
}
