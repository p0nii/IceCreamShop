import java.util.ArrayList;

public class Glass {

        private String färg;
        private String smak;
        private String beskrivning;
        private int pris;

        private ArrayList<String> smaker; //Så här skriver man Arraylist när man skriver classer/objekt.
        //Annars i Main classen så skriver man Arrayen fullständig.



        public Glass(String smak, int pris, String beskrivning, String färg) {
                this.smak = smak;
                this.pris = pris;
                this.beskrivning = beskrivning;
                this.färg = färg;

        }




        public String getFärg() {
                return färg;
        }

        public void setFärg(String färg) {
                this.färg = färg;
        }

        public String getGlass() {
                return smak;
        }

        public void setGlass(String smak) {
                this.smak = smak;
        }

        public String getBeskrivning() {
                return beskrivning;
        }

        public void setBeskrivning(String beskrivning) {
                this.beskrivning = beskrivning;
        }

        public int getPris() {
                return pris;
        }

        public void setPris(int pris) {
                this.pris = pris;
        }


}
