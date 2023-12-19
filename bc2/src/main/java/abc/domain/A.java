package abc.domain;

import abc.Bc2Application;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;
import java.time.LocalDate;


@Entity
@Table(name="A_table")
@Data

//<<< DDD / Aggregate Root
public class A  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    private Long id;


    public static ARepository repository(){
        ARepository aRepository = Bc2Application.applicationContext.getBean(ARepository.class);
        return aRepository;
    }




//<<< Clean Arch / Port Method
    public static void 1(2 2){
        
        //implement business logic here:

        /** Example 1:  new item 
        A a = new A();
        repository().save(a);

        */

        /** Example 2:  finding and process
        
        repository().findById(2.get???()).ifPresent(a->{
            
            a // do something
            repository().save(a);


         });
        */

        
    }
//>>> Clean Arch / Port Method


}
//>>> DDD / Aggregate Root
