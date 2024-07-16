package it.java8.prove.Enums;

public enum BandieraBLu{
    Napoli(true), Palermo(false), Ancona(true), Genova(false);
    
    private Boolean flag;

    private BandieraBLu(Boolean flag){
        this.flag= flag;
    }

    public Boolean getFlag(){
        return flag;
    }
}