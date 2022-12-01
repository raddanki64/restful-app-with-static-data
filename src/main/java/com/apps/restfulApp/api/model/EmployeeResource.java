package com.apps.restfulApp.api.model;

import java.util.Objects;

import	lombok.Getter;
import	lombok.Setter;
import	lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
public class EmployeeResource {
  private int id;
  private String firstName;
  private String lastName;

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof EmployeeResource))
      return false;
    EmployeeResource employee = (EmployeeResource) o;
    return Objects.equals(this.id, employee.id) && Objects.equals(this.firstName, employee.firstName)
        && Objects.equals(this.lastName, employee.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.id, this.firstName, this.lastName);
  }

  @Override
  public String toString() {
    return "Employee {" + "id =" + this.id + ", firstName ='" + this.firstName + '\'' + ", lastName ='" + this.lastName + '\'' + '}';
  }
}