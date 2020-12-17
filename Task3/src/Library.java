public class Library {
    private Technical technical;
    private Juridical juridical;
    private Art art;

    public Library(){}
    public Library(Technical technical, Juridical juridical, Art art) {
        this.technical = technical;
        this.juridical = juridical;
        this.art = art;
    }

    public Technical getTechnical() {
        return technical;
    }

    public void setTechnical(Technical technical) {
        this.technical = technical;
    }

    public Juridical getJuridical() {
        return juridical;
    }

    public void setJuridical(Juridical juridical) {
        this.juridical = juridical;
    }

    public Art getArt() {
        return art;
    }

    public void setArt(Art art) {
        this.art = art;
    }

    public void addBook(int count){

    }


}
