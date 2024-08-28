package Classes;

import java.util.Date;

public class HourContract {
    private Date date;
    private double valuePerhour;
    private Integer hours;

    public HourContract() {

    }

    public HourContract(Date date, double valuePerhour, Integer hours) {
        this.date = date;
        this.valuePerhour = valuePerhour;
        this.hours = hours;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getValuePerhour() {
        return valuePerhour;
    }

    public void setValuePerhour(double valuePerhour) {
        this.valuePerhour = valuePerhour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }
    public Double totalValue() {
        return valuePerhour * hours;
    }

}
