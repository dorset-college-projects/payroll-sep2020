/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

/**
 *
 * @author John
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Employee e = new Employee("Bruce", "Wayne", "BAT001");
        SalariedEmployee se = new SalariedEmployee("Peter", "Parker", "spider001");

        HourlyEmployee he = new HourlyEmployee("David", "Banner", "HULK001");

        CommissionEmployee ce = new CommissionEmployee("Clark", "Kent", "Super001");

        BasePlusCommissionEmployee bpce = new BasePlusCommissionEmployee("Diana", "Carter", "www001");

        System.out.println(e.toString());
        System.out.println(se.toString());
        System.out.println(he.toString());
        System.out.println(ce.toString());
        System.out.println(bpce.toString());
        
        // Output the earnings 
        System.out.println(bpce.Earnings());

    }

}
