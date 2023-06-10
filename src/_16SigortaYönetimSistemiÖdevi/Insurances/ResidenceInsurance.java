package _16SigortaYönetimSistemiÖdevi.Insurances;

import java.time.LocalDate;

//konut sigortası
public class ResidenceInsurance extends Insurance{

    double buildingValue;
    double contentValue;

    public ResidenceInsurance(double buildingValue, double contentValue) {
        super("Residence Insurance", 2000, LocalDate.now(), LocalDate.now().plusMonths(12));
        this.buildingValue = buildingValue;
        this.contentValue = contentValue;
    }

    public double getBuildingValue() {
        return buildingValue;
    }

    public void setBuildingValue(double buildingValue) {
        this.buildingValue = buildingValue;
    }

    public double getContentValue() {
        return contentValue;
    }

    public void setContentValue(double contentValue) {
        this.contentValue = contentValue;
    }

    @Override
    public void calculate(){
        double basePrice = getPrice();
        double buildingValue = getBuildingValue();
        double contentValue = getContentValue();

        double premium = basePrice + (buildingValue * 0.002) + (contentValue * 0.001);
        setPrice(premium);
    }

    @Override
    public String toString() {
        return "ResidenceInsurance [name=" + getName() + ", price=" + getPrice() + ", startDate=" + getStartDate()
                + ", endDate=" + getEndDate() + ", buildingValue=" + buildingValue + ", contentValue=" + contentValue
                + "]";
    }
}
