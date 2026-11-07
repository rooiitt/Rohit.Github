package com.kodewala.interfaces.java7;

public interface FileStorage {
	void saveFiles();

}

class LocalStorage implements FileStorage {

	@Override
	public void saveFiles() {
		System.out.println("LocalStorage");

	}

}

class Database implements FileStorage {

	@Override
	public void saveFiles() {
		System.out.println("Database");

	}

}
class NewStorage implements FileStorage{

	@Override
	public void saveFiles() {
		System.out.println("NewStorage");
		
	}
	
}

class CloudStorage implements FileStorage {

	@Override
	public void saveFiles() {
		System.out.println("CloudStorage");

	}

}

class MiantaningStorage { 
	void maintainigStorage(FileStorage filestorage) {
		filestorage.saveFiles(); // switch storage and we can call it pollymorphism
	}
}

class StorageDriver {
	public static void main(String[] args) {
		MiantaningStorage maintain = new MiantaningStorage();

		FileStorage f = new LocalStorage();
		maintain.maintainigStorage(f);

		FileStorage f1 = new Database();
		maintain.maintainigStorage(f1);

		FileStorage f2 = new CloudStorage();
		maintain.maintainigStorage(f2);
		
		FileStorage f3 = new NewStorage();
		maintain.maintainigStorage(f3);

	}
}
