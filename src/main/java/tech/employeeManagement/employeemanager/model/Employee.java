package tech.employeeManagement.employeemanager.model;

import jakarta.persistence.*;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@Entity
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable=false, updatable= false)
    private Long id;
    private String name;
    private String email;
    private String JobTitle;
    private String phone;
    private String imageUrl;
    @Column(nullable=false, updatable= false)
    private String employeeCode;

    public Employee(){}
    public Employee(String name,String email, String jobTitle, String phone, String imageUrl ){
        this.name=name;
        this.email=email;
        this.JobTitle=jobTitle;
        this.phone= phone;
        this.imageUrl=imageUrl;
    }
    @Override
    public String toString(){
        return "Employee{"+" id="+id+",\n name: "+name+"\n" +
                " JobTitle: "+JobTitle+"\n Phone: "+phone+"\nimageURL: "
                +imageUrl+"}";
    }


}
