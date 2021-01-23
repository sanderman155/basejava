package ru.javaops.webapp.storage;

import ru.javaops.webapp.model.Resume;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapStorage extends AbstractStorage {
    private final Map<String, Resume> storage = new LinkedHashMap<>();


    @Override
    protected void deleteResume(Object key) {
        String uuid = (String) key;
        storage.remove(uuid);
    }

    @Override
    protected String getKey(String uuid) {
        return uuid;
    }

    @Override
    protected Resume getResume(Object key) {
        String uuid = (String) key;
        return storage.get(uuid);
    }

    @Override
    protected void updateResume(Object key, Resume resume) {
        String uuid = (String) key;
        storage.put(uuid, resume);
    }

    @Override
    protected boolean inStorage(Object key) {
        return storage.containsKey(key);
    }

    @Override
    protected void saveResume(Resume resume, Object key) {
        storage.put((String) key, resume);
    }

    @Override
    protected void clearStorage() {
        storage.clear();
    }

    @Override
    protected int getSize() {
        return storage.size();
    }

    @Override
    public Resume[] getAll() {
        return new Resume[0];
    }
}

