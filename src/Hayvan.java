class Hayvan {
    private String isim;

    public Hayvan(String isim){
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    public String konus(){
        return "Hayvan konuşuyor...";
    }
}
class Kedi extends Hayvan{
    public Kedi(String isim){
        super(isim);
    }

    public String konus(){
        return this.getIsim()+" miyavlıyor...";
    }
}

class Kopek extends Hayvan{
    public Kopek(String isim){
        super(isim);
    }

    public String konus(){
        return this.getIsim()+" havlıyor...";
    }
}
class At extends Hayvan{
    public At(String isim){
        super(isim);
    }

    public String konus(){
        return this.getIsim()+" kişniyor...";
    }
}

