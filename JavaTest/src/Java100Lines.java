import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Java100Lines {

	public static void main(String[] args) {
		
		// java����˵��˵ȥ�����������⼸�����ݵı༭��
		// �������͵ĺ������Լ���һ�°ɣ��÷���������������д����Щ���͹��ˡ�
		// �ڿհ״��Ҽ���꣬ѡ��debug as���`�`����java application��
		// ��ϵ�Ӧ�û�ɣ�F6����һ����F8�����¸��ϵ�
		
		int a = 1; // �����������ͣ�int
		float b = 1; // �����������ͣ�float
		double c = 1.0; // �����������ͣ�double
		String d = "a,b,c,d,e"; // �����������ͣ�String
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		// �����������ͣ�����(���ڻ�����1)
		String[] e = new String[5];
		e[0] = "a"; // ������ڻ�
		e[1] = "b"; // ������ڻ�
		e[2] = "c"; // ������ڻ�
		e[3] = "d"; // ������ڻ�
		e[4] = "e"; // ������ڻ�
		// ����ѭ���򵽿���̨
		for (int i=0; i < e.length; i++) {
			System.out.println(e[i]);
		}

		// �����������ͣ�����(���ڻ�����2)
		String[] f = d.split(",");
		// ����ѭ���򵽿���̨
		for (int i=0; i < f.length; i++) {
			System.out.println(f[i]);
		}
		
		// �����������ͣ�map
		Map<String, String> g = new HashMap<String, String>();
		g.put("key1", "value1");
		g.put("key2", "value2");
		g.put("key3", "value3");
		g.put("key4", "value4");
		g.put("key5", "value5");
		// ����ѭ���򵽿���̨
		for (String key : g.keySet()) {
			System.out.println("key:" + key + " , value:" + g.get(key));
		}
		// ָ��key��valueֵ���
		System.out.println(g.get("key3"));

		// �����������ͣ�list
		List<String> h = new ArrayList<String>();
		h.add("a");
		h.add("b");
		h.add("c");
		h.add("d");
		h.add("e");
		// ѭ����д��1
		for (int i=0; i < h.size(); i++) {
			System.out.println(h.get(i));
		}
		// ѭ����д��2
		for (String val : h) {
			System.out.println(val);
		}
		// ָ��index��ֵ
		System.out.println(h.get(3));
		
		// �����������ͣ�bean
		//��ѧ��bean,����һ��ѧ������Ϣ��
		StudentBean bean = new StudentBean();
		bean.setId("1");
		bean.setName("zhangsan");
		bean.setSex("girl");
		System.out.println(bean.getId());
		System.out.println(bean.getName());
		System.out.println(bean.getSex());
		
		// ѧ��bean��list����������ѧ������Ϣ
		List<StudentBean> listBean = new ArrayList<StudentBean>();
		// ѧ��1����Ϣ�ŵ�list��
		StudentBean stuBean = new StudentBean();
		stuBean.setId("1");
		stuBean.setName("zhangsan");
		stuBean.setSex("girl");
		listBean.add(stuBean);
		// ѧ��2����Ϣ�ŵ�list��
		stuBean = new StudentBean();
		stuBean.setId("2");
		stuBean.setName("lisi");
		stuBean.setSex("boy");
		listBean.add(stuBean);
		// ѭ�����ÿ��ѧ������Ϣ
		for (StudentBean stu : listBean) {
			System.out.println(stu.getId());
			System.out.println(stu.getName());
			System.out.println(stu.getSex());
		}
		
		// ѧ��map��list����������ѧ������Ϣ
		List<Map<String, String>> listMap = new ArrayList<Map<String, String>>();
		// ѧ��1����Ϣ�ŵ�list��
		Map<String, String> map = new HashMap<String, String>();
		map.put("id", "1");
		map.put("name", "zhangsan");
		map.put("sex", "girl");
		listMap.add(map);
		// ѧ��2����Ϣ�ŵ�list��
		map = new HashMap<String, String>();
		map.put("id", "2");
		map.put("name", "lisi");
		map.put("sex", "boy");
		listMap.add(map);
		// ѧ��2����Ϣ�ŵ�list��
		map = new HashMap<String, String>();
		map.put("id", "3");
		map.put("name", "wangwu");
		map.put("sex", "boy");
		listMap.add(map);
		// ѭ�����ÿ��ѧ������Ϣ
		// ���ֲ���ѧ��bean��д���������ں���ά������Ϊkeyֵȫ���ַ��������ʺ�1��ȫ��
		// ����if����﷨�ˣ�����Ӹ���������ʽ����ֻ��Ҫ�������ͬѧ����Ϣ������������˵���Ϣ���˳�
		int cnt = 0;
		for (Map<String, String> m : listMap) {
			cnt = cnt + 1;
			if (cnt > 2) {
				System.out.println("����������");
				break;
			} else {
				System.out.println("����������");
			}
			System.out.println(m.get("id"));
			System.out.println(m.get("name"));
			System.out.println(m.get("sex"));
		}
	}
}
