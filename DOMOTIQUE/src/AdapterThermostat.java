import thermos.Thermostat;

public class AdapterThermostat implements Appareil{
    private Thermostat thermostat;

    public AdapterThermostat(Thermostat thermostat) {
        this.thermostat=thermostat;
    }

    @Override
    public void eteindre() {
        this.thermostat.baisserTemperature();
    }

    @Override
    public void allumer() {
        this.thermostat.monterTemperature();
    }

    @Override
    public String toString(){
        return "thermostat : "+this.thermostat.getTemperature();
    }
}
