package com.pluralsight;

import com.pluralsight.adapter.Employee;
import com.pluralsight.adapter.EmployeeAdapterLdap;
import com.pluralsight.adapter.EmployeeLdap;

public class EmployeeAdapter {

    public static Employee fromLdap(EmployeeLdap employeeLdap) {
        return new EmployeeAdapterLdap(employeeLdap);
    }
}
