package com.messaging.rate.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
@Data
public class Rate {

    @Id
    private String code;

    private Float rate;

    @JsonIgnore
    @Temporal(TemporalType.DATE)
    private Date date;
}
