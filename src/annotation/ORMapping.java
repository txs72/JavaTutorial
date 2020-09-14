package annotation;

import java.lang.annotation.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ORMapping {
    public static void main(String[] args) {
        MyRecord record1 = new MyRecord("123", "34");
        MyRecord record2 = new MyRecord("123", "test");
        MyRecord record3 = new MyRecord("", "test1,test2,test3,test4");
        // ORM.execute(record1)
        // ORM.save(new MyRecord())
        String sql1 = assembleSqlFromObj(record1);
        String sql2 = assembleSqlFromObj(record2);
        String sql3 = assembleSqlFromObj(record3);
        System.out.println(sql1);
        System.out.println(sql2);
        System.out.println(sql3);
    }

    /**
     * 通过注解来组装查询条件，生成查询语句
     */
    public static String assembleSqlFromObj(Object obj) {
        Table table = obj.getClass().getAnnotation(Table.class);
        StringBuffer sql = new StringBuffer();
        String tableName = table.value();
        sql.append("select * from " + tableName + " where 1=1 ");
        Field[] fileds = obj.getClass().getDeclaredFields();
        for (Field f : fileds) {
            String fieldName = f.getName();
            String methodName = "get" + fieldName.substring(0, 1).toUpperCase()
                    + fieldName.substring(1);
            try {
                Column column = f.getAnnotation(Column.class);
                if (column != null) {
                    Method method = obj.getClass().getMethod(methodName);
                    String value = (String) method.invoke(obj);
                    if (value != null && !value.equals("")) {
                        if (!isNum(column.value()) && !isNum(value)) {
                            // 判断参数是不是 in 类型参数 1,2,3
                            if (value.contains(",")) {
                                sql.append(" and " + column.value() + " in (" + value + ") ");
                            } else {
                                sql.append(" and " + column.value() + " like '%" + value + "%' ");
                            }
                        } else {
                            sql.append(" and " + column.value() + "=" + value + " ");
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return sql.toString();
    }

    /**
     * 检查给定的值是不是id类型
     */
    public static boolean isNum(String target) {
        boolean isNum = false;
        if (target.toLowerCase().contains("id")) {
            isNum = true;
        }
        if (target.matches("\\d+")) {
            isNum = true;
        }
        return isNum;
    }
}

@Inherited
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@interface Table {
    String value() default "";
}

@Inherited
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@interface Column {
    String value() default "";
}

@Table("TestTable")
class MyRecord {

    @Deprecated
    private String tt;

    @Column("_id")
    private String id;

    @Column("username")
    private String name;

    public MyRecord(String id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public String getTt() {
        return tt;
    }

    public void setTt(String tt) {
        this.tt = tt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

