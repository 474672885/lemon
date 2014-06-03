package com.mossle.workcal.domain;

// Generated by Hibernate Tools
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * WorkcalRule .
 * 
 * @author Lingo
 */
@Entity
@Table(name = "WORKCAL_RULE")
public class WorkcalRule implements java.io.Serializable {
    private static final long serialVersionUID = 0L;

    /** null. */
    private Long id;

    /** null. */
    private WorkcalType workcalType;

    /** null. */
    private Integer year;

    /** null. */
    private Integer week;

    /** null. */
    private String name;

    /** null. */
    private Date workDate;

    /** null. */
    private Integer status;

    /** . */
    private Set<WorkcalPart> workcalParts = new HashSet<WorkcalPart>(0);

    public WorkcalRule() {
    }

    public WorkcalRule(WorkcalType workcalType, Integer year, Integer week,
            String name, Date workDate, Integer status,
            Set<WorkcalPart> workcalParts) {
        this.workcalType = workcalType;
        this.year = year;
        this.week = week;
        this.name = name;
        this.workDate = workDate;
        this.status = status;
        this.workcalParts = workcalParts;
    }

    /** @return null. */
    @Id
    @GeneratedValue
    @Column(name = "ID", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    /**
     * @param id
     *            null.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /** @return null. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TYPE_ID")
    public WorkcalType getWorkcalType() {
        return this.workcalType;
    }

    /**
     * @param workcalType
     *            null.
     */
    public void setWorkcalType(WorkcalType workcalType) {
        this.workcalType = workcalType;
    }

    /** @return null. */
    @Column(name = "YEAR")
    public Integer getYear() {
        return this.year;
    }

    /**
     * @param year
     *            null.
     */
    public void setYear(Integer year) {
        this.year = year;
    }

    /** @return null. */
    @Column(name = "WEEK")
    public Integer getWeek() {
        return this.week;
    }

    /**
     * @param week
     *            null.
     */
    public void setWeek(Integer week) {
        this.week = week;
    }

    /** @return null. */
    @Column(name = "NAME", length = 50)
    public String getName() {
        return this.name;
    }

    /**
     * @param name
     *            null.
     */
    public void setName(String name) {
        this.name = name;
    }

    /** @return null. */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "WORK_DATE", length = 26)
    public Date getWorkDate() {
        return this.workDate;
    }

    /**
     * @param workDate
     *            null.
     */
    public void setWorkDate(Date workDate) {
        this.workDate = workDate;
    }

    /** @return null. */
    @Column(name = "STATUS")
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @param status
     *            null.
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /** @return . */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "workcalRule")
    public Set<WorkcalPart> getWorkcalParts() {
        return this.workcalParts;
    }

    /**
     * @param workcalParts
     *            .
     */
    public void setWorkcalParts(Set<WorkcalPart> workcalParts) {
        this.workcalParts = workcalParts;
    }
}