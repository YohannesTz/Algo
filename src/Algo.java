public class Algo {
    private int[] items;
    private int count;

    public Algo(int length) {
        items = new int[length];
    }

    public void print(){
        for(int i = 0; i < count; i++){
            System.out.println(items[i]);
        }
    }

    public void insert(int item){
        if (items.length == count) {
            int[] newItems = new int[count * 2];

            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }

            items = newItems;
        }

        items[count++] = item;
    }

    public void removeAt(int index){
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException();
        }

        for (int i = index; i < count; i++) {
            items[i] = items[i + 1];
        }

        count--;
    }

    public int search(int item) {
        int start, end, midPt;
        start = 0;
        end = items.length - 1;

        while (start <= end) {
            midPt = (start + end) /2;
            if (items[midPt] == item) {
                return midPt;
            } else if (items[midPt] < item) {
                start = midPt + 1;
            } else {
                end = midPt - 1;
            }
        }

        return -1;
    }

    public int[] bubbleSortAsc(){
        int swap;
        for(int i = 0; i < items.length - 1; i++){
            for(int j = 0; j < items.length - i - 1; j++){
                if (items[j] > items[j +1]) {
                    swap = items[j];
                    items[j] = items[j + 1];
                    items[j +1] = swap;
                }
            }
        }
        return items;
    }

    public int[] bubbleSortDsc(){
        int swap;
        for(int i = 0; i < items.length - 1; i++){
            for(int j = 0; j < items.length - i - 1; j++){
                if (items[j] < items[j +1]) {
                    swap = items[j];
                    items[j] = items[j + 1];
                    items[j +1] = swap;
                }
            }
        }
        return items;
    }

    public boolean contains(int item){
        int start, end, midPt;
        start = 0;
        end = items.length - 1;

        while (start <= end) {
            midPt = (start + end) /2;
            if (items[midPt] == item) {
                return true;
            } else if (items[midPt] < item) {
                start = midPt + 1;
            } else {
                end = midPt - 1;
            }
        }

        return false;
    }

    public int closestToZero(){
        int closestIndex = 0;
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < items.length; ++i) {
            int abs = Math.abs(items[i]);
            if (abs < diff) {
                closestIndex = i;
                diff = abs;
            } else if (abs == diff && items[i] > 0 && items[closestIndex] < 0) {
                closestIndex = i;
            }
        }

        return items[closestIndex];
    }

    public int closestToZeroIndex(){
        int closestIndex = 0;
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < items.length; ++i) {
            int abs = Math.abs(items[i]);
            if (abs < diff) {
                closestIndex = i;
                diff = abs;
            } else if (abs == diff && items[i] > 0 && items[closestIndex] < 0) {
                closestIndex = i;
            }
        }

        return closestIndex;
    }

    public int closestTo(int number){
        int distance = Math.abs(items[0] - number);
        int idx = 0;
        for (int i = 0; i < items.length; i++) {
            int cdistance = Math.abs(items[i] - number);
            if(cdistance < distance) {
                idx = i;
                distance = cdistance;
            }
        }
        return items[idx];
    }

    public int max(){
        int swap;
        for(int i = 0; i < items.length - 1; i++){
            for(int j = 0; j < items.length - i - 1; j++){
                if (items[j] > items[j +1]) {
                    swap = items[j];
                    items[j] = items[j + 1];
                    items[j +1] = swap;
                }
            }
        }
        return items[items.length - 1];
    }

    public int min(){
        int swap;
        for(int i = 0; i < items.length - 1; i++){
            for(int j = 0; j < items.length - i - 1; j++){
                if (items[j] < items[j +1]) {
                    swap = items[j];
                    items[j] = items[j + 1];
                    items[j +1] = swap;
                }
            }
        }
        return items[items.length - 1];
    }
}
