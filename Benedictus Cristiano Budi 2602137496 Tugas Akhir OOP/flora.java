class flora extends FF {

    flora(String namaLokal, String namaIlmiah, String famili) {
        this.namaLokal = namaLokal;
        this.namaIlmiah = namaIlmiah;
        this.famili = famili;
    }


    //GETTER SETTER START
    public String getNamaLokal() {
        return namaLokal;
    }

    public void setNamaLokal(String namaLokal) {
        this.namaLokal = namaLokal;
    }

    public String getNamaIlmiah() {
        return namaIlmiah;
    }

    public void setNamaIlmiah(String namaIlmiah) {
        this.namaIlmiah = namaIlmiah;
    }

    public String getFamili() {
        return famili;
    }

    public void setFamili(String famili) {
        this.famili = famili;
    }
    //GETTER SETTER END

    // public void add() {
    //     System.out.println("Add func");
    // }

    // public void update() {
    //     System.out.println("Update func");
    // }

    // public void delete() {
    //     System.out.println("Delete func");
    // }

    public void display() {
        System.out.println("--------------------");
        System.out.println("Nama Lokal: " + namaLokal);
        System.out.println("Nama Ilmiah: " + namaIlmiah);
        System.out.println("Famili: " + famili);
        System.out.println("--------------------");
    }
}