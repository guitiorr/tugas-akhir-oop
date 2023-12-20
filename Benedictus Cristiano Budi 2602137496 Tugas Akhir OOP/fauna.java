class fauna extends FF {
    char P106;
    String IUCN;
    String CITES;
    String kelas;

    fauna(String namaLokal, String namaIlmiah, String kelas, String famili, char P106, String IUCN, String CITES) {
        this.namaLokal = namaLokal;
        this.namaIlmiah = namaIlmiah;
        this.kelas = kelas;
        this.famili = famili;
        this.P106 = P106;
        this.IUCN = IUCN;
        this.CITES = CITES;
    }

    // GETTER SETTER START
    public char getP106() {
        return P106;
    }

    public void setP106(char P106) {
        this.P106 = P106;
    }

    public String getIUCN() {
        return IUCN;
    }

    public void setIUCN(String IUCN) {
        this.IUCN = IUCN;
    }

    public String getCITES() {
        return CITES;
    }

    public void setCITES(String CITES) {
        this.CITES = CITES;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void setNamaLokal(String namaLokal) {
        this.namaLokal = namaLokal;
    }

    public String getNamaLokal() {
        return namaLokal;
    }

    public void setNamaIlmiah(String namaIlmiah) {
        this.namaIlmiah = namaIlmiah;
    }

    public String getNamaIlmiah() {
        return namaIlmiah;
    }

    public void setFamili(String famili) {
        this.famili = famili;
    }

    public String getFamili() {
        return famili;
    }
    // GETTER SETTER END

    public void display() {
        System.out.println("Nama Lokal: " + namaLokal);
        System.out.println("Nama Ilmiah: " + namaIlmiah);
        System.out.println("Kelas: " + kelas);
        System.out.println("Famili: " + famili);
        System.out.println("P106: " + P106);
        System.out.println("IUCN: " + IUCN);
        System.out.println("CITES: " + CITES);
        System.out.println("--------------------");
    }
}
