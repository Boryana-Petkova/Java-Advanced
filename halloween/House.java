package halloween;

import java.util.ArrayList;
import java.util.List;

public class House {
        private int capacity;
        private List<Kid> data;

        public House(int capacity) {
            this.capacity = capacity;
            this.data = new ArrayList<>();
        }

        public void addKid(Kid kid) {
            if (data.size() < capacity) {
                this.data.add(kid);
            }
        }

        public boolean removeKid(String name) {
            return this.data.removeIf(kid -> kid.getName().equals(name));
        }

        public Kid getKid(String street) {
            for (Kid kid : data) {
                if (kid.getStreet().equals(street)) {
                    return kid;
                }
            }
            return null;
        }

        public int getAllKids() {
            return this.data.size();
        }

        public String getStatistics() {
            StringBuilder statistics = new StringBuilder("Children who visited a house for candy:\n");
            for (Kid kid : data) {
                statistics.append("  ").append(kid).append("\n");
            }
            return statistics.toString().trim();
        }
}
