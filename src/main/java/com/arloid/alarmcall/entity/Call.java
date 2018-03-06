package com.arloid.alarmcall.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
public class Call implements Serializable {

    private static final long serialVersionUID = 3443583048152724965L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private CallNumber callNumber;

    @Column(nullable = false, insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date updated;

    @Column(nullable = false)
    private String provider;

    @Column(name = "listened_full", nullable = false)
    private Boolean fullyListened;

    @Column
    private Integer duration;

    @Column
    private BigDecimal cost;
}
