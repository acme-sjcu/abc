package abc.domain;

import abc.domain.2;
import abc.Bc1Application;
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

    @PostPersist
    public void onPostPersist(){


        2 2 = new 2(this);
        2.publishAfterCommit();

    }

    public static ARepository repository(){
        ARepository aRepository = Bc1Application.applicationContext.getBean(ARepository.class);
        return aRepository;
    }






}
//>>> DDD / Aggregate Root
