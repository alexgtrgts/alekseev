package DAOExercise;

import DAOExercise.pojos.Department;
import DAOExercise.pojos.Employee;
import DAOExercise.pojos.EmployeeDetail;
import Util.SessionUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.Serializable;

public class Runner {
    public static void main(String[] args) {
        try {
            SessionUtil sessionUtil = new SessionUtil();
            Session session = sessionUtil.getSession();
            Transaction transaction = session.getTransaction();
            transaction.begin();

            Department department = new Department("Sales");

            EmployeeDetail employeeDetail = new EmployeeDetail(null, "Minsk", "Belaurs", "MInskaya", "Avakana", null);

            Employee employee = new Employee(null, "cellphone", "Ivan", "Ivanov", employeeDetail, department,null);

//            Serializable id = session.save(employee);
//            System.out.println(id);
//        employee.setEmployeeDetail(employeeDetail);
//        employeeDetail.setEmployee(employee);
//
//
//
//        session.save(employee);

            session.flush();
    //        session.clear();
//            Employee employee1 = session.get(Employee.class, id);
//            EmployeeDetail employeeDetail1 = employee1.getEmployeeDetail();

            session.getTransaction().commit();
            sessionUtil.stopSessionFactory();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
