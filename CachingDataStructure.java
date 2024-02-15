//package org.example;
//
//import java.util.*;
//import java.util.concurrent.locks.*;
//import java.util.Optional;
//
////import sun.reflect.generics.reflectiveObjects.NotImplementedException;
//public class CachingDataStructure {
//    private int maxSize;
//    private TimeProvider timeProvider;
//    private Map<String, CacheEntry> cache;
//    private Lock lock = new ReentrantLock();
//
//    public CachingDataStructure(TimeProvider timeProvider, int maxSize) {
//        this.timeProvider = timeProvider;
//        this.maxSize = maxSize;
//        this.cache = new LinkedHashMap<>(maxSize, 0.75f, true);
//    }
//
//    public void put(String key, String value, long timeToLeaveInMilliseconds) {
//        if (key == null || value == null || timeToLeaveInMilliseconds <= 0) {
//            throw new IllegalArgumentException("Invalid input parameters.");
//        }
//
//        long currentTime = timeProvider.getMillis();
//        long expirationTime = currentTime + timeToLeaveInMilliseconds;
//
//        lock.lock();
//        try {
//            if (cache.size() >= maxSize) {
//                evictExpiredEntries();
//                if (cache.size() >= maxSize) {
//                    evictOldestEntry();
//                }
//            }
//            cache.put(key, new CacheEntry(value, expirationTime));
//        } finally {
//            lock.unlock();
//        }
//    }
//
//    public Optional<String> get(String key) {
//        if (key == null) {
//            throw new IllegalArgumentException("Invalid input parameter.");
//        }
//
//        lock.lock();
//        try {
//            CacheEntry entry = cache.get(key);
//            if (entry != null && !entry.isExpired()) {
//                return Optional.ofNullable(entry.getValue());
//            } else {
//                cache.remove(key);
//                return Optional.empty();
//            }
//        } finally {
//            lock.unlock();
//        }
//    }
//
//    public int size() {
//        lock.lock();
//        try {
//            evictExpiredEntries();
//            return cache.size();
//        } finally {
//            lock.unlock();
//        }
//    }
//
//    private void evictExpiredEntries() {
//        long currentTime = timeProvider.getMillis();
//        cache.entrySet().removeIf(entry -> entry.getValue().isExpired(currentTime));
//    }
//
//    private void evictOldestEntry() {
//        Iterator<Map.Entry<String, CacheEntry>> iterator = cache.entrySet().iterator();
//        if (iterator.hasNext()) {
//            iterator.next();
//            iterator.remove();
//        }
//    }
//
//    private class CacheEntry {
//        private String value;
//        private long expirationTime;
//
//        CacheEntry(String value, long expirationTime) {
//            this.value = value;
//            this.expirationTime = expirationTime;
//        }
//
//        String getValue() {
//            return value;
//        }
//
//        boolean isExpired() {
//            return isExpired(timeProvider.getMillis());
//        }
//
//        boolean isExpired(long currentTime) {
//            return currentTime >= expirationTime;
//        }
//    }
//}
//
