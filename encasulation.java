/*
Encapsulation
1.using private keyword
2.using Setter and getter method

*/
package javaapplication3;
public class Employee {
    private int empid;
    public void setEmpid(int emd){
        empid=emd;
    }
    public int getEmpid(){
        return empid;
    }
    public static void main(String[] args) {
        Employee obj=new Employee();
        obj.setEmpid(100);
        System.out.println(obj.getEmpid());
        
    }
}