package br.com.beans;

public class ParametrosSmart {

    private double pressaoarterial;
    private int BPM;
    private int taxainjestaoliquidos;
    private double percentualO2;

    // método construtor vazio
    public ParametrosSmart() {
        super();
    }

    // método construtor cheio
    public ParametrosSmart(double pressaoarterial, int BPM, int taxainjestaoliquidos,
            double percentualO2) {
        super();
        this.pressaoarterial = pressaoarterial;
        this.BPM = BPM;
        this.taxainjestaoliquidos = taxainjestaoliquidos;
        this.percentualO2 = percentualO2;
    }

    // get and set
    public Double getPressaoarterial() {
        return pressaoarterial;
    }

    public void setPressaoarterial(Double pressaoarterial) {
        this.pressaoarterial = pressaoarterial;
    }

    public int getBPM() {
        return BPM;
    }

    public void setBPM(int bPM) {
        BPM = bPM;
    }

    public int getTaxainjestaoliquidos() {
        return taxainjestaoliquidos;
    }

    public void setTaxainjestaoliquidos(int taxainjestaoliquidos) {
        this.taxainjestaoliquidos = taxainjestaoliquidos;
    }

    public double getPercentualO2() {
        return percentualO2;
    }
    //metodo calculo de saturação de o2
    public String calcularNivelO2(double calclularNivelO2) {
        if (percentualO2 <= 95) {
            return "Nível de saturação baixo!";
        } else {
            return "Nível aceitável";
    }}
}
    
    

            
            
	