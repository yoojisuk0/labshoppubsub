package untitled.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.InventoryApplication;

@Entity
@Table(name = "Invenory_table")
@Data
//<<< DDD / Aggregate Root
public class Invenory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long stock;

    @PostPersist
    public void onPostPersist() {}

    public static InvenoryRepository repository() {
        InvenoryRepository invenoryRepository = InventoryApplication.applicationContext.getBean(
            InvenoryRepository.class
        );
        return invenoryRepository;
    }

    //<<< Clean Arch / Port Method
    public static void decreaseStock(OrderPlaced orderPlaced) {
        //implement business logic here:

        /** Example 1:  new item 
        Invenory invenory = new Invenory();
        repository().save(invenory);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderPlaced.get???()).ifPresent(invenory->{
            
            invenory // do something
            repository().save(invenory);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
