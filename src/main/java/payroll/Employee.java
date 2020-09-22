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
public class Employee {
    
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    
    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }
    
    @Override 
    public String toString() {
        
        return String.format("%s %s : %s",this.firstName, this.lastName, this.socialSecurityNumber);
    }
    
}
