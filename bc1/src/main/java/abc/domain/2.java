package abc.domain;

import abc.domain.*;
import abc.infra.AbstractEvent;
import java.util.*;
import lombok.*;
import java.time.LocalDate;


//<<< DDD / Domain Event
@Data
@ToString
public class 2 extends AbstractEvent {

    private Long id;

    public 2(A aggregate){
        super(aggregate);
    }
    public 2(){
        super();
    }
}
//>>> DDD / Domain Event