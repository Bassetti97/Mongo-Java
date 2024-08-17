package org.fundatec.mongoDB.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "shows")
public class Show {

    @Id
    private String show_id;
    private String location;
    private String date;
    private int available_tickets;

}
