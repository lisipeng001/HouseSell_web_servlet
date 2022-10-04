package com.lsp.entity;

/**
 * @ClassName: Parameter
 * @Description:
 * @Author: lisipeng001
 * @Date: 2022/10/3 9:37
 */
public class Parameter {
    //git 修改
    private String field;
    private Object value;
    private String operator;
    /**
     *
     * @param field 数据库字段名
     * @param operator 数据库操作符 =、>=、<、like etc...
     * @param value 参数值 Object
     */
    public Parameter(String field,String operator, Object value) {
        super();
        this.field = field;
        this.value = value;
        this.operator = operator;
    }
    public String getField() {
        return field;
    }
    public Object getValue() {
        return value;
    }
    public String getOperator() {
        return operator;
    }
}
