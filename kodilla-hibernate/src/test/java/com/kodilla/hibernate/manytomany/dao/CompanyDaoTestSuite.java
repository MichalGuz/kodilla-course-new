package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany(){
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);


        //CleanUp
        try {
            companyDao.delete(softwareMachineId);
            companyDao.delete(dataMaestersId);
            companyDao.delete(greyMatterId);
            employeeDao.deleteAll();
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testRetrieveEmployeeByLastName() {
        //Given
        Employee adamJohnson = new Employee("Adam", "Johnson");
        Employee brendaJohnson = new Employee("Brenda", "Johnson");
        Employee ianParker = new Employee("Ian", "Parker");
        Employee alexisJohnson = new Employee("Alexis", "Johnson");

        Company secretLab = new Company("Secret Lab");
        Company greenCity = new Company("Green City");

        secretLab.getEmployees().add(adamJohnson);
        greenCity.getEmployees().add(brendaJohnson);
        greenCity.getEmployees().add(adamJohnson);
        secretLab.getEmployees().add(ianParker);
        greenCity.getEmployees().add(alexisJohnson);

        adamJohnson.getCompanies().add(secretLab);
        brendaJohnson.getCompanies().add(greenCity);
        adamJohnson.getCompanies().add(greenCity);
        ianParker.getCompanies().add(secretLab);
        alexisJohnson.getCompanies().add(greenCity);

        companyDao.save(secretLab);
        companyDao.save(greenCity);

        //When
        List<Employee> findLastName = employeeDao.retrieveEmployeeByLastName("Johnson");
        List<Company> findCompany = companyDao.retrieveCompanyByFirst3Characters("Gre");

        //Then
        Assert.assertEquals(3, findLastName.size());
        Assert.assertEquals(1, findCompany.size());

        //CleanUp
        try {
            employeeDao.delete(adamJohnson);
            employeeDao.delete(alexisJohnson);
            employeeDao.delete(brendaJohnson);
            employeeDao.delete(ianParker);
            companyDao.delete(greenCity);
            companyDao.delete(secretLab);
        } catch (Exception e) {
            //do nothing
        }
    }
}
