package no.hiof.model;

public class Student {
    private String forNavn,etterNavn;
    private int alder;

    public Student(String forNavn, String etterNavn, int alder) {
        this.forNavn = forNavn;
        this.etterNavn = etterNavn;
        this.alder = alder;
    }

    public String getForNavn() {
        return forNavn;
    }

    public void setForNavn(String forNavn) {
        this.forNavn = forNavn;
    }

    public String getEtterNavn() {
        return etterNavn;
    }

    public void setEtterNavn(String etterNavn) {
        this.etterNavn = etterNavn;
    }

    public int getAlder() {
        return alder;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }

    @Override
    public String toString() {
        return "Student 01\n" +
                "Fornavn: " + forNavn + "\nEtternavn: " + etterNavn +  "\nAlder: " + alder;
    }
}
