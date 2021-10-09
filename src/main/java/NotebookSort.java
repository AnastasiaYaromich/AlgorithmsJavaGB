public class NotebookSort {
    private static Long time;

    public static void startTime() {
        time = System.currentTimeMillis();
    }

    public static void endTime() {
        time = System.currentTimeMillis() - time;
        System.out.println(time);
    }

    public static void bubbleSort(Notebook[] nb) {
        boolean isChange;
        int limit = nb.length;
        do {
            isChange = false;
            limit--;
            for (int i = 0; i < limit; i++) {
                if (nb[i].getPrice() > nb[i + 1].getPrice()) {
                    Notebook note = nb[i];
                    nb[i] = nb[i + 1];
                    nb[i + 1] = note;
                    isChange = true;
                }
                if (nb[i].getPrice() == nb[i + 1].getPrice()) {
                    if (nb[i].getRam() > nb[i + 1].getRam()) {
                        Notebook note = nb[i];
                        nb[i] = nb[i + 1];
                        nb[i + 1] = note;
                        isChange = true;
                    }
                }
                if (nb[i].getPrice() == nb[i + 1].getPrice() && nb[i].getRam() == nb[i + 1].getRam()) {
                    int index1 = Producer.valueOf(nb[i].getProd()).ordinal();
                    int index2 = Producer.valueOf(nb[i + 1].getProd()).ordinal();
                    if (index1 > index2) {
                        Notebook note = nb[i];
                        nb[i] = nb[i + 1];
                        nb[i + 1] = note;
                        isChange = true;
                    }
                }
            }
        } while (isChange);
    }
}
