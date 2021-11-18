package Business.Employee;

import java.util.ArrayList;


public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name){
        Employee employee = new Employee();
        employee.setName(name);
        employeeList.add(employee);
        return employee;
    }
    
    public boolean addEmployee(Employee emp) {
        if (emp == null) 
            return false;
        return employeeList.add(emp);
    }
    
    public boolean updateEmployee(int idx, Employee emp) {
        if ((emp == null) || (idx < 0)) 
            return false;
        employeeList.set(idx, emp);
        return true;
    }
    
    public boolean removeEmployee(Employee emp) {
        if (emp == null) 
            return false;
        return employeeList.remove(emp);
    }
}