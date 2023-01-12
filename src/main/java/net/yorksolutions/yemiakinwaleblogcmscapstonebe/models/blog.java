package net.yorksolutions.yemiakinwaleblogcmscapstonebe.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Long id;
    public String title;
    public String body;
    public String author;
    public Date createdDate;
    public Date updatedDate;
}
