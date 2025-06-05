import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        // إضافة عناصر
        map.put("أحمد", 25);
        map.put("سارة", 30);

        // قراءة عنصر
        System.out.println("عمر أحمد: " + map.get("أحمد"));

        // تحديث عنصر (Atomic Operation)
        map.putIfAbsent("محمد", 28); // يضيف "محمد" فقط إذا لم يكن موجودًا

        // الطباعة النهائية للخريطة
        System.out.println("الخريطة النهائية: " + map);
    }
}



import java.util.HashMap;
import java.util.Hashtable;

public class Example {
    public static void main(String[] args) {
        // HashMap يسمح بقيمة null
        HashMap<String, String> map = new HashMap<>();
        map.put(null, "قيمة مع مفتاح null");
        map.put("مفتاح1", null);
        System.out.println("HashMap: " + map);

        // Hashtable لا يسمح بقيمة null (سيحدث استثناء)
        Hashtable<String, String> table = new Hashtable<>();
        try {
            table.put(null, "قيمة مع مفتاح null");  // هذا السطر سيسبب NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Hashtable لا يسمح بالمفتاح null");
        }

        try {
            table.put("مفتاح1", null);  // هذا السطر أيضاً سيسبب NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Hashtable لا يسمح بالقيمة null");
        }
    }
}
| Aspect               | `HashMap`                                                                                        | `Hashtable`                                            |
| -------------------- | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------ |
| **Thread Safety**    | Not synchronized (not thread-safe)                                                               | Synchronized (thread-safe)                             |
| **Null Keys/Values** | Allows one `null` key and multiple `null` values                                                 | Does **not** allow `null` key or values                |
| **Performance**      | Faster (due to lack of synchronization overhead)                                                 | Slower (because of synchronization overhead)           |
| **Legacy**           | Part of Java Collections Framework (since Java 1.2)                                              | Legacy class (from Java 1.0)                           |
| **Iterator**         | Fail-fast iterator (`ConcurrentModificationException` on modification during iteration)          | Enumerator, which is not fail-fast                     |
| **Use Case**         | When thread safety is **not** required, or use `Collections.synchronizedMap()` for thread safety | When thread safety is required and legacy code uses it |
