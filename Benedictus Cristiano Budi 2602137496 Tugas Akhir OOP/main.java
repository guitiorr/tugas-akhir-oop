//Benedictus Cristiano Budi
//2602137496

import java.util.Scanner;
import java.util.ArrayList;

public class main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<flora> flors = new ArrayList<flora>();
        ArrayList<fauna> faun = new ArrayList<fauna>();
        int choice = 0;
        int reset = 1;
        String localName;
        String scientificName;
        String family;
        String classes;
        char pe106;
        String iucn;
        String cites;

        do {
            do {
                try {
                    System.out.println("1. Flora\n2. Fauna\n3. Search data\n4. Exit");
                    System.out.print("Input >>> ");
                    choice = sc.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid input!");
                    sc.nextLine();
                }
            } while (true);
            switch (choice) {
                case 1:

                    do {
                        try {
                            System.out.println("1. Add data\n2. Update data\n3. Delete data\n4. Display data");
                            System.out.print("Input >>> ");
                            choice = sc.nextInt();
                            break;
                        } catch (Exception e) {
                            System.out.println("Invalid input!");
                            sc.nextLine();
                        }

                    } while (true);

                    switch (choice) {

                        case 1:
                            sc.nextLine();
                            // LOCAL NAME
                            System.out.println("Input nama lokal");
                            System.out.print("Input >>> ");
                            localName = sc.nextLine();

                            // SCIENTIFIC NAME
                            System.out.println("Input nama Ilmiah");
                            System.out.print("Input >>> ");
                            scientificName = sc.nextLine();

                            // FAMILI
                            System.out.println("Input Famili");
                            System.out.print("Input >>> ");
                            family = sc.nextLine();

                            flora fona = new flora(localName, scientificName, family);

                            flors.add(fona);

                            break;

                        case 2:
                            sc.nextLine();
                            // UPDATE
                            if (flors.isEmpty()) {
                                System.out.println("No flora data.");
                            } else {
                                for (int i = 0; i < flors.size(); i++) {
                                    System.out.println("--------------------");
                                    System.out.println("Index " + i + ":");
                                    flors.get(i).display();
                                }

                                System.out.println("Pick index >>> ");
                                int indexToUpdate = sc.nextInt();

                                if (indexToUpdate >= 0 && indexToUpdate < flors.size()) {
                                    flora floraToUpdate = flors.get(indexToUpdate);
                                    int updateChoice = 0;

                                    do {
                                        try {
                                            System.out.println("1. Nama Lokal\n2 Nama Ilmiah\n3. Famili");
                                            System.out.print("Input >>> ");
                                            updateChoice = sc.nextInt();
                                            break;
                                        } catch (Exception e) {
                                            System.out.println("Invalid input.");
                                            sc.nextLine();
                                        }
                                    } while (true);

                                    switch (updateChoice) {
                                        case 1:
                                            sc.nextLine();
                                            System.out.println("Input new Nama Lokal >>> ");
                                            String newNamaLokal = sc.nextLine();
                                            floraToUpdate.setNamaLokal(newNamaLokal);
                                            break;

                                        case 2:
                                            sc.nextLine();
                                            System.out.println("Input new Nama Ilmiah >>> ");
                                            String newNamaIlmiah = sc.nextLine();
                                            floraToUpdate.setNamaIlmiah(newNamaIlmiah);
                                            break;

                                        case 3:
                                            sc.nextLine();
                                            System.out.println("Input new Famili >>> ");
                                            String newFamili = sc.nextLine();
                                            floraToUpdate.setFamili(newFamili);
                                            break;

                                        default:
                                            System.out.println("Invalid choice for update!");
                                            break;
                                    }
                                } else {
                                    System.out.println("Invalid index!");
                                }
                            }
                            break;

                        case 3:
                            sc.nextLine();
                            if (flors.isEmpty()) {
                                System.out.println("No flora data.");
                            } else {
                                for (int i = 0; i < flors.size(); i++) {
                                    System.out.println("--------------------");
                                    System.out.println("Index " + i + ":");
                                    flors.get(i).display();
                                }

                                System.out.println("Input index delete >>> ");
                                int indexToDelete = sc.nextInt();

                                if (indexToDelete >= 0 && indexToDelete < flors.size()) {
                                    flors.remove(indexToDelete);
                                    System.out.println("Flora data at index (" + indexToDelete + ") deleted successfuly.");
                                } else {
                                    System.out.println("Invalid index!");
                                }
                            }
                            break;

                        case 4:
                            // DISPLAY DATA
                            if (flors.isEmpty()) {
                                System.out.println("No flora data.");
                            } else {
                                System.out.println("--------------------");
                                System.out.println("FLORA DATA");
                                for (int i = 0; i < flors.size(); i++) {
                                    flors.get(i).display();
                                }
                            }
                            break;

                        default:
                            System.out.println("Invalid choice!");
                            break;
                    }

                    choice = 100;

                    break;

                case 2:
                    sc.nextLine();
                    do {
                        try {
                            System.out.println("1. Add data\n2. Update data\n3. Delete data\n4. Display data");
                            System.out.print("Input >>> ");
                            choice = sc.nextInt();
                            break;
                        } catch (Exception e) {
                            System.out.println("Invalid input!");
                            sc.nextLine();
                        }

                    } while (true);

                    switch (choice) {

                        case 1:
                            sc.nextLine();

                            System.out.println("Input Nama Lokal");
                            System.out.print("Input >>> ");
                            localName = sc.nextLine();

                            System.out.println("Input Nama Ilmiah");
                            System.out.print("Input >>> ");
                            scientificName = sc.nextLine();

                            System.out.println("Input Kelas");
                            System.out.print("Input >>> ");
                            classes = sc.nextLine();

                            System.out.println("Input Famili");
                            System.out.print("Input >>> ");
                            family = sc.nextLine();

                            System.out.println("Input P106");
                            System.out.print("Input >>> ");
                            pe106 = sc.next().charAt(0);

                            sc.nextLine();

                            System.out.println("Input IUCN");
                            System.out.print("Input >>> ");
                            iucn = sc.nextLine();

                            System.out.println("Input CITES");
                            System.out.print("Input >>> ");
                            cites = sc.nextLine();

                            fauna fon = new fauna(localName, scientificName, classes, family, pe106, iucn, cites);

                            faun.add(fon);

                            System.out.println("Successful input!");

                            break;

                        case 2:
                            sc.nextLine();
                            // UPDATE DATA
                            if (faun.isEmpty()) {
                                System.out.println("Tidak ada data fauna.");
                            } else {
                                for (int i = 0; i < faun.size(); i++) {
                                    System.out.println("--------------------");
                                    System.out.println("Index " + i + ":");
                                    faun.get(i).display();
                                }

                                System.out.println("Pick index update >>> ");
                                int indexToUpdate = sc.nextInt();

                                if (indexToUpdate >= 0 && indexToUpdate < faun.size()) {
                                    fauna faunaToUpdate = faun.get(indexToUpdate);
                                    int updateChoice = 0;

                                    do {
                                        try {
                                            System.out.println("1. Nama Lokal\n2. Nama Ilmiah\n3. Kelas\n4. Famili\n5. P106\n6. IUCN\n7. CITES");
                                            System.out.print("Input >>> ");
                                            updateChoice = sc.nextInt();
                                            break;
                                        } catch (Exception e) {
                                            System.out.println("Invalid input.");
                                            sc.nextLine();
                                        }
                                    } while (true);

                                    switch (updateChoice) {
                                        case 1:
                                            sc.nextLine();
                                            System.out.print("Input new Nama Lokal >>> ");
                                            String newNamaLokal = sc.nextLine();
                                            faunaToUpdate.setNamaLokal(newNamaLokal);
                                            break;

                                        case 2:
                                            sc.nextLine();
                                            System.out.print("Input new Nama Ilmiah >>> ");
                                            String newNamaIlmiah = sc.nextLine();
                                            faunaToUpdate.setNamaIlmiah(newNamaIlmiah);
                                            break;

                                        case 3:
                                            sc.nextLine();
                                            System.out.print("Input new Kelas >>> ");
                                            String newKelas = sc.nextLine();
                                            faunaToUpdate.setKelas(newKelas);
                                            break;

                                        case 4:
                                            sc.nextLine();
                                            System.out.print("Input new Famili >>> ");
                                            String newFamili = sc.nextLine();
                                            faunaToUpdate.setFamili(newFamili);
                                            break;

                                        case 5:
                                            sc.nextLine();
                                            System.out.print("Input new P106 >>> ");
                                            char newP106 = sc.next().charAt(0);
                                            sc.nextLine();
                                            faunaToUpdate.setP106(newP106);
                                            break;

                                        case 6:
                                            sc.nextLine();
                                            System.out.print("Input new IUCN >>> ");
                                            String newIUCN = sc.nextLine();
                                            faunaToUpdate.setIUCN(newIUCN);
                                            break;

                                        case 7:
                                            sc.nextLine();
                                            System.out.print("Input new CITES >>> ");
                                            String newCITES = sc.nextLine();
                                            faunaToUpdate.setCITES(newCITES);
                                            break;

                                        default:
                                            System.out.println("Invalid choice for update!");
                                            break;
                                    }
                                } else {
                                    System.out.println("Invalid index!");
                                }
                            }
                            break;

                        case 3:
                            sc.nextLine();
                            // DELETE DATA
                            if (faun.isEmpty()) {
                                System.out.println("Tidak ada data fauna untuk dihapus.");
                            } else {
                                System.out.println("Data Fauna yang tersedia:");
                                for (int i = 0; i < faun.size(); i++) {
                                    System.out.println("--------------------");
                                    System.out.println("Index " + i + ":");
                                    faun.get(i).display();
                                }

                                System.out.println("Pilih index yang ingin dihapus:");
                                int indexToDelete = sc.nextInt();

                                if (indexToDelete >= 0 && indexToDelete < faun.size()) {
                                    faun.remove(indexToDelete);
                                    System.out.println("Data fauna telah dihapus.");
                                } else {
                                    System.out.println("Invalid index!");
                                }
                            }
                            break;

                        case 4:
                            // DISPLAY DATA
                            if (faun.isEmpty()) {
                                System.out.println("Tidak ada data flora.");
                            } else {
                                System.out.println("--------------------");
                                System.out.println("FAUNA DATA");
                                for (int i = 0; i < faun.size(); i++) {
                                    faun.get(i).display();
                                }
                            }
                            break;

                        default:
                            System.out.println("Invalid choice!");
                            break;
                    }

                    choice = 100;
                    break;

                case 3:
                    sc.nextLine();
                    do {
                        try {
                            System.out.println(
                                    "1. By name\n2. By category\n3. By status perlindungan\n4. By family\n5. By scientific name");
                            System.out.print("Input >>> ");
                            choice = sc.nextInt();
                            break;
                        } catch (Exception e) {
                            System.out.println("Invalid input.");
                            sc.nextLine();
                        }
                    } while (true);

                    switch (choice) {
                        case 1:
                            System.out.println("Input nama lokal >>>");
                            sc.nextLine();
                            String searchName = sc.nextLine();

                            // SEARCH NAMA LOKAL FLORA
                            ArrayList<flora> displayLokalFlora = new searchdata().searchNamaLokal(searchName, flors);
                            if (displayLokalFlora != null && !displayLokalFlora.isEmpty()) {
                                System.out.println("NAMA LOKAL FLORA SEARCH RESULT FOUND");
                                System.out.println("--------------------");
                                for (int i = 0; i < displayLokalFlora.size(); i++) {
                                    displayLokalFlora.get(i).display();
                                }
                            } else {
                                System.out.println("No entry found for FLORA with family " + searchName);
                            }

                            // SEARCH NAMA LOKAL FAUNA
                            ArrayList<fauna> displayLokalFauna = new searchdata().searchNamaLokal(searchName, faun);
                            if (displayLokalFauna != null && !displayLokalFauna.isEmpty()) {
                                System.out.println("NAMA LOKAL FAUNA SEARCH RESULT FOUND");
                                System.out.println("--------------------");
                                for (int i = 0; i < displayLokalFauna.size(); i++) {
                                    displayLokalFauna.get(i).display();
                                }
                            } else {
                                System.out.println("No entry found for FLORA with family " + searchName);
                            }

                            break;

                        case 2:
                            System.out.println("Input category (Flora / Fauna) >>> ");
                            sc.nextLine();
                            String searchClass = sc.nextLine();

                            // FLORA
                            if (searchClass.equalsIgnoreCase("flora")) {
                                for (int i = 0; i < flors.size(); i++) {
                                    flors.get(i).display();
                                }
                            }
                            // FAUNA
                            else if (searchClass.equalsIgnoreCase("fauna")) {
                                for (int i = 0; i < faun.size(); i++) {
                                    faun.get(i).display();
                                }
                            }

                            break;

                        case 3:
                            sc.nextLine();
                            int statusChoice = 0;
                            do {
                                try {
                                    System.out.println("1. P.106\n2. IUCN\n3. CITES");
                                    System.out.print("Input choice >>> ");
                                    statusChoice = sc.nextInt();
                                    break;
                                } catch (Exception e) {
                                    System.out.println("Invalid input!");
                                    sc.nextLine();
                                }
                            } while (true);

                            switch (statusChoice) {
                                case 1:
                                    System.out.println("Input P.106 status >>> ");
                                    String searchP106 = sc.nextLine();

                                    // SEARCH P.106 FAUNA
                                    for (int i = 0; i < faun.size(); i++) {
                                        char status = faun.get(i).getP106();
                                        if (String.valueOf(status).equalsIgnoreCase(searchP106)) {
                                            faun.get(i).display();
                                        }
                                    }
                                    break;

                                case 2:
                                    System.out.println("Input IUCN status >>> ");
                                    String searchIUCN = sc.nextLine();

                                    // SEARCH IUCN FAUNA
                                    for (int i = 0; i < faun.size(); i++) {
                                        if (faun.get(i).getIUCN().equalsIgnoreCase(searchIUCN)) {
                                            faun.get(i).display();
                                        }
                                    }
                                    break;

                                case 3:
                                    System.out.println("Input CITES status >>> ");
                                    String searchCITES = sc.nextLine();

                                    // SEARCH CITES FAUNA
                                    for (int i = 0; i < faun.size(); i++) {
                                        if (faun.get(i).getCITES().equalsIgnoreCase(searchCITES)) {
                                            faun.get(i).display();
                                        }
                                    }
                                    break;

                                default:
                                    System.out.println("Invalid choice!");
                                    break;

                            }

                            break;

                        case 4:
                            System.out.println("Input famili >>> ");
                            sc.nextLine();
                            String searchFamily = sc.nextLine();

                            // SEARCH FAMILI FLORA
                            ArrayList<flora> displayFamiliFlora = new searchdata().searchFamili(searchFamily, flors);
                            if (displayFamiliFlora != null && !displayFamiliFlora.isEmpty()) {
                                System.out.println("FAMILI FLORA SEARCH RESULT FOUND");
                                System.out.println("--------------------");
                                for (int i = 0; i < displayFamiliFlora.size(); i++) {
                                    displayFamiliFlora.get(i).display();
                                }
                            } else {
                                System.out.println("No entry found for FLORA with family " + searchFamily);
                            }

                            // SEARCH FAMILI FAUNA
                            ArrayList<fauna> displayFamiliFauna = new searchdata().searchFamili(searchFamily, faun);
                            if (displayFamiliFauna != null && !displayFamiliFauna.isEmpty()) {
                                System.out.println("FAMILI FAUNA SEARCH RESULT FOUND");
                                System.out.println("--------------------");
                                for (int i = 0; i < displayFamiliFauna.size(); i++) {
                                    displayFamiliFauna.get(i).display();
                                }
                            } else {
                                System.out.println("No entry found for FAUNA with family " + searchFamily);
                            }
                            break;

                        case 5:
                            System.out.println("Input nama ilmiah >>> ");
                            sc.nextLine();
                            String searchNamaIlmiah = sc.nextLine();

                            // SEARCH NAMA ILMIAH FLORA
                            ArrayList<flora> displayNamaIlmiahFlora = new searchdata()
                                    .searchNamaIlmiah(searchNamaIlmiah, flors);
                            if (displayNamaIlmiahFlora != null && !displayNamaIlmiahFlora.isEmpty()) {
                                System.out.println("NAMA ILMIAH FLORA SEARCH RESULT FOUND");
                                System.out.println("--------------------");
                                for (int i = 0; i < displayNamaIlmiahFlora.size(); i++) {
                                    displayNamaIlmiahFlora.get(i).display();
                                    ;
                                }
                            } else {
                                System.out.println("No entry found for FLORA with nama ilmiah " + searchNamaIlmiah);
                            }

                            // SEARCH NAMA ILMIAH FAUNA
                            ArrayList<fauna> displayNamaIlmiahFauna = new searchdata()
                                    .searchNamaIlmiah(searchNamaIlmiah, faun);
                            if (displayNamaIlmiahFauna != null && !displayNamaIlmiahFauna.isEmpty()) {
                                System.out.println("NAMA ILMIAH FAUNA SEARCH RESULT FOUND");
                                System.out.println("--------------------");
                                for (int i = 0; i < displayNamaIlmiahFauna.size(); i++) {
                                    displayNamaIlmiahFauna.get(i).display();
                                }
                            } else {
                                System.out.println("No entry found for FAUNA with nama ilmiah " + searchNamaIlmiah);
                            }
                            break;

                        default:
                            System.out.println("Invalid choice!");
                            break;
                    }

                    choice = 100;
                    break;

                case 4:
                    System.out.println("Exiting..");
                    reset = 0;

                    break;

                default:
                    System.out.println("");
                    break;
            }
        } while (reset == 1);

    }
}