package org.motechproject.server.pillreminder.contract;

import java.util.Date;

public class MedicineRequest {
    private String name;
    private Date startDate;
    private Date endDate;

    public MedicineRequest(String name, Date startDate, Date endDate) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }
}
