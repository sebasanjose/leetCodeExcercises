import java.util.LinkedHashMap;
import java.util.Map;

public class LRU_Cache_146 {

    class LRUCache extends LinkedHashMap {
        private int capacity = 0;

        public LRUCache(int capacity) {
            super(capacity, 0.75F, true);
        }

        public int get(int key) {
            return (int) super.getOrDefault(key, -1);
        }

        public void put(int key, int value) {
            super.put(key, value);
        }

        @Override
        protected boolean removeEldestEntry(Map.Entry eldest){
            return size() > capacity;
        }

    }
}
